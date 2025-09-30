package EX3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
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
/*
        int x1 = 10;
        int y1 = 10;
        int x2 = 10;
        int y2 = 175;

        int i = 0;
        while (i < 5)
        {
            Line line = new Line(x1, y1, x2, y2);
            pane.getChildren().add(line);
            x1 += 40;
            x2 += 40;
            i++;
        }


        int x1 = 10;
        int y1 = 20;
        int x2 = 175;
        int y2 = 20;
        int i = 0;

        while (i < 5) {
            Line line = new Line(x1, y1, x2, y2);
            pane.getChildren().add(line);
            y1 += 40;
            y2 += 40;
            i++;
*/

        int x1 = 80;
        int y1 = 20;
        int x2 = 110;
        int y2 = 20;
        int i = 0;

        while (i < 5) {
            Line line = new Line(x1, y1, x2, y2);
            pane.getChildren().add(line);
            y1 += 40;
            y2 += 40;
            x1 -= 15;
            x2 += 15;
            i++;

        }




    }
}
