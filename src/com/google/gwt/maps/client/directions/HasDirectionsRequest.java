package com.google.gwt.maps.client.directions;

import java.util.List;

import com.google.gwt.maps.client.HasJso;
import com.google.gwt.maps.client.base.HasLatLng;

public interface HasDirectionsRequest extends HasJso {

  public HasLatLng getDestinationLatLng();

  public String getDestinationString();

  public HasLatLng getOriginLatLng();

  public String getOriginString();

  public boolean isProvideTripAlternatives();

  public String getRegion();

  public String getTravelMode();

  public String getUnitSystem();

  public List<HasDirectionsWaypoint> getWaypoints();

  public void setDestinationLatLng(HasLatLng destination);

  public void setDestinationString(String destination);

  public void setOriginLatLng(HasLatLng origin);

  public void setOriginString(String origin);

  public void setProvideTripAlternatives(boolean provideTripAlternatives);

  public void setRegion(String region);

  public void setTravelMode(String travelMode);

  public void setUnitSystem(String unitSystem);

  public void setWaypoints(List<HasDirectionsWaypoint> waypoints);
}
