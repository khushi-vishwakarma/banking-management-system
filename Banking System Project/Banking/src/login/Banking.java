/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Dell
 */
public class Banking extends Application {
    public static Stage stage= null;
    
    private double xOffset = 0;
     private double yOffset = 0;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/design/design.css").toExternalForm());
        stage.initStyle(StageStyle.UNDECORATED);
        
        stage.setScene(scene);
        
        root.setOnMousePressed(new EventHandler<MouseEvent>());{
          @Override
            public void handle(MouseEvent event) {
                xoffset=event.getSceneX();
                yoffset=event.getSceneY();
            }
        
        
        });
        
          root.setOnMouseDragged(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX()- xoffset);
                stage.setY(event.getScreenY()- yoffset);
            }
        
        
        });
        this.stage = stage;
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
