package com.google.gwt.maps.client.overlay;

import java.util.List;

import com.google.gwt.maps.client.HasJso;
import com.google.gwt.maps.client.HasMap;
import com.google.gwt.maps.client.base.HasLatLng;

public interface HasPolyline extends HasJso {

  HasMap getMap();

  List<HasLatLng> getPath();

  void setMap(HasMap map);

  void setOptions(HasPolylineOptions options);

  void setPath(List<HasLatLng> path);
  
}
