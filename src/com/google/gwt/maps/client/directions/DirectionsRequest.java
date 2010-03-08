package com.google.gwt.maps.client.directions;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.directions.impl.DirectionsRequestImpl;

public class DirectionsRequest implements HasDirectionsRequest {

  final private JavaScriptObject jso;
  
  public DirectionsRequest() {
    this.jso = DirectionsRequestImpl.impl.construct();
  }

  @Override
  public HasLatLng getDestinationLatLng() {
    return new LatLng(DirectionsRequestImpl.impl.getDestinationLatLng(jso));
  }

  @Override
  public String getDestinationString() {
    return DirectionsRequestImpl.impl.getDestinationString(jso);
  }

  @Override
  public HasLatLng getOriginLatLng() {
    return new LatLng(DirectionsRequestImpl.impl.getOriginLatLng(jso));
  }

  @Override
  public String getOriginString() {
    return DirectionsRequestImpl.impl.getOriginString(jso);
  }

  @Override
  public String getRegion() {
    return DirectionsRequestImpl.impl.getRegion(jso);
  }

  @Override
  public String getTravelMode() {
    return DirectionsRequestImpl.impl.getTravelMode(jso);
  }

  @Override
  public String getUnitSystem() {
    return DirectionsRequestImpl.impl.getUnitSystem(jso);
  }

  @Override
  public List<HasDirectionsWaypoint> getWaypoints() {
    final List<HasDirectionsWaypoint> waypoints = new ArrayList<HasDirectionsWaypoint>();
    final JsArray<JavaScriptObject> wptArray = DirectionsRequestImpl.impl.getWaypoints(jso);
    for (int i = 0; i < wptArray.length(); ++i) {
      waypoints.add(new DirectionsWaypoint(wptArray.get(i)));
    }
    return waypoints;
  }

  @Override
  public boolean isProvideTripAlternatives() {
    return DirectionsRequestImpl.impl.isProvideTripAlternatives(jso);
  }

  @Override
  public void setDestinationLatLng(HasLatLng destination) {
    DirectionsRequestImpl.impl.setDestinationLatLng(jso, destination.getJso());
  }

  @Override
  public void setDestinationString(String destination) {
    DirectionsRequestImpl.impl.setDestinationString(jso, destination);
  }

  @Override
  public void setOriginLatLng(HasLatLng origin) {
    DirectionsRequestImpl.impl.setOriginLatLng(jso, origin.getJso());
  }

  @Override
  public void setOriginString(String origin) {
    DirectionsRequestImpl.impl.setOriginString(jso, origin);
  }

  @Override
  public void setProvideTripAlternatives(boolean provideTripAlternatives) {
    DirectionsRequestImpl.impl.setProvideTripAlternatives(jso, provideTripAlternatives);
  }

  @Override
  public void setRegion(String region) {
    DirectionsRequestImpl.impl.setRegion(jso, region);
  }

  @Override
  public void setTravelMode(String travelMode) {
    DirectionsRequestImpl.impl.setTravelMode(jso, travelMode);
  }

  @Override
  public void setUnitSystem(String unitSystem) {
    DirectionsRequestImpl.impl.setUnitSystem(jso, unitSystem);
  }

  @SuppressWarnings("unchecked")
  @Override
  public void setWaypoints(List<HasDirectionsWaypoint> waypoints) {
    JsArray<JavaScriptObject> wpts = (JsArray<JavaScriptObject>) JavaScriptObject.createArray();
    for (int i = 0; i < waypoints.size(); ++i) {
      final HasDirectionsWaypoint waypoint = waypoints.get(i);
      wpts.set(i, waypoint.getJso());
    }
    DirectionsRequestImpl.impl.setWaypoints(jso, wpts);
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
