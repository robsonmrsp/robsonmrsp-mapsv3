package com.google.gwt.maps.client.directions;

import com.google.gwt.maps.client.HasJso;

public interface HasDirectionsService extends HasJso {

  public void route(HasDirectionsRequest request, DirectionsCallback callback);
  
}
