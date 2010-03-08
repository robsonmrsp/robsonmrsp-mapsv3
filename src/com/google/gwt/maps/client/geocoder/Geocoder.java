package com.google.gwt.maps.client.geocoder;

import com.google.gwt.core.client.JavaScriptObject;

public class Geocoder implements HasGeocoder {

  final private JavaScriptObject jso;
  
  public Geocoder(final JavaScriptObject jso) {
    this.jso = jso;
  }
  
  public Geocoder() {
    this(GeocoderImpl.impl.construct());
  }

  @Override
  public void geocode(HasGeocoderRequest request, GeocoderCallback callback) {
    GeocoderImpl.impl.geocode(jso, request.getJso(), callback);
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
