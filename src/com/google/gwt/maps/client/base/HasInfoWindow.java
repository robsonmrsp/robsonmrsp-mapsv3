package com.google.gwt.maps.client.base;

import com.google.gwt.maps.client.HasJso;
import com.google.gwt.maps.client.HasMap;
import com.google.gwt.maps.client.mvc.HasMVCObject;

public interface HasInfoWindow extends HasJso {
  
  public static enum Event {
    
    CLOSE_CLICK("closeclick"),
    CONTENT_CHANGED("content_changed"),
    DOM_READY("domready"),
    POISITION_CHANGED("position_changed"),
    ZINDEX_CHANGED("zindex_changed");
    
    final private String value;
    
    private Event(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return this.value;
    }
  }
  
  void open(HasMap map, HasMVCObject anchor);

  public void close();
  
  public String getContent();
  
  public HasLatLng getPosition();
  
  public int getZIndex();
  
  public void setContent(String html);
  
  public void setOptions(HasInfoWindowOptions options);
  
  public void setPosition(HasLatLng position);
  
  public void setZIndex(int zIndex);
  
}
