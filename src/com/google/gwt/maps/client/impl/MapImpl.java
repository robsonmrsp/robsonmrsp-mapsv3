package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;
import com.google.gwt.user.client.Element;

/**
 * JS interfacing with Map class.
 *
 * @author vinay.sekhri@gmail.com (Vinay Sekhri)
 */
public interface MapImpl extends JSFlyweightWrapper {

  MapImpl impl = GWT.create(MapImpl.class);
  
  @Constructor("$wnd.google.maps.Map")
  JavaScriptObject construct(Element mapDiv);
  
  @Constructor("$wnd.google.maps.Map")
  JavaScriptObject construct(Element mapDiv, JavaScriptObject mapOptions);

  public void fitBounds(JavaScriptObject jso, JavaScriptObject bounds);
  
  public JavaScriptObject getBounds(JavaScriptObject jso);
  
  public JavaScriptObject getCenter(JavaScriptObject jso);
  
  public Element getDiv(JavaScriptObject jso);
  
  public String getMapTypeId(JavaScriptObject jso);
  
  int getZoom(JavaScriptObject jso);
  
  void panBy(JavaScriptObject jso, int x, int y);
  
  void panTo(JavaScriptObject jso, JavaScriptObject latLng);
  
  void panToBounds(JavaScriptObject jso, JavaScriptObject bounds);
  
  void setCenter(JavaScriptObject jso, JavaScriptObject latLng);
  
  void setMapTypeId(JavaScriptObject jso, String mapTypeId);
  
  void setOptions(JavaScriptObject jso, JavaScriptObject options);
  
  void setZoom(JavaScriptObject jso, int zoom);
  
}
