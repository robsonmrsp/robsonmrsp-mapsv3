package com.google.gwt.maps.client.geocoder;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface GeocoderRequestImpl extends JSFlyweightWrapper {

  public GeocoderRequestImpl impl = GWT.create(GeocoderRequestImpl.class);
  
  @Constructor("Object")
  public JavaScriptObject construct();
  
  @BeanProperties
  public String getAddress(JavaScriptObject jso);
  
  @BeanProperties
  public void setAddress(JavaScriptObject jso, String address);
  
  @BeanProperties
  public JavaScriptObject getBounds(JavaScriptObject jso);
  
  @BeanProperties
  public void setBounds(JavaScriptObject jso, JavaScriptObject bounds);
  
  @BeanProperties
  public String getLanguage(JavaScriptObject jso);
  
  @BeanProperties
  public void setLanguage(JavaScriptObject jso, String language);
  
  @BeanProperties
  public JavaScriptObject getLatLng(JavaScriptObject jso);
  
  @BeanProperties
  public void setLatLng(JavaScriptObject jso, JavaScriptObject latLng);
  
  @BeanProperties
  public String getRegion(JavaScriptObject jso);
  
  @BeanProperties
  public void setRegion(JavaScriptObject jso, String region);
}
