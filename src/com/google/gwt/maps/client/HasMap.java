package com.google.gwt.maps.client;

import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.HasLatLngBounds;
import com.google.gwt.user.client.Element;

public interface HasMap extends HasJso {

  public void fitBounds(HasLatLngBounds bounds);
  
  public HasLatLngBounds getBounds();
  
  public HasLatLng getCenter();
  
  public Element getDiv();
  
  public String getMapTypeId();
  
  int getZoom();
  
  void panBy(int x, int y);
  
  void panTo(HasLatLng latLng);
  
  void panToBounds(HasLatLngBounds bounds);
  
  void setCenter(HasLatLng latLng);
  
  void setMapTypeId(String mapTypeId);
  
  void setOptions(HasMapOptions options);
  
  void setZoom(int zoom);
  
}
