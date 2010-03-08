package com.google.gwt.maps.client.geocoder;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Exported;
import com.google.gwt.jsio.client.JSFunction;
import com.google.gwt.jsio.client.JSList;

public abstract class GeocoderCallback extends JSFunction {
  
  public abstract void callback(List<HasGeocoderResponse> responses, String status);
  
  @Exported
  public void callbackWrapper(JSList<JavaScriptObject> response, String status) {
    List<HasGeocoderResponse> responses = new ArrayList<HasGeocoderResponse>();
    for (JavaScriptObject jso : response) {
      responses.add(new GeocoderResponse(jso));
    }
    callback(responses, status);
  }
  
}
