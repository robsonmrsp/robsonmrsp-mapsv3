package com.google.gwt.maps.client.event;

import com.google.gwt.core.client.JavaScriptObject;

public class MapsEventListener implements HasMapsEventListener {

  final private JavaScriptObject jso;
  
  public MapsEventListener(JavaScriptObject jso) {
    this.jso = jso;
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
