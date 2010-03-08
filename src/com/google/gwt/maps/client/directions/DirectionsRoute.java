package com.google.gwt.maps.client.directions;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.directions.impl.DirectionsRouteImpl;
import com.google.gwt.maps.client.geocoder.GeocoderResponse;
import com.google.gwt.maps.client.geocoder.HasGeocoderResponse;

public class DirectionsRoute implements HasDirectionsRoute {

  final private DirectionsRouteImpl impl;
  final private JavaScriptObject jso;
  
  public DirectionsRoute(final DirectionsRouteImpl impl, final JavaScriptObject jso) {
    this.impl = impl;
    this.jso = jso;
  }
  
  public DirectionsRoute(final JavaScriptObject jso) {
    this.impl = GWT.create(DirectionsRouteImpl.class);
    this.jso = jso;
  }

  @Override
  public HasTextAndValue getDistance() {
    return new DirectionsDistance(impl.getDistance(jso));
  }

  @Override
  public HasTextAndValue getDuration() {
    return new DirectionsDuration(impl.getDuration(jso));
  }

  @Override
  public HasGeocoderResponse getEndGeocode() {
    return new GeocoderResponse(impl.getEndGeocode(jso));
  }

  @Override
  public HasGeocoderResponse getStartGeocode() {
    return new GeocoderResponse(impl.getStartGeocode(jso));
  }

  @Override
  public List<HasDirectionsStep> getSteps() {
    List<HasDirectionsStep> steps = new ArrayList<HasDirectionsStep>();
    for (JavaScriptObject js : impl.getSteps(jso)) {
      steps.add(new DirectionsStep(js));
    }
    return steps;
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
