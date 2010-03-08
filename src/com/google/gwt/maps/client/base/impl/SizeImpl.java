package com.google.gwt.maps.client.base.impl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface SizeImpl extends JSFlyweightWrapper {

  @Constructor("$wnd.google.maps.Size")
  public JavaScriptObject construct(int width, int height);
  
  public boolean equals(JavaScriptObject jso, JavaScriptObject other);
  
  public String toString(JavaScriptObject jso);
  
  @BeanProperties
  public int getHeight(JavaScriptObject jso);
  
  @BeanProperties
  public int getWidth(JavaScriptObject jso);
  
}
