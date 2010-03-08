package com.google.gwt.maps.client.overlay;

public interface HasMarker extends HasMarkerOptions {
  
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

}
