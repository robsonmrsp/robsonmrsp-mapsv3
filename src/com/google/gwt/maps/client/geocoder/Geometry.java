package com.google.gwt.maps.client.geocoder;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.HasLatLngBounds;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;

public class Geometry implements HasGeometry {

  final private JavaScriptObject jso;
  
  public Geometry(final JavaScriptObject jso) {
    this.jso = jso;
  }

  @Override
  public HasLatLngBounds getBounds() {
    JavaScriptObject bounds = GeometryImpl.impl.getBounds(jso);
    if (bounds == null) {
      return null;
    }
    return new LatLngBounds(bounds);
  }

  @Override
  public HasLatLng getLocation() {
    return new LatLng(GeometryImpl.impl.getLocation(jso));
  }

  @Override
  public LocationType getLocationType() {
    return LocationType.valueOf(GeometryImpl.impl.getLocationType(jso));
  }

  @Override
  public HasLatLngBounds getViewport() {
    return new LatLngBounds(GeometryImpl.impl.getViewport(jso));
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
