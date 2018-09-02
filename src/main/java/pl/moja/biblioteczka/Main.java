package pl.moja.biblioteczka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) throws Exception {

 //       Locale.setDefault(new Locale("en"));

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/BorderPaneMain.fxml"));
 //       BorderPane borderPane = loader.load();
//        Scene scene = new Scene(borderPane);
        ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages");
        loader.setResources(bundle);
        primaryStage.setScene(new Scene((BorderPane)loader.load()));
        primaryStage.setTitle(bundle.getString("title.application"));
        primaryStage.show();
    }
}
