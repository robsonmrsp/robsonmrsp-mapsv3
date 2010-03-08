package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

@BeanProperties
public interface NavigationControlOptionsImpl extends JSFlyweightWrapper {
  
  NavigationControlOptionsImpl impl = GWT.create(NavigationControlOptionsImpl.class);
  
  @Constructor("Object")
  public JavaScriptObject construct();

  void setPosition(JavaScriptObject jso, int position);
  
  void setStyle(JavaScriptObject jso, int style);

}
