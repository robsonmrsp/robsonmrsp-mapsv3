package com.google.gwt.maps.client.event;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.event.impl.MouseEventImpl;

public class MouseEvent implements HasMouseEvent {

  final private JavaScriptObject jso;
  
  public MouseEvent(JavaScriptObject jso) {
    this.jso = jso;
  }
  
  @Override
  public HasLatLng getLatLng() {
    return new LatLng(MouseEventImpl.impl.getLatLng(jso));
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
