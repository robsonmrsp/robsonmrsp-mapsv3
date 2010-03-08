package com.google.gwt.maps.client.directions.impl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.JSFlyweightWrapper;
import com.google.gwt.jsio.client.JSList;

@BeanProperties
public interface DirectionsTripImpl extends JSFlyweightWrapper {

  public String getCopyrights(JavaScriptObject jso);
  
  public JSList<JavaScriptObject> getRoutes(JavaScriptObject jso);
  
  public JSList<String> getWarnings(JavaScriptObject jso);

}
