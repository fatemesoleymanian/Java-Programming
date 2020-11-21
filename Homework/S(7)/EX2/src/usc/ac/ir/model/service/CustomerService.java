package usc.ac.ir.model.service;
import usc.ac.ir.model.repository.CustomerRepo;
import usc.ac.ir.model.enyity.Customerentity;
import java.util.List;
public class CustomerService {
    private CustomerService(){}
    private static CustomerService customerService=new CustomerService();
    public static CustomerService getInstance() {
        return customerService;
    }


    public void saveCar1 (Customerentity customerentity) throws Exception {
        try (CustomerRepo customerRepo = new CustomerRepo ()) {
            customerentity.setCar ("Praide");
            customerentity.setCarSituation ("is reserved by you.");
            customerentity.setColor ("sefid");
            customerentity.setCost (customerentity.getCost () + (customerentity.getCost () * 20 / 100));
            customerRepo.insertCar (customerentity);

                customerRepo.commit ();

        }
    }
    public void saveCar2 (Customerentity customerentity) throws Exception {
        try (CustomerRepo customerRepo = new CustomerRepo ()) {
            customerentity.setCar ("Tiba2");
            customerentity.setCarSituation ("is reserved by you.");
            customerentity.setColor ("meshki");
            customerentity.setCost (customerentity.getCost () + (customerentity.getCost () * 20 / 100));
            customerRepo.insertCar (customerentity);

            customerRepo.commit ();

        }
    }


    public List<Customerentity> report() throws Exception{
        List<Customerentity> customerEntis;
        try (CustomerRepo customerRepo=new CustomerRepo ()){
            customerEntis=customerRepo.selectBoth ();
        }
        return customerEntis;
    }




}
