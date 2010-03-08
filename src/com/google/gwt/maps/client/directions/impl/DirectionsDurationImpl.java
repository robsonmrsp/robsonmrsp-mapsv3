package com.google.gwt.maps.client.directions.impl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

@BeanProperties
public interface DirectionsDurationImpl extends JSFlyweightWrapper {

  public String getText(JavaScriptObject jso);
  
  public double getValue(JavaScriptObject jso);
  
}
