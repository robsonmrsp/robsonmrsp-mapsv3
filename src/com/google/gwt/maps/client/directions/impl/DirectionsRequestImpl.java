package com.google.gwt.maps.client.directions.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.FieldName;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

@BeanProperties
public interface DirectionsRequestImpl extends JSFlyweightWrapper {
  
  public DirectionsRequestImpl impl = GWT.create(DirectionsRequestImpl.class);

  @Constructor("Object")
  public JavaScriptObject construct();
  
  @FieldName("destination")
  public JavaScriptObject getDestinationLatLng(JavaScriptObject jso);

  @FieldName("destination")
  public String getDestinationString(JavaScriptObject jso);

  @FieldName("origin")
  public JavaScriptObject getOriginLatLng(JavaScriptObject jso);

  @FieldName("origin")
  public String getOriginString(JavaScriptObject jso);

  @FieldName("provideTripAlternatives")
  public boolean isProvideTripAlternatives(JavaScriptObject jso);

  public String getRegion(JavaScriptObject jso);

  public String getTravelMode(JavaScriptObject jso);

  public String getUnitSystem(JavaScriptObject jso);

  public JsArray<JavaScriptObject> getWaypoints(JavaScriptObject jso);

  @FieldName("destination")
  public void setDestinationLatLng(JavaScriptObject jso, JavaScriptObject destination);

  @FieldName("destination")
  public void setDestinationString(JavaScriptObject jso, String destination);

  @FieldName("origin")
  public void setOriginLatLng(JavaScriptObject jso, JavaScriptObject origin);

  @FieldName("origin")
  public void setOriginString(JavaScriptObject jso, String origin);

  @FieldName("provideTripAlternatives")
  public void setProvideTripAlternatives(JavaScriptObject jso, boolean provideTripAlternatives);

  public void setRegion(JavaScriptObject jso, String region);

  public void setTravelMode(JavaScriptObject jso, String travelMode);

  public void setUnitSystem(JavaScriptObject jso, String unitSystem);

  public void setWaypoints(JavaScriptObject jso, JsArray<JavaScriptObject> waypoints);

}
