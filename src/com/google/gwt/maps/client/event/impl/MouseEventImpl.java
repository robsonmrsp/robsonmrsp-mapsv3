package com.google.gwt.maps.client.event.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

@BeanProperties
public interface MouseEventImpl extends JSFlyweightWrapper {
  
  public MouseEventImpl impl = GWT.create(MouseEventImpl.class);

  public JavaScriptObject getLatLng(JavaScriptObject jso);
  
}
