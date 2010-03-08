package com.google.gwt.maps.client.base;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.impl.LatLngImpl;

public class LatLng implements HasLatLng {

  final private LatLngImpl impl;
  final private JavaScriptObject jso;
  
  public LatLng(final LatLngImpl impl, final JavaScriptObject jso) {
    this.impl = impl;
    this.jso = jso;
  }
  
  public LatLng(final JavaScriptObject jso) {
    this.impl = GWT.create(LatLngImpl.class);
    this.jso = jso;
  }
  
  public LatLng(final double lat, final double lng) {
    impl = GWT.create(LatLngImpl.class);
    jso = impl.construct(lat, lng);
  }
  
  public LatLng(final double lat, final double lng, boolean noWrap) {
    impl = GWT.create(LatLngImpl.class);
    jso = impl.construct(lat, lng, noWrap);
  }
  
  @Override
  public double getLatitude() {
    return impl.lat(jso);
  }

  @Override
  public double getLongitude() {
    return impl.lng(jso);
  }
  
  @Override
  public String toString() {
    return impl.toString(jso);
  }

  @Override
  public String toUrlValue() {
    return impl.toUrlValue(jso);
  }

  @Override
  public String toUrlValue(int precision) {
    return impl.toUrlValue(jso, precision);
  }

  @Override
  public boolean equalsTo(HasLatLng other) {
    return impl.equals(jso, other.getJso());
  }
  
  @Override
  public boolean equals(Object other) {
    if (other == null || !(other instanceof LatLng)) {
      return false;
    }
    return equalsTo((HasLatLng) other);
  }
  
  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
