package com.google.gwt.maps.client.base.impl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface LatLngBoundsImpl extends JSFlyweightWrapper {

  @Constructor("$wnd.google.maps.LatLngBounds")
  public JavaScriptObject construct();
  
  @Constructor("$wnd.google.maps.LatLngBounds")
  public JavaScriptObject construct(JavaScriptObject sw, JavaScriptObject ne);
  
  public boolean contains(JavaScriptObject jso, JavaScriptObject point);
  
  public boolean equals(JavaScriptObject jso, JavaScriptObject other);
  
  public JavaScriptObject extend(JavaScriptObject jso, JavaScriptObject point);
  
  public JavaScriptObject getCenter(JavaScriptObject jso);
  
  public JavaScriptObject getNorthEast(JavaScriptObject jso);
  
  public JavaScriptObject getSouthWest(JavaScriptObject jso);
  
  public boolean intersects(JavaScriptObject jso, JavaScriptObject other);
  
  public boolean isEmpty(JavaScriptObject jso);
  
  public JavaScriptObject toSpan(JavaScriptObject jso);
  
  public String toString(JavaScriptObject jso);
  
  public String toUrlValue(JavaScriptObject jso);
  
  public String toUrlValue(JavaScriptObject jso, int precision);
  
  public JavaScriptObject union(JavaScriptObject jso, JavaScriptObject other);
  
}
