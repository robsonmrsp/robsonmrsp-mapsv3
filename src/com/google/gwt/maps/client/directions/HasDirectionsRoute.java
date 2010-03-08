package com.google.gwt.maps.client.directions;

import java.util.List;

import com.google.gwt.maps.client.HasJso;
import com.google.gwt.maps.client.geocoder.HasGeocoderResponse;

public interface HasDirectionsRoute extends HasJso {

  public HasTextAndValue getDistance();
  
  public HasTextAndValue getDuration();
  
  public HasGeocoderResponse getEndGeocode();
  
  public HasGeocoderResponse getStartGeocode();
  
  public List<HasDirectionsStep> getSteps();
  
}
