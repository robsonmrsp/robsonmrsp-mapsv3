package com.google.gwt.maps.client.directions.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.FieldName;
import com.google.gwt.jsio.client.JSFlyweightWrapper;
import com.google.gwt.jsio.client.JSList;

@BeanProperties
public interface DirectionsStepImpl extends JSFlyweightWrapper {

  public DirectionsStepImpl impl = GWT.create(DirectionsStepImpl.class);
  
  public JavaScriptObject getDistance(JavaScriptObject jso);
  
  public JavaScriptObject getDuration(JavaScriptObject jso);
  
  @FieldName("encoded_lat_lngs")
  public String getEncodedLatLngs(JavaScriptObject jso);
  
  @FieldName("end_point")
  public JavaScriptObject getEndPoint(JavaScriptObject jso);
  
  public String getInstructions(JavaScriptObject jso);
  
  @FieldName("lat_lngs")
  public JSList<JavaScriptObject> getLatLngs(JavaScriptObject jso);
  
  @FieldName("start_point")
  public JavaScriptObject getStartPoint(JavaScriptObject jso);
}
