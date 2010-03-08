package com.google.gwt.maps.client.overlay;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.HasLatLng;

public interface HasCircleOptions {

  public JavaScriptObject getJso();

  public HasLatLng getCenter();

  public void setCenter(HasLatLng center);

  public String getFillColor();

  public void setFillColor(String fillColor);

  public double getFillOpacity();

  public void setFillOpacity(double fillOpacity);

  public double getRadius();

  public void setRadius(double radius);

  public String getStrokeColor();

  public void setStrokeColor(String strokeColor);

  public double getStrokeOpacity();

  public void setStrokeOpacity(double strokeOpacity);

  public int getStrokeWeight();

  public void setStrokeWeight(int strokeWeight);
  
}
