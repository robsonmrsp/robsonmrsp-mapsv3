package com.google.gwt.maps.client.base;

import com.google.gwt.core.client.JavaScriptObject;

public interface HasLatLngBounds {
  public boolean contains(HasLatLng point);
  public boolean equalsTo(HasLatLngBounds other);
  public HasLatLngBounds extend(HasLatLng point);
  public HasLatLng getCenter();
  public HasLatLng getNorthEast();
  public HasLatLng getSouthWest();
  public boolean intersects(HasLatLngBounds other);
  public boolean isEmpty();
  public HasLatLng toSpan();
  public String toString();
  public String toUrlValue();
  public String toUrlValue(int precision);
  public HasLatLngBounds union(HasLatLngBounds other);
  public JavaScriptObject getJso();
}
