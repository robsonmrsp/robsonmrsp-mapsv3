package com.google.gwt.maps.client.base;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.impl.SizeImpl;

public class Size implements HasSize {

  final private SizeImpl impl;
  final private JavaScriptObject jso;
  
  public Size(final SizeImpl impl, final JavaScriptObject jso) {
    this.impl = impl;
    this.jso = jso;
  }
  
  public Size(final JavaScriptObject jso) {
    this.impl = GWT.create(SizeImpl.class);
    this.jso = jso;
  }

  public Size(int width, int height) {
    this.impl = GWT.create(SizeImpl.class);
    this.jso = impl.construct(width, height);
  }

  @Override
  public boolean equalsTo(HasSize other) {
    return impl.equals(jso, other.getJso());
  }
  
  @Override
  public boolean equals(Object other) {
    if (other == null || !(other instanceof Size)) {
      return false;
    }
    return equalsTo((HasSize) other);
  }

  @Override
  public int getHeight() {
    return impl.getHeight(jso);
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

  @Override
  public int getWidth() {
    return impl.getWidth(jso);
  }
  
  @Override
  public String toString() {
    return impl.toString(jso);
  }

}
