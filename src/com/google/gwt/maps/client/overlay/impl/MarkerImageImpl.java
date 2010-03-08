package com.google.gwt.maps.client.overlay.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface MarkerImageImpl extends JSFlyweightWrapper {

  MarkerImageImpl impl = GWT.create(MarkerImageImpl.class);
  
  @Constructor("$wnd.google.maps.MarkerImage")
  JavaScriptObject construct(String url, JavaScriptObject size, JavaScriptObject origin,
      JavaScriptObject anchor, JavaScriptObject scaledSize);
  
}
