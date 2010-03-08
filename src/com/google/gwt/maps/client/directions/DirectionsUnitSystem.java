package com.google.gwt.maps.client.directions;


public class DirectionsUnitSystem implements HasDirectionsUnitSystem {
  
  @Override
  public native String Imperial() /*-{
    return "IMPERIAL"; // $wnd.google.maps.DirectionsUnitSystem.IMPERIAL;
  }-*/;

  @Override
  public native String Metric() /*-{
    return "METRIC"; // $wnd.google.maps.DirectionsUnitSystem.METRIC;
  }-*/;

}
