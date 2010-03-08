package com.google.gwt.maps.client.geocoder;

import com.google.gwt.maps.client.HasJso;
import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.HasLatLngBounds;

public interface HasGeocoderRequest extends HasJso {
  
  public String getAddress();
  
  public void setAddress(String address);
  
  public HasLatLngBounds getBounds();
  
  public void setBounds(HasLatLngBounds bounds);
  
  public String getLanguage();
  
  public void setLanguage(String language);
  
  public HasLatLng getLatLng();
  
  public void setLatLng(HasLatLng latLng);
  
  public String getRegion();
  
  public void setRegion(String region);
  
}
