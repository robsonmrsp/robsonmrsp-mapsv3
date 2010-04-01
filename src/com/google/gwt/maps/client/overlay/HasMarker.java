package com.google.gwt.maps.client.overlay;

import com.google.gwt.maps.client.HasMap;
import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.mvc.HasMVCObject;

public interface HasMarker extends HasMVCObject {
  
  public static enum Event {
    
    CLICK("click"),
    DRAG("drag"),
    DRAG_START("dragstart"),
    DRAG_ENG("dragend"),
    ZINDEX_CHANGED("zindex_changed");
    
    final private String value;
    
    private Event(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return this.value;
    }
  }

  boolean isClickable();

  void setClickable(boolean clickable);

  String getCursor();

  void setCursor(String cursor);

  boolean isDraggable();

  void setDraggable(boolean draggable);

  boolean isFlat();

  void setFlat(boolean flat);
  
  HasMarkerImage getIcon();
  
  void setIcon(HasMarkerImage image);
  
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
