package com.google.gwt.maps.client.directions.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.JSFlyweightWrapper;
import com.google.gwt.jsio.client.JSList;

@BeanProperties
public interface DirectionsResultImpl extends JSFlyweightWrapper {

  public DirectionsResultImpl impl = GWT.create(DirectionsResultImpl.class);
  
  public JSList<JavaScriptObject> getTrips(JavaScriptObject jso);

}
