package com.google.gwt.maps.client.overlay;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.HasMap;
import com.google.gwt.maps.client.base.HasLatLng;

public interface HasCircle {
  
  public JavaScriptObject getJso();

  public HasLatLng getCenter();
  
  public HasMap getMap();
  
  public double getRadius();
  
  public void setCenter(HasLatLng center);
  
  public void setMap(HasMap map);
  
  public void setRadius(double radius);
  
}
