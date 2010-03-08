package com.google.gwt.maps.client.directions;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.directions.impl.DirectionsDurationImpl;

public class DirectionsDuration implements HasTextAndValue {

  final private DirectionsDurationImpl impl;
  final private JavaScriptObject jso;
  
  public DirectionsDuration(final DirectionsDurationImpl impl, final JavaScriptObject jso) {
    this.impl = impl;
    this.jso = jso;
  }
  
  public DirectionsDuration(final JavaScriptObject jso) {
    this.impl = GWT.create(DirectionsDurationImpl.class);
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
