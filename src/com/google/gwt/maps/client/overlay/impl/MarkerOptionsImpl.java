package com.google.gwt.maps.client.overlay.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

@BeanProperties
public interface MarkerOptionsImpl extends JSFlyweightWrapper {

  MarkerOptionsImpl impl = GWT.create(MarkerOptionsImpl.class);
  
  @Constructor("Object")
  JavaScriptObject construct();
  
  boolean isClickable(JavaScriptObject jso);

  void setClickable(JavaScriptObject jso, boolean clickable);

  String getCursor(JavaScriptObject jso);

  void setCursor(JavaScriptObject jso, String cursor);

  boolean isDraggable(JavaScriptObject jso);

  void setDraggable(JavaScriptObject jso, boolean draggable);

  boolean isFlat(JavaScriptObject jso);

  void setFlat(JavaScriptObject jso, boolean flat);

  JavaScriptObject getMap(JavaScriptObject jso);

  void setMap(JavaScriptObject jso, JavaScriptObject map);

  JavaScriptObject getPosition(JavaScriptObject jso);

  void setPosition(JavaScriptObject jso, JavaScriptObject position);

  String getTitle(JavaScriptObject jso);

  void setTitle(JavaScriptObject jso, String title);

  boolean isVisible(JavaScriptObject jso);

  void setVisible(JavaScriptObject jso, boolean visible);

  int getzIndex(JavaScriptObject jso);

  void setzIndex(JavaScriptObject jso, int zIndex);

}
