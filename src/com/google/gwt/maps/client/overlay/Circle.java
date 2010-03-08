package com.google.gwt.maps.client.overlay;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.HasMap;
import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.LatLng;

public class Circle implements HasCircle {
  
  final private JavaScriptObject jso;
  
  public Circle(final JavaScriptObject jso) {
    this.jso = jso;
  }

  public Circle() {
    this(CircleImpl.impl.construct());
  }

  public Circle(HasCircleOptions circleOptions) {
    this(CircleImpl.impl.construct(circleOptions.getJso()));
  }

  @Override
  public HasLatLng getCenter() {
    return new LatLng(CircleImpl.impl.getCenter(jso));
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

  @Override
  public HasMap getMap() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public double getRadius() {
    return CircleImpl.impl.getRadius(jso);
  }

  @Override
  public void setCenter(HasLatLng center) {
    CircleImpl.impl.setCenter(jso, center.getJso());
  }

  @Override
  public void setMap(HasMap map) {
    CircleImpl.impl.setMap(jso, map.getJso());
  }

  @Override
  public void setRadius(double radius) {
    CircleImpl.impl.setRadius(jso, radius);
  }

}
