package com.bioneos.javafx.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * <p>Class to demonstrate the power of using JavaFX 2-way data binding.
 *
 * <p>Created by sgdavis on 1/7/15.
 * @author sgdavis@bioneos.com
 */
public class FxModel
{
  private IntegerProperty prop1 = new SimpleIntegerProperty();
  private StringProperty prop2 = new SimpleStringProperty();

  /** Getter / Setter / Property methods created per JavaFX conventions **/
  public int getProp1() { return prop1.getValue().intValue(); }
  public void setProp1(int value) { this.prop1.setValue(value); }
  public IntegerProperty prop1Property() { return prop1; }

  public String getProp2() { return prop2.getValue(); }
  public void setProp2(String value) { this.prop2.setValue(value); }
  public StringProperty prop2Property() { return prop2; }
}
