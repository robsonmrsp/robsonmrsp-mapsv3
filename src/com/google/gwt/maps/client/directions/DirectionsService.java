package com.google.gwt.maps.client.directions;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.directions.impl.DirectionsServiceImpl;

public class DirectionsService implements HasDirectionsService {
  
  private JavaScriptObject jso;
  
  public DirectionsService(JavaScriptObject jso) {
    this.jso = jso;
  }
  
  public DirectionsService() {
    this(DirectionsServiceImpl.impl.construct());
  }

  @Override
  public void route(HasDirectionsRequest request, DirectionsCallback callback) {
    DirectionsServiceImpl.impl.route(jso, request.getJso(), callback);
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
