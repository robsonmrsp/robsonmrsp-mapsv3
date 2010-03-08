package com.google.gwt.maps.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.impl.ControlPositionImpl;
import com.google.gwt.maps.client.impl.NavigationControlOptionsImpl;
import com.google.gwt.maps.client.impl.NavigationControlStyleImpl;

public class NavigationControlOptions implements HasNavigationControlOptions {

  final private JavaScriptObject jso;
  final private ControlPositionImpl controlPositionImpl;
  final private NavigationControlStyleImpl navigationControlStyleImpl;
  
  public NavigationControlOptions(JavaScriptObject jso, ControlPositionImpl controlPositionImpl,
      NavigationControlStyleImpl navigationControlStyleImpl) {
    this.jso = jso;
    this.controlPositionImpl = controlPositionImpl;
    this.navigationControlStyleImpl = navigationControlStyleImpl;
  }
  
  public NavigationControlOptions(ControlPositionImpl controlPositionImpl,
      NavigationControlStyleImpl navigationControlStyleImpl) {
    this(NavigationControlOptionsImpl.impl.construct(),
        controlPositionImpl, navigationControlStyleImpl);
  }
  
  @Override
  public void setPosition(ControlPosition position) {
    NavigationControlOptionsImpl.impl.setPosition(jso,
        controlPositionImpl.getValue(position));
  }

  @Override
  public void setStyle(NavigationControlStyle style) {
    NavigationControlOptionsImpl.impl.setStyle(jso,
        navigationControlStyleImpl.getValue(style));
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
