package com.google.gwt.maps.client.overlay;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.overlay.impl.PolylineOptionsImpl;

public class PolylineOptions implements HasPolylineOptions {

  final private JavaScriptObject jso;
  
  public PolylineOptions(JavaScriptObject jso) {
    this.jso = jso;
  }
  
  public PolylineOptions() {
    this(PolylineOptionsImpl.impl.construct());
  }
  
  @Override
  public List<HasLatLng> getPath() {
    List<HasLatLng> path = new ArrayList<HasLatLng>();
    JsArray<JavaScriptObject> pathJsArr = PolylineOptionsImpl.impl.getPath(jso);
    for (int i = 0; i < pathJsArr.length(); ++i) {
      path.add(new LatLng(pathJsArr.get(i)));
    }
    return path;
  }

  @Override
  public String getStrokeColor() {
    return PolylineOptionsImpl.impl.getStrokeColor(jso);
  }

  @Override
  public double getStrokeOpacity() {
    return PolylineOptionsImpl.impl.getStrokeOpacity(jso);
  }

  @Override
  public int getStrokeWeight() {
    return PolylineOptionsImpl.impl.getStrokeWeight(jso);
  }

  @SuppressWarnings("unchecked")
  @Override
  public void setPath(List<HasLatLng> path) {
    JsArray<JavaScriptObject> pathJsArr
        = (JsArray<JavaScriptObject>) JavaScriptObject.createArray();
    for (HasLatLng latLng : path) {
      pathJsArr.push(latLng.getJso());
    }
    PolylineOptionsImpl.impl.setPath(jso, pathJsArr);
  }

  @Override
  public void setStrokeColor(String strokeColor) {
    PolylineOptionsImpl.impl.setStrokeColor(jso, strokeColor);
  }

  @Override
  public void setStrokeOpacity(double strokeOpacity) {
    PolylineOptionsImpl.impl.setStrokeOpacity(jso, strokeOpacity);
  }

  @Override
  public void setStrokeWeight(int strokeWeight) {
    PolylineOptionsImpl.impl.setStrokeWeight(jso, strokeWeight);
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
