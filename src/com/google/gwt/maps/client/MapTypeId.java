package com.google.gwt.maps.client;


public class MapTypeId implements HasMapTypeId {

  @Override
  public native String getHybrid() /*-{
    return $wnd.google.maps.MapTypeId.HYBRID;
  }-*/;

  @Override
  public native String getRoadmap() /*-{
    return $wnd.google.maps.MapTypeId.ROADMAP;
  }-*/;

  @Override
  public native String getSatellite() /*-{
    return $wnd.google.maps.MapTypeId.SATELLITE;
  }-*/;

  @Override
  public native String getTerrain() /*-{
    return $wnd.google.maps.MapTypeId.TERRAIN;
  }-*/;

}
