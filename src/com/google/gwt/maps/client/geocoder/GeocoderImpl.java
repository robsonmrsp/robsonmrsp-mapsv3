package com.google.gwt.maps.client.geocoder;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface GeocoderImpl extends JSFlyweightWrapper {

  public GeocoderImpl impl = GWT.create(GeocoderImpl.class);
  
  @Constructor("$wnd.google.maps.Geocoder")
  public JavaScriptObject construct();

  public void geocode(JavaScriptObject jso, JavaScriptObject request, GeocoderCallback callback);
  
}
