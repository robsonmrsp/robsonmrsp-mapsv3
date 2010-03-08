package com.google.gwt.maps.client.directions;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.directions.impl.DirectionsTripImpl;

public class DirectionsTrip implements HasDirectionsTrip {

  final private DirectionsTripImpl impl;
  final private JavaScriptObject jso;
  
  public DirectionsTrip(final DirectionsTripImpl impl, final JavaScriptObject jso) {
    this.impl = impl;
    this.jso = jso;
  }
  
  public DirectionsTrip(final JavaScriptObject jso) {
    this.impl = GWT.create(DirectionsTripImpl.class);
    this.jso = jso;
  }

  @Override
  public String getCopyrights() {
    return impl.getCopyrights(jso);
  }

  @Override
  public List<HasDirectionsRoute> getRoutes() {
    List<HasDirectionsRoute> routes = new ArrayList<HasDirectionsRoute>();
    for (JavaScriptObject js : impl.getRoutes(jso)) {
      routes.add(new DirectionsRoute(js));
    }
    return routes;
  }

  @Override
  public List<String> getWarnings() {
    List<String> warnings = new ArrayList<String>();
    warnings.addAll(impl.getWarnings(jso));
    return warnings;
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
