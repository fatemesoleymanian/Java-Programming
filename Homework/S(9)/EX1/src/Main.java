import controller.GetInfo;
import controller.InfoForm;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application  {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/GetInfo.fxml"));
        primaryStage.setTitle("Inserted Information");
        primaryStage.setScene(new Scene(root, 682, 462));
        primaryStage.show();
        Parent root2 = FXMLLoader.load(getClass().getClassLoader().getResource("view/InfoForm.fxml"));
        primaryStage.setTitle("Information Form");
        primaryStage.setScene(new Scene(root2, 546, 869));
        primaryStage.show();}


        public static void main(String[] args) {
            InfoForm infoForm=new InfoForm();
            GetInfo getInfo=new GetInfo();
             Text text= new Text();
             Thread thread1=new Thread(infoForm);
             Thread thread2=new Thread(getInfo);
             Thread thread3=new Thread(text);
             thread1.start();
             thread2.start();
        thread3.start();
        launch(args);



    }
}



