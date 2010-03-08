package com.google.gwt.maps.client.directions;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.directions.impl.DirectionsWaypointImpl;

public class DirectionsWaypoint implements HasDirectionsWaypoint {

  final private JavaScriptObject jso;
  
  public DirectionsWaypoint(JavaScriptObject jso) {
    this.jso = jso;
  }
  
  public DirectionsWaypoint() {
    this(DirectionsWaypointImpl.impl.construct());
  }

  @Override
  public HasLatLng getLocationLatLng() {
    return new LatLng(DirectionsWaypointImpl.impl.getLocationLatLng(jso));
  }

  @Override
  public String getLocationString() {
    return DirectionsWaypointImpl.impl.getLocationString(jso);
  }

  @Override
  public boolean isStopover() {
    return DirectionsWaypointImpl.impl.isStopover(jso);
  }

  @Override
  public void setLocation(String location) {
    DirectionsWaypointImpl.impl.setLocationString(jso, location);
  }

  @Override
  public void setLocation(HasLatLng point) {
    DirectionsWaypointImpl.impl.setLocationLatLng(jso, point.getJso());
  }

  @Override
  public void setStopover(boolean isStopover) {
    DirectionsWaypointImpl.impl.setStopover(jso, isStopover);
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
