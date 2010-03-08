package com.google.gwt.maps.client.directions.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.FieldName;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface DirectionsWaypointImpl extends JSFlyweightWrapper {
  
  public DirectionsWaypointImpl impl = GWT.create(DirectionsWaypointImpl.class);
  
  @Constructor("Object")
  public JavaScriptObject construct();

  @BeanProperties
  @FieldName("location")
  public String getLocationString(JavaScriptObject jso);

  @BeanProperties
  @FieldName("location")
  public JavaScriptObject getLocationLatLng(JavaScriptObject jso);

  @BeanProperties
  @FieldName("location")
  public void setLocationString(JavaScriptObject jso, String location);

  @BeanProperties
  @FieldName("location")
  public void setLocationLatLng(JavaScriptObject jso, JavaScriptObject point);

  @BeanProperties
  @FieldName("stopover")
  public boolean isStopover(JavaScriptObject jso);

  @BeanProperties
  public void setStopover(JavaScriptObject jso, boolean isStopover);

}
