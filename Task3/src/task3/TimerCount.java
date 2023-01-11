/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.awt.event.MouseEvent;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;


public class TimerCount extends StackPane{
    Timeline timeline;
    int hours = 0, mins = 0, secs = 0;
    TimerCount(){
        HBox grid = new HBox();
        grid.setPadding(new Insets(40,50,20,50));
        grid.setStyle("  -fx-border-width: 1;" );
        grid.setStyle("  -fx-border-color: white;" );
        Label lbl = new Label("00:00:00"); 
        lbl.setStyle("-fx-font-size: 26pt;");
        lbl.setTextFill(Color.RED);
        Timeline timeline;
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
            	change(lbl);
			}
		}));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.setAutoReverse(false);
        grid.setSpacing(50);
        Button start = new Button();
      
        start.setText("Start");
        start.setPrefSize(60, 25);
        start.setTextFill(Color.WHITE);
        start.setBorder(new Border(new BorderStroke(Color.WHITE, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        start.setStyle("  -fx-border-color: white;" );
        start.setStyle("  -fx-border-width: 1;" );
        start.setStyle("-fx-background-color: blue;" );
        //start.setOnAction(new Event);

        start.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
               timeline.play();
             }
        });
        
        Button stop = new Button();
        stop.setPrefSize(60, 25);
        stop.setTextFill(Color.WHITE);
        stop.setBorder(new Border(new BorderStroke(Color.WHITE, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        stop.setText("Stop");
        stop.setStyle("  -fx-border-color: white;" );
        stop.setStyle("  -fx-border-width: 5;" );
        stop.setStyle("-fx-background-color: blue;" );
        stop.setOnAction((ActionEvent event) -> {
            timeline.pause();
        });
        
        Button reset = new Button();
        reset.setTextFill(Color.WHITE);
        reset.setPrefSize(60, 25);
        reset.setText("Reset");
        reset.setBorder(new Border(new BorderStroke(Color.WHITE, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        reset.setStyle("-fx-focus-color: transparent;");
        reset.setStyle("-fx-border-color: white;" );
        reset.setStyle("-fx-border-width:5;" );
        
        reset.setStyle("-fx-background-color: blue;" );
        reset.setOnAction((ActionEvent event) -> {
            mins = 0;
            secs = 0;
            hours = 0;
            timeline.pause();
            lbl.setText("00:00:00");
        });
        VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(-20,0,0,0));
        vbox.getChildren().addAll(start,stop,reset);
        grid.getChildren().addAll(lbl,vbox);
        
        Label title = new Label(" " + "Elapsed Time" + " ");
        title.setTextFill(Color.WHITE);
        StackPane.setAlignment(title, Pos.TOP_LEFT);
        StackPane stackPane = new StackPane();

        title.setStyle("-fx-background-color: white;" );
        //title.setStyle("-fx-background-insets: 10 0 0 20 " );
        title.setStyle("-fx-translate-y: -8;" );
        Rectangle rectangle = new Rectangle();
        rectangle.setFill(Color.valueOf("#336699"));
        
        rectangle.setStyle("-fx-translate-y: -8;" );
        rectangle.widthProperty().bind(title.widthProperty());
        rectangle.heightProperty().bind(title.heightProperty());
        
        StackPane.setAlignment(rectangle, Pos.TOP_LEFT);
        stackPane.getChildren().addAll(rectangle, title);

        getChildren().addAll( grid,rectangle,title);
        
    }
    void change(Label text) {
		if(mins == 60) {
			hours++;
			mins = 0;
		}
		if(secs == 60) {
			mins++;
			secs = 0;
		}
		text.setText((((hours/10) == 0) ? "0" : "") + hours + ":"
		 + (((mins/10) == 0) ? "0" : "") + mins + ":" 
			+ (((secs/10) == 0) ?  "0" : "") + secs++);
    }
}
