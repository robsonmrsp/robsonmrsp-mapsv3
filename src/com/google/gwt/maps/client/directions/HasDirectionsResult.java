package com.google.gwt.maps.client.directions;

import java.util.List;

import com.google.gwt.maps.client.HasJso;

public interface HasDirectionsResult extends HasJso {

  public List<HasDirectionsTrip> getTrips();
  
}
