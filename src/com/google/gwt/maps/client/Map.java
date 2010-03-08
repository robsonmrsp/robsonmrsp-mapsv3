package com.google.gwt.maps.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.HasLatLngBounds;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;
import com.google.gwt.maps.client.impl.MapImpl;
import com.google.gwt.maps.client.mvc.MVCObject;
import com.google.gwt.user.client.Element;

public class Map extends MVCObject implements HasMap {
  
  final private JavaScriptObject jso;
  
  public Map(JavaScriptObject jso) {
    this.jso = jso;
  }
  
  public Map(Element mapDiv) {
    this(MapImpl.impl.construct(mapDiv));
  }
  
  public Map(Element mapDiv, HasMapOptions mapOptions) {
    this(MapImpl.impl.construct(mapDiv, mapOptions.getJso()));
  }

  @Override
  public void fitBounds(HasLatLngBounds bounds) {
    MapImpl.impl.fitBounds(jso, bounds.getJso());
  }

  @Override
  public HasLatLngBounds getBounds() {
    return new LatLngBounds(MapImpl.impl.getBounds(jso));
  }

  @Override
  public HasLatLng getCenter() {
    return new LatLng(MapImpl.impl.getCenter(jso));
  }

  @Override
  public Element getDiv() {
    return MapImpl.impl.getDiv(jso);
  }

  @Override
  public String getMapTypeId() {
    return MapImpl.impl.getMapTypeId(jso);
  }

  @Override
  public int getZoom() {
    return MapImpl.impl.getZoom(jso);
  }

  @Override
  public void panBy(int x, int y) {
    MapImpl.impl.panBy(jso, x, y);
  }

  @Override
  public void panTo(HasLatLng latLng) {
    MapImpl.impl.panTo(jso, latLng.getJso());
  }

  @Override
  public void panToBounds(HasLatLngBounds bounds) {
    MapImpl.impl.panToBounds(jso, bounds.getJso());
  }

  @Override
  public void setCenter(HasLatLng latLng) {
    MapImpl.impl.setCenter(jso, latLng.getJso());
  }

  @Override
  public void setMapTypeId(String mapTypeId) {
    MapImpl.impl.setMapTypeId(jso, mapTypeId);
  }

  @Override
  public void setOptions(HasMapOptions options) {
    MapImpl.impl.setOptions(jso, options.getJso());
  }

  @Override
  public void setZoom(int zoom) {
    MapImpl.impl.setZoom(jso, zoom);
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
