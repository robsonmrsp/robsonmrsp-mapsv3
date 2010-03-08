package com.google.gwt.maps.client.directions;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.directions.impl.DirectionsDistanceImpl;

public class DirectionsDistance implements HasTextAndValue {

  final private DirectionsDistanceImpl impl;
  final private JavaScriptObject jso;
  
  public DirectionsDistance(final DirectionsDistanceImpl impl, final JavaScriptObject jso) {
    this.impl = impl;
    this.jso = jso;
  }
  
  public DirectionsDistance(final JavaScriptObject jso) {
    this.impl = GWT.create(DirectionsDistanceImpl.class);
    this.jso = jso;
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

  @Override
  public String getText() {
    return impl.getText(jso);
  }

  @Override
  public double getValue() {
    return impl.getValue(jso);
  }


}
