package com.google.gwt.maps.client.event;

import com.google.gwt.maps.client.HasJso;
import com.google.gwt.maps.client.base.HasLatLng;

public interface HasMouseEvent extends HasJso {

  public HasLatLng getLatLng();
  
}
