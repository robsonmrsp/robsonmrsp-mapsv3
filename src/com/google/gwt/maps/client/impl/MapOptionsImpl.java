package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

@BeanProperties
public interface MapOptionsImpl extends JSFlyweightWrapper {

  MapOptionsImpl impl = GWT.create(MapOptionsImpl.class);
  
  @Constructor("Object")
  JavaScriptObject construct();

  String getBackgroundColor(JavaScriptObject jso);

  void setBackgroundColor(JavaScriptObject jso, String backgroundColor);

  JavaScriptObject getCenter(JavaScriptObject jso);

  void setCenter(JavaScriptObject jso, JavaScriptObject center);

  boolean isDisableDefaultUI(JavaScriptObject jso);

  void setDisableDefaultUI(JavaScriptObject jso, boolean disableDefaultUI);

  boolean isDisableDoubleClickZoom(JavaScriptObject jso);

  void setDisableDoubleClickZoom(JavaScriptObject jso, boolean disableDoubleClickZoom);

  boolean isDraggable(JavaScriptObject jso);

  void setDraggable(JavaScriptObject jso, boolean draggable);

  String getDraggableCursor(JavaScriptObject jso);

  void setDraggableCursor(JavaScriptObject jso, String draggableCursor);

  String getDraggingCursor(JavaScriptObject jso);

  void setDraggingCursor(JavaScriptObject jso, String draggingCursor);

  boolean isKeyboardShortcuts(JavaScriptObject jso);

  void setKeyboardShortcuts(JavaScriptObject jso, boolean keyboardShortcuts);

  boolean isMapTypeControl(JavaScriptObject jso);

  void setMapTypeControl(JavaScriptObject jso, boolean mapTypeControl);

  JavaScriptObject getMapTypeControlOptions(JavaScriptObject jso);

  void setMapTypeControlOptions(JavaScriptObject jso, JavaScriptObject mapTypeControlOptions);

  String getMapTypeId(JavaScriptObject jso);

  void setMapTypeId(JavaScriptObject jso, String mapTypeId);

  boolean isNavigationControl(JavaScriptObject jso);

  void setNavigationControl(JavaScriptObject jso, boolean navigationControl);

  JavaScriptObject getNavigationControlOptions(JavaScriptObject jso);

  void setNavigationControlOptions(JavaScriptObject jso, JavaScriptObject navigationControlOptions);

  boolean isNoClear(JavaScriptObject jso);

  void setNoClear(JavaScriptObject jso, boolean noClear);

  boolean isScaleControl(JavaScriptObject jso);

  void setScaleControl(JavaScriptObject jso, boolean scaleControl);

  JavaScriptObject getScaleControlOptions(JavaScriptObject jso);

  void setScaleControlOptions(JavaScriptObject jso, JavaScriptObject scaleControlOptions);

  boolean isScrollwheel(JavaScriptObject jso);

  void setScrollwheel(JavaScriptObject jso, boolean scrollwheel);

  int getZoom(JavaScriptObject jso);

  void setZoom(JavaScriptObject jso, int zoom);
  
}
