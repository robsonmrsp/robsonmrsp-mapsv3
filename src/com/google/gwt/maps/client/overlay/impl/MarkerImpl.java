package com.google.gwt.maps.client.overlay.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;

public interface MarkerImpl extends MarkerOptionsImpl {

  MarkerImpl impl = GWT.create(MarkerImpl.class);
  
  @Constructor("$wnd.google.maps.Marker")
  JavaScriptObject construct();
  
  @Constructor("$wnd.google.maps.Marker")
  JavaScriptObject construct(JavaScriptObject options);

}
