package CityTech.gui.gpacalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GPACalculatorMain extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        String name = "GPACalculatorView.fxml";
        Parent root = FXMLLoader.load(getClass().getResource(name));
        stage.setScene(new Scene(root));
        stage.setTitle("Grade Calculator by Homan Wong");
        stage.show();
    }

    //use inheritance
}
