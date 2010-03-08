package com.google.gwt.maps.client.overlay;

import com.google.gwt.maps.client.HasJso;
import com.google.gwt.maps.client.HasMap;
import com.google.gwt.maps.client.base.HasLatLng;

public interface HasMarkerOptions extends HasJso {

  boolean isClickable();

  void setClickable(boolean clickable);

  String getCursor();

  void setCursor(String cursor);

  boolean isDraggable();

  void setDraggable(boolean draggable);

  boolean isFlat();

  void setFlat(boolean flat);

  HasMap getMap();

  void setMap(HasMap map);

  HasLatLng getPosition();

  void setPosition(HasLatLng position);

  String getTitle();

  void setTitle(String title);

  boolean isVisible();

  void setVisible(boolean visible);

  int getZIndex();

  void setZIndex(int zIndex);

}
