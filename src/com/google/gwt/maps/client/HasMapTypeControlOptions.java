package com.google.gwt.maps.client;

import java.util.List;

public interface HasMapTypeControlOptions extends HasJso {

  void setMapTypeIds(List<String> mapTypeIds);
  
  void setPosition(ControlPosition position);
  
  void setStyle(MapTypeControlStyle style);

}
