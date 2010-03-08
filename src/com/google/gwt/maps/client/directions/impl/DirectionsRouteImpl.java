package com.google.gwt.maps.client.directions.impl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.FieldName;
import com.google.gwt.jsio.client.JSFlyweightWrapper;
import com.google.gwt.jsio.client.JSList;

@BeanProperties
public interface DirectionsRouteImpl extends JSFlyweightWrapper {

  @BeanProperties
  public JavaScriptObject getDistance(JavaScriptObject jso);
  
  @BeanProperties
  public JavaScriptObject getDuration(JavaScriptObject jso);
  
  @BeanProperties
  @FieldName("end_geocode")
  public JavaScriptObject getEndGeocode(JavaScriptObject jso);
  
  @BeanProperties
  @FieldName("start_geocode")
  public JavaScriptObject getStartGeocode(JavaScriptObject jso);
  
  @BeanProperties
  public JSList<JavaScriptObject> getSteps(JavaScriptObject jso);
}
