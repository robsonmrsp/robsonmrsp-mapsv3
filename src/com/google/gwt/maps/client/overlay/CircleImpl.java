package com.google.gwt.maps.client.overlay;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface CircleImpl extends JSFlyweightWrapper {

  public CircleImpl impl = GWT.create(CircleImpl.class);
  
  @Constructor("$wnd.google.maps.Circle")
  public JavaScriptObject construct();

  @Constructor("$wnd.google.maps.Circle")
  public JavaScriptObject construct(JavaScriptObject circleOptions);

  public JavaScriptObject getCenter(JavaScriptObject jso);
  
  public JavaScriptObject getMap(JavaScriptObject jso);
  
  public double getRadius(JavaScriptObject jso);
  
  public void setCenter(JavaScriptObject jso, JavaScriptObject center);
  
  public void setMap(JavaScriptObject jso, JavaScriptObject map);
  
  public void setRadius(JavaScriptObject jso, double radius);
}
