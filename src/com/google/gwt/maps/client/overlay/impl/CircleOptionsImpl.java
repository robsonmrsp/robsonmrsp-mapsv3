package com.google.gwt.maps.client.overlay.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface CircleOptionsImpl extends JSFlyweightWrapper {

  public CircleOptionsImpl impl = GWT.create(CircleOptionsImpl.class);
  
  @Constructor("Object")
  public JavaScriptObject construct();

  @BeanProperties
  public JavaScriptObject getCenter(JavaScriptObject jso);

  @BeanProperties
  public void setCenter(JavaScriptObject jso, JavaScriptObject center);

  @BeanProperties
  public String getFillColor(JavaScriptObject jso);

  @BeanProperties
  public void setFillColor(JavaScriptObject jso, String fillColor);

  @BeanProperties
  public double getFillOpacity(JavaScriptObject jso);

  @BeanProperties
  public void setFillOpacity(JavaScriptObject jso, double fillOpacity);

  @BeanProperties
  public double getRadius(JavaScriptObject jso);

  @BeanProperties
  public void setRadius(JavaScriptObject jso, double radius);

  @BeanProperties
  public String getStrokeColor(JavaScriptObject jso);

  @BeanProperties
  public void setStrokeColor(JavaScriptObject jso, String strokeColor);

  @BeanProperties
  public double getStrokeOpacity(JavaScriptObject jso);

  @BeanProperties
  public void setStrokeOpacity(JavaScriptObject jso, double strokeOpacity);

  @BeanProperties
  public int getStrokeWeight(JavaScriptObject jso);

  @BeanProperties
  public void setStrokeWeight(JavaScriptObject jso, int strokeWeight);
}
