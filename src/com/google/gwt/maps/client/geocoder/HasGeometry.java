package com.google.gwt.maps.client.geocoder;

import com.google.gwt.maps.client.HasJso;
import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.HasLatLngBounds;

public interface HasGeometry extends HasJso {
  
  public static enum LocationType {
    APPROXIMATE ("APPROXIMATE"),
    GEOMETRIC_CENTER ("GEOMETRIC_CENTER"),
    RANGE_INTERPOLATED ("RANGE_INTERPOLATED"),
    ROOFTOP ("ROOFTOP");
    
    private String value;
    
    LocationType(String value) {
      this.value = value;
    }
    
    @Override
    public String toString() {
      return value;
    }
  }

  public HasLatLng getLocation();
  
  public LocationType getLocationType();
  
  public HasLatLngBounds getViewport();
  
  public HasLatLngBounds getBounds(); // optional.
}
