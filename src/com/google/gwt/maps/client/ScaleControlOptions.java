package com.google.gwt.maps.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.impl.ControlPositionImpl;
import com.google.gwt.maps.client.impl.ScaleControlOptionsImpl;
import com.google.gwt.maps.client.impl.ScaleControlStyleImpl;

public class ScaleControlOptions implements HasScaleControlOptions {

  final private JavaScriptObject jso;
  final private ControlPositionImpl controlPositionImpl;
  final private ScaleControlStyleImpl scaleControlStyleImpl;
  
  public ScaleControlOptions(JavaScriptObject jso, ControlPositionImpl controlPositionImpl,
      ScaleControlStyleImpl scaleControlStyleImpl) {
    this.jso = jso;
    this.controlPositionImpl = controlPositionImpl;
    this.scaleControlStyleImpl = scaleControlStyleImpl;
  }
  
  public ScaleControlOptions(ControlPositionImpl controlPositionImpl,
      ScaleControlStyleImpl scaleControlStyleImpl) {
    this(ScaleControlOptionsImpl.impl.construct(), controlPositionImpl, scaleControlStyleImpl);
  }
  
  @Override
  public void setPosition(ControlPosition position) {
    ScaleControlOptionsImpl.impl.setPosition(jso, controlPositionImpl.getValue(position));
  }

  @Override
  public void setStyle(ScaleControlStyle style) {
    ScaleControlOptionsImpl.impl.setStyle(jso, scaleControlStyleImpl.getValue(style));
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
