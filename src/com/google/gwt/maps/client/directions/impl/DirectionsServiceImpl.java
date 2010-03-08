package com.google.gwt.maps.client.directions.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;
import com.google.gwt.maps.client.directions.DirectionsCallback;

public interface DirectionsServiceImpl extends JSFlyweightWrapper {

  public DirectionsServiceImpl impl = GWT.create(DirectionsServiceImpl.class);
  
  @Constructor("$wnd.google.maps.DirectionsService")
  public JavaScriptObject construct();
  
  public void route(JavaScriptObject jso, JavaScriptObject request, DirectionsCallback callback);
  
}
