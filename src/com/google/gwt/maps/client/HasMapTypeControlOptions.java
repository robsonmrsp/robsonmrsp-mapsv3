package com.google.gwt.maps.client;

import java.util.List;

/**
 * Options for the rendering of the map type control.
 *
 * @author vinay.sekhri@gmail.com (Vinay Sekhri)
 */
public interface HasMapTypeControlOptions extends HasJso {

  /**
   * IDs of map types to show in the control.
   */
  void setMapTypeIds(List<String> mapTypeIds);

  /**
   * Position id. Used to specify the position of the control on the map. The
   * default position is TOP_RIGHT.
   */
  void setPosition(ControlPosition position);
  
  /**
   * Style id. Used to select what style of map type control to display.
   */
  void setStyle(MapTypeControlStyle style);

}
