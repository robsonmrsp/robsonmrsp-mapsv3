package com.google.gwt.maps.client.geocoder;

import java.util.List;

import com.google.gwt.maps.client.HasJso;

public interface HasGeocoderResponse extends HasJso {

  public List<String> getTypes();
  
  public String getFormattedAddress();
  
  public List<HasAddressComponent> getAddressComponents();
  
  public HasGeometry getGeometry();
  
}
