package artmasterstudio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/**
 *
 * @author DELL
 */
public class ArtMasterApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ArtMaster Studio");

        BorderPane root = new BorderPane();
        // Initialize components (canvas, toolbar, etc.)

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
