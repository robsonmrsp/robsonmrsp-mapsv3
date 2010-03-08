package com.google.gwt.maps.client.event.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Global;
import com.google.gwt.jsio.client.JSFlyweightWrapper;
import com.google.gwt.maps.client.event.EventCallback;
import com.google.gwt.maps.client.event.MouseEventCallback;

public interface EventImpl extends JSFlyweightWrapper {
  
  public EventImpl impl = GWT.create(EventImpl.class);

  @Global("$wnd.google.maps.event.addListener")
  public JavaScriptObject addListener(JavaScriptObject instance, String eventName, EventCallback callback);

  @Global("$wnd.google.maps.event.addListenerOnce")
  public JavaScriptObject addListenerOnce(JavaScriptObject instance, String eventName, EventCallback callback);

  @Global("$wnd.google.maps.event.addListener")
  public JavaScriptObject addMouseListener(JavaScriptObject instance, String eventName, MouseEventCallback callback);

  @Global("$wnd.google.maps.event.addListenerOnce")
  public JavaScriptObject addMouseListenerOnce(JavaScriptObject instance, String eventName, MouseEventCallback callback);
  
  @Global("$wnd.google.maps.event.clearInstanceListeners")
  public void clearInstanceListeners(JavaScriptObject instance);
  
  @Global("$wnd.google.maps.event.clearListeners")
  public void clearListeners(JavaScriptObject instance, String eventName);
  
  @Global("$wnd.google.maps.event.removeListener")
  public void removeListener(JavaScriptObject listener);
  
}
