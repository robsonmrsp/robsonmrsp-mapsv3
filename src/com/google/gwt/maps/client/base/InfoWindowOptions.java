package com.google.gwt.maps.client.base;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.impl.InfoWindowOptionsImpl;

public class InfoWindowOptions implements HasInfoWindowOptions {

  final private JavaScriptObject jso;
  
  public InfoWindowOptions(JavaScriptObject jso) {
    this.jso = jso;
  }
  
  public InfoWindowOptions() {
    this(InfoWindowOptionsImpl.impl.construct());
  }
  
  @Override
  public String getContent() {
    return InfoWindowOptionsImpl.impl.getContent(jso);
  }

  @Override
  public int getMaxWidth() {
    return InfoWindowOptionsImpl.impl.getMaxWidth(jso);
  }

  @Override
  public HasSize getPixelOffset() {
    return new Size(InfoWindowOptionsImpl.impl.getPixelOffset(jso));
  }

  @Override
  public HasLatLng getPosition() {
    return new LatLng(InfoWindowOptionsImpl.impl.getPosition(jso));
  }

  @Override
  public int getZIndex() {
    return InfoWindowOptionsImpl.impl.getZIndex(jso);
  }

  @Override
  public boolean isDisableAutoPan() {
    return InfoWindowOptionsImpl.impl.isDisableAutoPan(jso);
  }

  @Override
  public void setContent(String html) {
    InfoWindowOptionsImpl.impl.setContent(jso, html);
  }

  @Override
  public void setDisableAutoPan(boolean disableAutoPan) {
    InfoWindowOptionsImpl.impl.setDisableAutoPan(jso, disableAutoPan);
  }

  @Override
  public void setMaxWidth(int maxWidth) {
    InfoWindowOptionsImpl.impl.setMaxWidth(jso, maxWidth);
  }

  @Override
  public void setPixelOffset(HasSize size) {
    InfoWindowOptionsImpl.impl.setPixelOffset(jso, size.getJso());
  }

  @Override
  public void setPosition(HasLatLng position) {
    InfoWindowOptionsImpl.impl.setPosition(jso, position.getJso());
  }

  @Override
  public void setZIndex(int zIndex) {
    InfoWindowOptionsImpl.impl.setZIndex(jso, zIndex);
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
