package com.google.gwt.maps.client.base.impl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface LatLngImpl extends JSFlyweightWrapper {

  @Constructor("$wnd.google.maps.LatLng")
  public JavaScriptObject construct(double lat, double lng);

  @Constructor("$wnd.google.maps.LatLng")
  public JavaScriptObject construct(double lat, double lng, boolean noWrap);
  
  public double lat(JavaScriptObject jso);
  
  public double lng(JavaScriptObject jso);
  
  public String toString(JavaScriptObject jso);
  
  public String toUrlValue(JavaScriptObject jso);
  
  public String toUrlValue(JavaScriptObject jso, int precision);
  
  public boolean equals(JavaScriptObject jso, JavaScriptObject other);
}
