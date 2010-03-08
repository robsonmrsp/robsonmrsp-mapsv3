package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface MapCanvasProjectionImpl extends JSFlyweightWrapper {

  MapCanvasProjectionImpl impl = GWT.create(MapCanvasProjectionImpl.class);
  
  JavaScriptObject fromContainerPixelToLatLng(JavaScriptObject jso, JavaScriptObject pixel);
  
  JavaScriptObject fromDivPixelToLatLng(JavaScriptObject jso, JavaScriptObject pixel);
  
  JavaScriptObject fromLatLngToContainerPixel(JavaScriptObject jso, JavaScriptObject latLng);
  
  JavaScriptObject fromLatLngToDivPixel(JavaScriptObject jso, JavaScriptObject latLng);
  
  int getWorldWidth(JavaScriptObject jso);
  
}
