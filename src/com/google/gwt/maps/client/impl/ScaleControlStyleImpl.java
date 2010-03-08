package com.google.gwt.maps.client.impl;

import com.google.gwt.maps.client.ScaleControlStyle;

public class ScaleControlStyleImpl {
  
  public int getValue(ScaleControlStyle style) {
    return __getValue(style.toString());
  }

  private native int __getValue(String style) /*-{
    return $wnd.google.maps.ScaleControlStyle[style];
  }-*/;
  
}
