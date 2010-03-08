package com.google.gwt.maps.client.impl;

import com.google.gwt.maps.client.MapTypeControlStyle;

public class MapTypeControlStyleImpl {
  
  public int getValue(MapTypeControlStyle style) {
    return __getValue(style.toString());
  }

  private native int __getValue(String style) /*-{
    return $wnd.google.maps.MapTypeControlStyle[style];
  }-*/;

}
