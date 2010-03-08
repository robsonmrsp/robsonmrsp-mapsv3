package com.google.gwt.maps.client.base;

import com.google.gwt.core.client.JavaScriptObject;


public interface HasLatLng {

  public double getLatitude();

  public double getLongitude();
  
  public String toString();
  
  public String toUrlValue();
  
  public String toUrlValue(int precision);
  
  public boolean equalsTo(HasLatLng other);
  
  public JavaScriptObject getJso();
}
