package com.google.gwt.maps.client.impl;

import com.google.gwt.maps.client.ControlPosition;

public class ControlPositionImpl {

  public int getValue(ControlPosition position) {
    return __getValue(position.toString());
  }
  
  private native int __getValue(String name) /*-{
    return $wnd.google.maps.ControlPosition[name];
  }-*/;
  
}
