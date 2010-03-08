package com.google.gwt.maps.client.impl;

import com.google.gwt.maps.client.NavigationControlStyle;

public class NavigationControlStyleImpl {
  
  public int getValue(NavigationControlStyle style) {
    return __getValue(style.toString());
  }

  private native int __getValue(String style) /*-{
    return $wnd.google.maps.NavigationControlStyle[style];
  }-*/;

}
