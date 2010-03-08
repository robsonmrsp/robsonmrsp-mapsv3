package com.google.gwt.maps.client.base;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.impl.PointImpl;

public class Point implements HasPoint {

  final private PointImpl impl;
  final private JavaScriptObject jso;
  
  public Point(final PointImpl impl, final JavaScriptObject jso) {
    this.impl = impl;
    this.jso = jso;
  }
  
  public Point(final JavaScriptObject jso) {
    this.impl = GWT.create(PointImpl.class);
    this.jso = jso;
  }
  
  public Point(int x, int y) {
    this.impl = GWT.create(PointImpl.class);
    this.jso = impl.construct(x, y);
  }

  @Override
  public boolean equalsTo(HasPoint other) {
    return impl.equals(jso, other.getJso());
  }
  
  @Override
  public boolean equals(Object other) {
    if (other == null || !(other instanceof Point)) {
      return false;
    }
    return equalsTo((HasPoint) other);
  }

  @Override
  public String toString() {
    return impl.toString(jso);
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

  @Override
  public int getX() {
    return impl.getX(jso);
  }

  @Override
  public int getY() {
    return impl.getY(jso);
  }

}
