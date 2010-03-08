package com.google.gwt.maps.client.base.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface InfoWindowImpl extends JSFlyweightWrapper {
  
  public InfoWindowImpl impl = GWT.create(InfoWindowImpl.class);
  
  @Constructor("$wnd.google.maps.InfoWindow")
  public JavaScriptObject construct();
  
  @Constructor("$wnd.google.maps.InfoWindow")
  public JavaScriptObject construct(JavaScriptObject options);

  public void close(JavaScriptObject jso);
  
  public String getContent(JavaScriptObject jso);
  
  public JavaScriptObject getPosition(JavaScriptObject jso);
  
  public int getZIndex(JavaScriptObject jso);
  
  public void setContent(JavaScriptObject jso, String html);
  
  public void setOptions(JavaScriptObject jso, JavaScriptObject options);
  
  public void setPosition(JavaScriptObject jso, JavaScriptObject position);
  
  public void setZIndex(JavaScriptObject jso, int zIndex);

}
