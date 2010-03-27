package com.google.gwt.maps.client.geocoder;

import com.google.gwt.maps.client.HasJso;

public interface HasGeocoder extends HasJso {
  
  public void geocode(HasGeocoderRequest request, GeocoderCallback callback);
  
}
