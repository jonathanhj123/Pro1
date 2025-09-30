package EX1;

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

        int x = 100;
        int y = 75;
        int dy = 8;
        Line line = new Line(x,y,x + 10, y-dy);
        Line line1 = new Line(x,y,x + 10, y+dy);

        y = 125;
        Line line3 = new Line(x,y,x + 10, y-dy);
        Line line4 = new Line(x,y,x + 10, y+dy);

        x = 20;
        y = 50;
        Line line5 = new Line(x,y,x + 10, y-dy);
        Line line6 = new Line(x,y,x + 10, y+dy);
        pane.getChildren().addAll(line, line1, line3, line4, line5, line6 );
    }
}
