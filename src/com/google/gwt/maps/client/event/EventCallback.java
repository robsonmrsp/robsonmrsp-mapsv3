package com.google.gwt.maps.client.event;

import com.google.gwt.jsio.client.Exported;
import com.google.gwt.jsio.client.JSFunction;

public abstract class EventCallback extends JSFunction {

  @Exported
  public abstract void callback();
  
}
