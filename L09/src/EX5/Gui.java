package EX5;

import com.sun.javafx.scene.traversal.SubSceneTraversalEngine;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops"); // may be changed
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(200, 200); // may be changed
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {

        int x = 15;
        int y = 20;
        int i = 0;
        String str = "Datamatiker";

        while (i < 12) {
            Text text = new Text(x, y, str.substring(0,i));
            pane.getChildren().add(text);
            y += 10;
            i++;
        }

    }
}
