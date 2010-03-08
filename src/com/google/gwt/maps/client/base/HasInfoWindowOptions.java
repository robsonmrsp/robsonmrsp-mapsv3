package com.google.gwt.maps.client.base;

import com.google.gwt.maps.client.HasJso;

public interface HasInfoWindowOptions extends HasJso {

  public String getContent();

  public void setContent(String html);
  
  public boolean isDisableAutoPan();
  
  public void setDisableAutoPan(boolean disableAutoPan);
  
  public int getMaxWidth();
  
  public void setMaxWidth(int maxWidth);
  
  public HasSize getPixelOffset();
  
  public void setPixelOffset(HasSize size);
  
  public HasLatLng getPosition();
  
  public void setPosition(HasLatLng position);
  
  public int getZIndex();
  
  public void setZIndex(int zIndex);
  
}
