package com.google.gwt.maps.client.directions;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Exported;
import com.google.gwt.jsio.client.JSFunction;

public abstract class DirectionsCallback extends JSFunction {
  
  public abstract void callback(HasDirectionsResult response, String status);
  
  @Exported
  public void callbackWrapper(JavaScriptObject responseJso, String status) {
    if (responseJso == null) {
      callback(null, status);
    }
    HasDirectionsResult response = new DirectionsResult(responseJso);
    callback(response, status);
  }
  
}
