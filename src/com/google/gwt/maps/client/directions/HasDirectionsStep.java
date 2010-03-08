package com.google.gwt.maps.client.directions;

import java.util.List;

import com.google.gwt.maps.client.HasJso;
import com.google.gwt.maps.client.base.HasLatLng;

public interface HasDirectionsStep extends HasJso {

  public HasTextAndValue getDistance();
  
  public HasTextAndValue getDuration();
  
  public String getEncodedLatLngs();
  
  public HasLatLng getEndPoint();
  
  public String getInstructions();
  
  public List<HasLatLng> getLatLngs();
  
  public HasLatLng getStartPoint();
  
}
