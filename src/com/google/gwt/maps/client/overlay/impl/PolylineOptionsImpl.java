package com.google.gwt.maps.client.overlay.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

@BeanProperties
public interface PolylineOptionsImpl extends JSFlyweightWrapper {

  PolylineOptionsImpl impl = GWT.create(PolylineOptionsImpl.class);
  
  @Constructor("Object")
  JavaScriptObject construct();

  JsArray<JavaScriptObject> getPath(JavaScriptObject jso);

  String getStrokeColor(JavaScriptObject jso);

  double getStrokeOpacity(JavaScriptObject jso);

  int getStrokeWeight(JavaScriptObject jso);

  void setPath(JavaScriptObject jso, JsArray<JavaScriptObject> path);

  void setStrokeColor(JavaScriptObject jso, String strokeColor);

  void setStrokeOpacity(JavaScriptObject jso, double strokeOpacity);

  void setStrokeWeight(JavaScriptObject jso, int strokeWeight);
}
