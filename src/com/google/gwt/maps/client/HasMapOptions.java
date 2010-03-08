package com.google.gwt.maps.client;

import com.google.gwt.maps.client.base.HasLatLng;

public interface HasMapOptions extends HasJso {

  String getBackgroundColor();

  void setBackgroundColor(String backgroundColor);

  HasLatLng getCenter();

  void setCenter(HasLatLng center);

  boolean isDisableDefaultUI();

  void setDisableDefaultUI(boolean disableDefaultUI);

  boolean isDisableDoubleClickZoom();

  void setDisableDoubleClickZoom(boolean disableDoubleClickZoom);

  boolean isDraggable();

  void setDraggable(boolean draggable);

  String getDraggableCursor();

  void setDraggableCursor(String draggableCursor);

  String getDraggingCursor();

  void setDraggingCursor(String draggingCursor);

  boolean isKeyboardShortcuts();

  void setKeyboardShortcuts(boolean keyboardShortcuts);

  boolean isMapTypeControl();

  void setMapTypeControl(boolean mapTypeControl);

  HasMapTypeControlOptions getMapTypeControlOptions();

  void setMapTypeControlOptions(HasMapTypeControlOptions mapTypeControlOptions);

  String getMapTypeId();

  void setMapTypeId(String mapTypeId);

  boolean isNavigationControl();

  void setNavigationControl(boolean navigationControl);

  HasNavigationControlOptions getNavigationControlOptions();

  void setNavigationControlOptions(
      HasNavigationControlOptions navigationControlOptions);

  boolean isNoClear();

  void setNoClear(boolean noClear);

  boolean isScaleControl();

  void setScaleControl(boolean scaleControl);

  HasScaleControlOptions getScaleControlOptions();

  void setScaleControlOptions(HasScaleControlOptions scaleControlOptions);

  boolean isScrollwheel();

  void setScrollwheel(boolean scrollwheel);

  int getZoom();

  void setZoom(int zoom);

}
