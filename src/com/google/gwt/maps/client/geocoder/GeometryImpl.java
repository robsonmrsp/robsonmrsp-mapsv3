package com.google.gwt.maps.client.geocoder;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.FieldName;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface GeometryImpl extends JSFlyweightWrapper {

  public GeometryImpl impl = GWT.create(GeometryImpl.class);
  
  @BeanProperties
  @FieldName("location")
  public JavaScriptObject getLocation(JavaScriptObject jso);
  
  @BeanProperties
  @FieldName("location_type")
  public String getLocationType(JavaScriptObject jso);
  
  @BeanProperties
  public JavaScriptObject getViewport(JavaScriptObject jso);
  
  @BeanProperties
  public JavaScriptObject getBounds(JavaScriptObject jso); // optional.
  
}
