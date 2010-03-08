package com.google.gwt.maps.client.geocoder;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.FieldName;
import com.google.gwt.jsio.client.JSFlyweightWrapper;
import com.google.gwt.jsio.client.JSList;

public interface GeocoderResponseImpl extends JSFlyweightWrapper {

  public GeocoderResponseImpl impl = GWT.create(GeocoderResponseImpl.class);
  
  @BeanProperties
  public JSList<String> getTypes(JavaScriptObject jso);
  
  @BeanProperties
  @FieldName("formatted_address")
  public String getFormattedAddress(JavaScriptObject jso);
  
  @BeanProperties
  @FieldName("address_components")
  public JSList<JavaScriptObject> getAddressComponents(JavaScriptObject jso);
  
  @BeanProperties
  public JavaScriptObject getGeometry(JavaScriptObject jso);

}
