package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

@BeanProperties
public interface MapTypeControlOptionsImpl extends JSFlyweightWrapper {

  MapTypeControlOptionsImpl impl = GWT.create(MapTypeControlOptionsImpl.class);
  
  @Constructor("Object")
  JavaScriptObject construct();
  
  void setMapTypeIds(JavaScriptObject jso, JsArrayString mapTypeIds);
  
  void setPosition(JavaScriptObject jso, int position);
  
  void setStyle(JavaScriptObject jso, int style);
  
}
