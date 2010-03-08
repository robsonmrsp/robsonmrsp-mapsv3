package com.google.gwt.maps.client.geocoder;

import java.util.List;

import com.google.gwt.maps.client.HasJso;

public interface HasAddressComponent extends HasJso {

  public String getShortName();
  
  public String getLongName();
  
  public List<String> getTypes();
  
}
