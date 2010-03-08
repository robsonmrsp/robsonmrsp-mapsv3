package com.google.gwt.maps.client.directions;


public class DirectionsStatus implements HasDirectionsStatus {
  
  @Override
  public native String InvalidRequest() /*-{
    return $wnd.google.maps.DirectionsStatus.INVALID_REQUEST;
  }-*/;

  @Override
  public native String MaxWaypointsExceeded() /*-{
    return $wnd.google.maps.DirectionsStatus.MAX_WAYPOINTS_EXCEEDED;
  }-*/;

  @Override
  public native String NotFound() /*-{
    return $wnd.google.maps.DirectionsStatus.NOT_FOUND;
  }-*/;

  @Override
  public native String Ok() /*-{
    return $wnd.google.maps.DirectionsStatus.OK;
  }-*/;

  @Override
  public native String OverQueryLimit() /*-{
    return $wnd.google.maps.DirectionsStatus.OVER_QUERY_LIMIT;
  }-*/;

  @Override
  public native String RequestDenied() /*-{
    return $wnd.google.maps.DirectionsStatus.REQUEST_DENIED;
  }-*/;

  @Override
  public native String UnknownError() /*-{
    return $wnd.google.maps.DirectionsStatus.UNKNOWN_ERROR;
  }-*/;

  @Override
  public native String ZeroResults() /*-{
    return $wnd.google.maps.DirectionsStatus.ZERO_RESULTS;
  }-*/;

}
