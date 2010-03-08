package com.google.gwt.maps.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.HasPoint;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.Point;
import com.google.gwt.maps.client.impl.MapCanvasProjectionImpl;

public class MapCanvasProjection implements HasMapCanvasProjection {

  final private JavaScriptObject jso;
  
  public MapCanvasProjection(JavaScriptObject jso) {
    this.jso = jso;
  }

  @Override
  public HasLatLng fromContainerPixelToLatLng(HasPoint pixel) {
    return new LatLng(
        MapCanvasProjectionImpl.impl.fromContainerPixelToLatLng(jso, pixel.getJso()));
  }

  @Override
  public HasLatLng fromDivPixelToLatLng(HasPoint pixel) {
    return new LatLng(
        MapCanvasProjectionImpl.impl.fromDivPixelToLatLng(jso, pixel.getJso()));
  }

  @Override
  public HasPoint fromLatLngToContainerPixel(HasLatLng latLng) {
    return new Point(
        MapCanvasProjectionImpl.impl.fromLatLngToContainerPixel(jso, latLng.getJso()));
  }

  @Override
  public HasPoint fromLatLngToDivPixel(HasLatLng latLng) {
    return new Point(
        MapCanvasProjectionImpl.impl.fromLatLngToDivPixel(jso, latLng.getJso()));
  }

  @Override
  public int getWorldWidth() {
    return MapCanvasProjectionImpl.impl.getWorldWidth(jso);
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
