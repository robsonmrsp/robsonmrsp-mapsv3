package com.google.gwt.maps.client.directions;


public class DirectionsTravelMode implements HasDirectionsTravelMode {
  
  @Override
  public native String Driving() /*-{
    return $wnd.google.maps.DirectionsTravelMode.DRIVING;
  }-*/;

  @Override
  public native String Walking() /*-{
    return $wnd.google.maps.DirectionsTravelMode.WALKING;
  }-*/;

}
