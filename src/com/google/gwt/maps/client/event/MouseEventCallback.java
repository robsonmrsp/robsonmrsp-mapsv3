package com.google.gwt.maps.client.event;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Exported;
import com.google.gwt.jsio.client.JSFunction;

public abstract class MouseEventCallback extends JSFunction {

  public abstract void callback(HasMouseEvent event);
  
  @Exported
  public void callbackWrapper(JavaScriptObject jso) {
    final HasMouseEvent event = new MouseEvent(jso);
    callback(event);
  }
  
}
