package com.google.gwt.maps.client;

import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.HasPoint;

public interface HasMapCanvasProjection extends HasJso {

  public HasLatLng fromContainerPixelToLatLng(HasPoint pixel);
  
  public HasLatLng fromDivPixelToLatLng(HasPoint pixel);
  
  public HasPoint fromLatLngToContainerPixel(HasLatLng latLng);
  
  public HasPoint fromLatLngToDivPixel(HasLatLng latLng);
  
  public int getWorldWidth();
  
}
