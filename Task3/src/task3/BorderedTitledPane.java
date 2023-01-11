/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public class BorderedTitledPane extends StackPane {
    BorderedTitledPane(String titleString, Node content) {
      
    

      StackPane contentPane = new StackPane();
      content.setStyle("  -fx-border-width: 1;" );
     content.setStyle("  -fx-border-color: white;" );
     content.setStyle("-fx-background-color: #336699;" );
      contentPane.getChildren().add(content);

     setStyle("-fx-background-color: #336699;" );
     
     Label title = new Label(" " + "Day Time Clock" + " ");
     title.setTextFill(Color.WHITE);

     
        setStyle("  -fx-border-width: 1;" );
        setStyle("  -fx-border-color: white;" );
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

      getChildren().addAll( contentPane,stackPane);
    }
  }
