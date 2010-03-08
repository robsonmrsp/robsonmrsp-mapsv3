package com.google.gwt.maps.client.base;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.impl.LatLngBoundsImpl;

public class LatLngBounds implements HasLatLngBounds {

  final private LatLngBoundsImpl impl;
  final private JavaScriptObject jso;
  
  public LatLngBounds(final LatLngBoundsImpl impl, final JavaScriptObject jso) {
    this.impl = impl;
    this.jso = jso;
  }
  
  public LatLngBounds(final JavaScriptObject jso) {
    this.impl = GWT.create(LatLngBoundsImpl.class);
    this.jso = jso;
  }
  
  public LatLngBounds() {
    impl = GWT.create(LatLngBoundsImpl.class);
    jso = impl.construct();
  }

  public LatLngBounds(final HasLatLng sw, final HasLatLng ne) {
    impl = GWT.create(LatLngBoundsImpl.class);
    jso = impl.construct(sw.getJso(), ne.getJso());
  }
  
  @Override
  public boolean contains(HasLatLng point) {
    return impl.contains(jso, point.getJso());
  }

  @Override
  public boolean equalsTo(HasLatLngBounds other) {
    return impl.equals(jso, other.getJso());
  }
  
  @Override
  public boolean equals(Object other) {
    if (other == null || !(other instanceof LatLngBounds)) {
      return false;
    }
    return equalsTo((HasLatLngBounds) other);
  }

  @Override
  public HasLatLngBounds extend(HasLatLng point) {
    return new LatLngBounds(impl, impl.extend(jso, point.getJso()));
  }

  @Override
  public HasLatLng getCenter() {
    return new LatLng(impl.getCenter(jso));
  }

  @Override
  public HasLatLng getNorthEast() {
    return new LatLng(impl.getNorthEast(jso));
  }

  @Override
  public HasLatLng getSouthWest() {
    return new LatLng(impl.getSouthWest(jso));
  }

  @Override
  public boolean intersects(HasLatLngBounds other) {
    return impl.intersects(jso, other.getJso());
  }

  @Override
  public boolean isEmpty() {
    return impl.isEmpty(jso);
  }

  @Override
  public HasLatLng toSpan() {
    return new LatLng(impl.toSpan(jso));
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
  public HasLatLngBounds union(HasLatLngBounds other) {
    return new LatLngBounds(impl, impl.union(jso, other.getJso()));
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
