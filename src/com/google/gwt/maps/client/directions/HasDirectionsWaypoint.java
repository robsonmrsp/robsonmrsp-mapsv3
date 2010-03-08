package com.google.gwt.maps.client.directions;

import com.google.gwt.maps.client.HasJso;
import com.google.gwt.maps.client.base.HasLatLng;

public interface HasDirectionsWaypoint extends HasJso {

  public String getLocationString();

  public HasLatLng getLocationLatLng();

  public void setLocation(String location);

  public void setLocation(HasLatLng point);

  public boolean isStopover();

  public void setStopover(boolean isStopover);

}
