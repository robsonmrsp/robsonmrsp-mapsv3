package com.google.gwt.maps.client.overlay.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface PolylineImpl extends JSFlyweightWrapper {

  PolylineImpl impl = GWT.create(PolylineImpl.class);
  
  @Constructor("$wnd.google.maps.Polyline")
  JavaScriptObject construct();
  
  @Constructor("$wnd.google.maps.Polyline")
  JavaScriptObject construct(JavaScriptObject options);
  
  JavaScriptObject getMap(JavaScriptObject jso);

  JsArray<JavaScriptObject> getPath(JavaScriptObject jso);

  void setMap(JavaScriptObject jso, JavaScriptObject map);

  void setOptions(JavaScriptObject jso, JavaScriptObject options);

  void setPath(JavaScriptObject jso, JsArray<JavaScriptObject> path);

}
