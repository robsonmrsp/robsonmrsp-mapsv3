package com.google.gwt.maps.client.overlay;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.maps.client.HasMap;
import com.google.gwt.maps.client.Map;
import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.mvc.MVCObject;
import com.google.gwt.maps.client.overlay.impl.PolylineImpl;

public class Polyline extends MVCObject implements HasPolyline {

  private JavaScriptObject jso;

  public Polyline(JavaScriptObject jso) {
    this.jso = jso;
  }

  public Polyline() {
    this(PolylineImpl.impl.construct());
  }

  public Polyline(HasPolylineOptions options) {
    this(PolylineImpl.impl.construct(options.getJso()));
  }

  @Override
  public HasMap getMap() {
    return new Map(PolylineImpl.impl.getMap(jso));
  }

  @Override
  public List<HasLatLng> getPath() {
    List<HasLatLng> path = new ArrayList<HasLatLng>();
    JsArray<JavaScriptObject> pathJsArr = PolylineImpl.impl.getPath(jso);
    for (int i = 0; i < pathJsArr.length(); ++i) {
      path.add(new LatLng(pathJsArr.get(i)));
    }
    return path;
  }

  @Override
  public void setMap(HasMap map) {
    PolylineImpl.impl.setMap(jso, map.getJso());
  }

  @Override
  public void setOptions(HasPolylineOptions options) {
    PolylineImpl.impl.setOptions(jso, options.getJso());
  }

  @SuppressWarnings("unchecked")
  @Override
  public void setPath(List<HasLatLng> path) {
    JsArray<JavaScriptObject> pathJsArr = (JsArray<JavaScriptObject>) JavaScriptObject
        .createArray();
    for (HasLatLng latLng : path) {
      pathJsArr.push(latLng.getJso());
    }
    PolylineImpl.impl.setPath(jso, pathJsArr);
  }

}
