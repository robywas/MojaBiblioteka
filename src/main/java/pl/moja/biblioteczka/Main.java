package pl.moja.biblioteczka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/BorderPaneMain.fxml"));
 //       BorderPane borderPane = loader.load();
//        Scene scene = new Scene(borderPane);
        primaryStage.setScene(new Scene((BorderPane)loader.load()));
        primaryStage.setTitle("Moja Biblioteka");
        primaryStage.show();
    }
}
