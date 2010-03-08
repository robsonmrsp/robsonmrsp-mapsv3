package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

@BeanProperties
public interface ScaleControlOptionsImpl extends JSFlyweightWrapper {

  ScaleControlOptionsImpl impl = GWT.create(ScaleControlOptionsImpl.class);
  
  @Constructor("Object")
  JavaScriptObject construct();
  
//  int getPosition(JavaScriptObject jso);
//  
//  JavaScriptObject getStyle(JavaScriptObject jso);
  
  void setPosition(JavaScriptObject jso, int position);
  
  void setStyle(JavaScriptObject jso, int style);

}
