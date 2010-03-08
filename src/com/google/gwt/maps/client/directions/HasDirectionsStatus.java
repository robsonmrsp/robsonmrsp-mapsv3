package com.google.gwt.maps.client.directions;

public interface HasDirectionsStatus {

  public String InvalidRequest();
  public String MaxWaypointsExceeded();
  public String NotFound();
  public String Ok();
  public String OverQueryLimit();
  public String RequestDenied();
  public String UnknownError();
  public String ZeroResults();
  
}
