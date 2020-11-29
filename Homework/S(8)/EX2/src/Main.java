

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/SignIn.fxml"));
        primaryStage.setTitle("Signing In");
        primaryStage.setScene(new Scene(root, 495, 413));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
