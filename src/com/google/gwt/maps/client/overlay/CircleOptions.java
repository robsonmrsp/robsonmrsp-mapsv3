package com.google.gwt.maps.client.overlay;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.LatLng;

public class CircleOptions implements HasCircleOptions {
  
  final private JavaScriptObject jso;
  
  public CircleOptions(final JavaScriptObject jso) {
    this.jso = jso;
  }

  public CircleOptions() {
    this(CircleOptionsImpl.impl.construct());
  }
  
  @Override
  public HasLatLng getCenter() {
    return new LatLng(CircleOptionsImpl.impl.getCenter(jso));
  }

  @Override
  public String getFillColor() {
    return CircleOptionsImpl.impl.getFillColor(jso);
  }

  @Override
  public double getFillOpacity() {
    return CircleOptionsImpl.impl.getFillOpacity(jso);
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

  @Override
  public double getRadius() {
    return CircleOptionsImpl.impl.getRadius(jso);
  }

  @Override
  public String getStrokeColor() {
    return CircleOptionsImpl.impl.getStrokeColor(jso);
  }

  @Override
  public double getStrokeOpacity() {
    return CircleOptionsImpl.impl.getStrokeOpacity(jso);
  }

  @Override
  public int getStrokeWeight() {
    return CircleOptionsImpl.impl.getStrokeWeight(jso);
  }

  @Override
  public void setCenter(HasLatLng center) {
    CircleOptionsImpl.impl.setCenter(jso, center.getJso());
  }

  @Override
  public void setFillColor(String fillColor) {
    CircleOptionsImpl.impl.setFillColor(jso, fillColor);
  }

  @Override
  public void setFillOpacity(double fillOpacity) {
    CircleOptionsImpl.impl.setFillOpacity(jso, fillOpacity);
  }

  @Override
  public void setRadius(double radius) {
    CircleOptionsImpl.impl.setRadius(jso, radius);
  }

  @Override
  public void setStrokeColor(String strokeColor) {
    CircleOptionsImpl.impl.setStrokeColor(jso, strokeColor);
  }

  @Override
  public void setStrokeOpacity(double strokeOpacity) {
    CircleOptionsImpl.impl.setStrokeOpacity(jso, strokeOpacity);
  }

  @Override
  public void setStrokeWeight(int strokeWeight) {
    CircleOptionsImpl.impl.setStrokeWeight(jso, strokeWeight);
  }

}
