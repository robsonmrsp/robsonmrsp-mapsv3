package com.google.gwt.maps.client.geocoder;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.FieldName;
import com.google.gwt.jsio.client.JSFlyweightWrapper;
import com.google.gwt.jsio.client.JSList;

public interface AddressComponentImpl extends JSFlyweightWrapper {

  public AddressComponentImpl impl = GWT.create(AddressComponentImpl.class);
  
  @BeanProperties
  @FieldName("short_name")
  public String getShortName(JavaScriptObject jso);
  
  @BeanProperties
  @FieldName("long_name")
  public String getLongName(JavaScriptObject jso);
  
  @BeanProperties
  public JSList<String> getTypes(JavaScriptObject jso);
  
}
