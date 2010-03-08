package com.google.gwt.maps.client.base;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.impl.InfoWindowImpl;

public class InfoWindow implements HasInfoWindow {

  private JavaScriptObject jso;
  
  
  public InfoWindow(JavaScriptObject jso) {
    this.jso = jso;
  }
  
  public InfoWindow(HasInfoWindowOptions options) {
    this(InfoWindowImpl.impl.construct(options.getJso()));
  }
  
  public InfoWindow() {
    this(InfoWindowImpl.impl.construct());
  }

  @Override
  public void close() {
    InfoWindowImpl.impl.close(jso);
  }

  @Override
  public String getContent() {
    return InfoWindowImpl.impl.getContent(jso);
  }

  @Override
  public HasLatLng getPosition() {
    return new LatLng(InfoWindowImpl.impl.getPosition(jso));
  }

  @Override
  public int getZIndex() {
    return InfoWindowImpl.impl.getZIndex(jso);
  }

  @Override
  public void setContent(String html) {
    InfoWindowImpl.impl.setContent(jso, html);
  }

  @Override
  public void setOptions(HasInfoWindowOptions options) {
    InfoWindowImpl.impl.setOptions(jso, options.getJso());
  }

  @Override
  public void setPosition(HasLatLng position) {
    InfoWindowImpl.impl.setPosition(jso, position.getJso());
  }

  @Override
  public void setZIndex(int zIndex) {
    InfoWindowImpl.impl.setZIndex(jso, zIndex);
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
