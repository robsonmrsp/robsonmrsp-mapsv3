package com.google.gwt.maps.client.event.impl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.event.EventCallback;
import com.google.gwt.maps.client.event.MouseEventCallback;

public class EventImpl {
  
  public static EventImpl impl = new EventImpl();
  
  public native JavaScriptObject addListener(JavaScriptObject i, String en, EventCallback c) /*-{
    var cbk = function() {
      var cb = c;
      cb.@com.google.gwt.maps.client.event.EventCallback::callback()();
    }
    return $wnd.google.maps.event.addListener(i, en, cbk);
  }-*/;
  
  public native JavaScriptObject addListenerOnce(
      JavaScriptObject i, String en, EventCallback c) /*-{
    var cbk = function() {
      var cb = c;
      cb.@com.google.gwt.maps.client.event.EventCallback::callback()();
    }
    return $wnd.google.maps.event.addListenerOnce(i, en, cbk);
  }-*/;
  
  public native JavaScriptObject addMouseListener(
      JavaScriptObject i, String en, MouseEventCallback c) /*-{
    var cbk = function(j) {
      var cb = c;
      cb.@com.google.gwt.maps.client.event.MouseEventCallback::callbackWrapper(Lcom/google/gwt/core/client/JavaScriptObject;)(j);
    }
    return $wnd.google.maps.event.addListener(i, en, cbk);
  }-*/;
  
  public native JavaScriptObject addMouseListenerOnce(
      JavaScriptObject i, String en, MouseEventCallback c) /*-{
    var cbk = function(j) {
      var cb = c;
      cb.@com.google.gwt.maps.client.event.MouseEventCallback::callbackWrapper(Lcom/google/gwt/core/client/JavaScriptObject;)(j);
    }
    return $wnd.google.maps.event.addListenerOnce(i, en, cbk);
  }-*/;
  
  public native void clearInstanceListeners(JavaScriptObject i) /*-{
    $wnd.google.maps.event.clearInstanceListeners(i);
  }-*/;
  
  public native void clearListeners(JavaScriptObject i, String en) /*-{
    $wnd.google.maps.event.clearListeners(i, en);
  }-*/;
  
  public native void removeListener(JavaScriptObject l) /*-{
    $wnd.google.maps.event.removeListener(l);
  }-*/;
  
  public native void trigger(JavaScriptObject i, String n) /*-{
    $wnd.google.maps.event.trigger(i, n);
  }-*/;
  
}
