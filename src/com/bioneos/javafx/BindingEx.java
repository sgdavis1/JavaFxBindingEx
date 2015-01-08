package com.bioneos.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * <p>Application class containing our main method.
 * @author sgdavis@bioneos.com
 */
public class BindingEx extends Application
{
  /**
   * JavaFX entry point.
   * @param primaryStage
   *   Initial Stage created by JRE.
   */
  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Parent root = FXMLLoader.load(getClass().getResource("gui/BindingEx.fxml"));
    primaryStage.setTitle("JavaFX Data Binding Example");
    primaryStage.setScene(new Scene(root, 300, 275));
    primaryStage.show();
  }

  /**
   * Main method. Can modify behavior based on command line args.
   */
  public static void main(String[] args)
  {
    launch(args);
  }
}
