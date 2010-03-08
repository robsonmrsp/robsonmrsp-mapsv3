package com.google.gwt.maps.client.directions;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.directions.impl.DirectionsResultImpl;

public class DirectionsResult implements HasDirectionsResult {

  final private JavaScriptObject jso;
  
  public DirectionsResult(final JavaScriptObject jso) {
    this.jso = jso;
  }

  @Override
  public List<HasDirectionsTrip> getTrips() {
    List<HasDirectionsTrip> trips = new ArrayList<HasDirectionsTrip>();
    for (JavaScriptObject js : DirectionsResultImpl.impl.getTrips(jso)) {
      trips.add(new DirectionsTrip(js));
    }
    return trips;
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
