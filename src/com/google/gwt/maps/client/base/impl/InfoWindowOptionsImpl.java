package com.google.gwt.maps.client.base.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.BeanProperties;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.FieldName;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

@BeanProperties
public interface InfoWindowOptionsImpl extends JSFlyweightWrapper {

  public InfoWindowOptionsImpl impl = GWT.create(InfoWindowOptionsImpl.class);
  
  @Constructor("Object")
  public JavaScriptObject construct();
  
  public String getContent(JavaScriptObject jso);

  public void setContent(JavaScriptObject jso, String html);
  
  @FieldName("disableAutoPan")
  public boolean isDisableAutoPan(JavaScriptObject jso);
  
  public void setDisableAutoPan(JavaScriptObject jso, boolean disableAutoPan);
  
  public int getMaxWidth(JavaScriptObject jso);
  
  public void setMaxWidth(JavaScriptObject jso, int maxWidth);
  
  public JavaScriptObject getPixelOffset(JavaScriptObject jso);
  
  public void setPixelOffset(JavaScriptObject jso, JavaScriptObject size);
  
  public JavaScriptObject getPosition(JavaScriptObject jso);
  
  public void setPosition(JavaScriptObject jso, JavaScriptObject position);
  
  public int getZIndex(JavaScriptObject jso);
  
  public void setZIndex(JavaScriptObject jso, int zIndex);

}
