package com.google.gwt.maps.client.directions;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.directions.impl.DirectionsStepImpl;

public class DirectionsStep implements HasDirectionsStep {

  final private JavaScriptObject jso;
  
  public DirectionsStep(final JavaScriptObject jso) {
    this.jso = jso;
  }

  @Override
  public HasTextAndValue getDistance() {
    return new DirectionsDistance(DirectionsStepImpl.impl.getDistance(jso));
  }

  @Override
  public HasTextAndValue getDuration() {
    return new DirectionsDuration(DirectionsStepImpl.impl.getDuration(jso));
  }

  @Override
  public String getEncodedLatLngs() {
    return DirectionsStepImpl.impl.getEncodedLatLngs(jso);
  }

  @Override
  public HasLatLng getEndPoint() {
    return new LatLng(DirectionsStepImpl.impl.getEndPoint(jso));
  }

  @Override
  public String getInstructions() {
    return DirectionsStepImpl.impl.getInstructions(jso);
  }

  @Override
  public List<HasLatLng> getLatLngs() {
    List<HasLatLng> latLngs = new ArrayList<HasLatLng>();
    for (JavaScriptObject js : DirectionsStepImpl.impl.getLatLngs(jso)) {
      latLngs.add(new LatLng(js));
    }
    return latLngs;
  }

  @Override
  public HasLatLng getStartPoint() {
    return new LatLng(DirectionsStepImpl.impl.getStartPoint(jso));
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
