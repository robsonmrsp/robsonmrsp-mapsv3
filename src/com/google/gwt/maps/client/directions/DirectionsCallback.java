package com.google.gwt.maps.client.directions;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Exported;
import com.google.gwt.jsio.client.JSFunction;
import com.google.gwt.json.client.JSONObject;

public abstract class DirectionsCallback extends JSFunction {
  
  public abstract void callback(HasDirectionsResult response, String status);
  
  @Exported
  public void callbackWrapper(JavaScriptObject responseJso, String status) {
    if (responseJso == null) {
      callback(null, status);
    }
    
//    GWT.log(new JSONObject(responseJso).toString(), null);
    
    HasDirectionsResult response = new DirectionsResult(responseJso);
    callback(response, status);
  }
  
}
