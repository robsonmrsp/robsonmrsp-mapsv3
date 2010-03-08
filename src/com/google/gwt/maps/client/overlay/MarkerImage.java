package com.google.gwt.maps.client.overlay;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.HasPoint;
import com.google.gwt.maps.client.base.HasSize;
import com.google.gwt.maps.client.overlay.impl.MarkerImageImpl;

public class MarkerImage implements HasMarkerImage {
  
  final private JavaScriptObject jso;
  
  public MarkerImage(final JavaScriptObject jso) {
    this.jso = jso;
  }
  
  public MarkerImage(String url, HasSize size, HasPoint origin, HasPoint anchor,
      HasSize scaledSize) {
    this(MarkerImageImpl.impl
        .construct(url, size.getJso(), origin.getJso(), anchor.getJso(), scaledSize.getJso()));
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
