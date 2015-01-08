package com.bioneos.javafx.controller;

import com.bioneos.javafx.model.FxModel;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;

/**
 * <p>Controller class for our MVC organized example.
 *
 * @author sgdavis@bioneos.com
 */
public class BindingExController
{
  // Data models
  private FxModel inMemoryObj;
  // GUI Widgets
  @FXML private Label intLabel;
  @FXML private Slider intSlider;
  @FXML private TextField stringText;

  /**
   * <p>Internally called by JavaFX (see association in .fxml file, "fx:controller=" )
   */
  @FXML
  public void initialize()
  {
    System.out.println("OneBean Controller initializing...");

    // Create in-memory object with values
    inMemoryObj = new FxModel();
    inMemoryObj.setProp1(10);
    inMemoryObj.setProp2("Hello World!");

    //
    // Hook up GUI listeners

    // Integer (Property1):
    intSlider.valueProperty().bindBidirectional(inMemoryObj.prop1Property());
    // NOTE: This will fail, one Property is String, the other is Integer
    //intLabel.textProperty().bindBidirectional(guiInteger.valueProperty());
    // SOLUTION: Use utility packages to convert and bind
    Bindings.bindBidirectional(intLabel.textProperty(), inMemoryObj.prop1Property(), new NumberStringConverter());

    // String (Property2)
    stringText.textProperty().bindBidirectional(inMemoryObj.prop2Property());
  }

  /**
   * Output values to the console when the "Observe" button is pressed.
   */
  public void observe()
  {
    System.out.println("-----");
    System.out.println("inMemoryObj.prop1: " + inMemoryObj.getProp1());
    System.out.println("inMemoryObj.prop2: " + inMemoryObj.getProp2());
    System.out.println("");
    System.out.println("Textfield:  " + stringText.getText());
    System.out.println("Slider:     " + intSlider.getValue());
    System.out.println("Label:      " + intLabel.getText());
    System.out.println("");
  }
}
