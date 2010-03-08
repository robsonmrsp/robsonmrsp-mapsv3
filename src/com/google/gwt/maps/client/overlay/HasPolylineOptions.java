package com.google.gwt.maps.client.overlay;

import java.util.List;

import com.google.gwt.maps.client.HasJso;
import com.google.gwt.maps.client.base.HasLatLng;

public interface HasPolylineOptions extends HasJso {

  List<HasLatLng> getPath();

  String getStrokeColor();

  double getStrokeOpacity();

  int getStrokeWeight();

  void setPath(List<HasLatLng> path);

  void setStrokeColor(String strokeColor);

  void setStrokeOpacity(double strokeOpacity);

  void setStrokeWeight(int strokeWeight);

}
