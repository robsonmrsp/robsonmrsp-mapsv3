package com.google.gwt.maps.client.base.impl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface PointImpl extends JSFlyweightWrapper {

  @Constructor("$wnd.google.maps.Point")
  public JavaScriptObject construct(int x, int y);
  
  public boolean equals(JavaScriptObject jso, JavaScriptObject other);
  
  public String toString(JavaScriptObject jso);
  
  @BeanProperties
  public int getX(JavaScriptObject jso);
  
  @BeanProperties
  public int getY(JavaScriptObject jso);
  
}
