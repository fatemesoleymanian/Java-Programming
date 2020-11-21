package usc.ac.ir.model.repository;
import usc.ac.ir.model.enyity.Customerentity;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CustomerRepo implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement1;

    private PreparedStatement preparedStatement2;
     public CustomerRepo()throws Exception{
         Class.forName ("oracle.jdbc.driver.OracleDriver");
         connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hanie", "h13");
         connection.setAutoCommit (false);
     }
    public void insertOwner(Customerentity customerentity) throws Exception{
        preparedStatement1=connection.prepareStatement ("INSERT INTO carowner(name, nationalcode, password) VALUES (,?,?,?)");
        preparedStatement1.setString (1,customerentity.getName());
        preparedStatement1.setInt(2,customerentity.getNationalCode());
        preparedStatement1.setString (3,customerentity.getPassword());
        preparedStatement1.executeUpdate ();
    }
    public void insertCar(Customerentity customerentity) throws Exception{
        preparedStatement2=connection.prepareStatement ("INSERT INTO cardescription(passwors, car,carsituation,cost,color ) VALUES (?,?,?,?,?)");
        preparedStatement2.setString (1,customerentity.getPassword());
        preparedStatement2.setString (2,customerentity.getCar());
        preparedStatement2.setString (3,customerentity.getCarSituation());
        preparedStatement2.setFloat (4,customerentity.getCost());
        preparedStatement2.setString (5,customerentity.getColor());
        preparedStatement2.executeUpdate ();
    }
    public List<Customerentity> selectBoth() throws Exception{
        preparedStatement1=connection.prepareStatement ("SELECT * FROM carowner where nationalcode=?");
        Customerentity customerentity=new Customerentity();
        preparedStatement1.setLong(1,customerentity.getNationalCode());
        ResultSet resultSet=preparedStatement1.executeQuery ();
        preparedStatement2=connection.prepareStatement ("SELECT * FROM cardescription where password=?");

        preparedStatement2.setString(1,customerentity.getPassword());
         resultSet=preparedStatement2.executeQuery ();
        List<Customerentity> customerEntiList=new ArrayList <> ();
        while (resultSet.next ()){
            Customerentity customerEnti=new Customerentity ();
            customerEnti.setName (resultSet.getString("name"));
            customerEnti.setNationalCode (resultSet.getInt ("nationalcode"));
            customerEnti.setPassword (resultSet.getString ("password"));
            customerEnti.setCar (resultSet.getString("car"));
            customerEnti.setCarSituation (resultSet.getString("carsituation"));
            customerEnti.setCost (resultSet.getFloat("cost"));
            customerEnti.setColor(resultSet.getString("color"));
            customerEntiList.add (customerEnti);
        }
        return customerEntiList;



    }
    public void commit() throws Exception{
        connection.commit ();
    }

    @Override
    public void close() throws Exception {
        preparedStatement1.close ();
        preparedStatement2.close ();
        connection.close ();

    }
}
