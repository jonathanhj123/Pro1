package EX4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
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
        /*int x = 100;
        int y = 100;
        int z = 99;
        int i = 0;


         /*while (i < 8) {
            Circle circle = new Circle(x, y, z);
            circle.setFill(null);
            circle.setStroke(Color.BLACK);
            pane.getChildren().add(circle);
           // x -= 10;
            z -= 13;
            i++;
        }
          */
        int center1 = 100;
        int center2 = 100;
        int x = 25;
        int y = 60;
        int i = 0;

        while (i < 8) {
            Ellipse ellipse = new Ellipse(center1, center1, x, y);
            ellipse.setStroke(Color.BLACK);
            ellipse.setFill(null);
            ellipse.setStrokeWidth(1);
            pane.getChildren().add(ellipse);
            x += 10;
            i++;
        }
    }
}