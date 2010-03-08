package com.google.gwt.maps.client.geocoder;

import com.google.gwt.maps.client.HasJso;
import com.google.gwt.maps.client.geocoder.GeocoderCallback;

public interface HasGeocoder extends HasJso {
  
  public void geocode(HasGeocoderRequest request, GeocoderCallback callback);
  
}
