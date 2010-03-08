package com.google.gwt.maps.client.directions;

import java.util.List;

import com.google.gwt.maps.client.HasJso;

public interface HasDirectionsTrip extends HasJso {

  public String getCopyrights();
  
  public List<HasDirectionsRoute> getRoutes();
  
  public List<String> getWarnings();
  
}
