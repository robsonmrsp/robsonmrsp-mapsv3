package com.google.gwt.maps.client.overlay;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.HasPoint;
import com.google.gwt.maps.client.base.HasSize;
import com.google.gwt.maps.client.overlay.impl.MarkerImageImpl;

public class MarkerImage implements HasMarkerImage {
  
  public static class Builder {
    final private String url;
    private JavaScriptObject size = null;
    private JavaScriptObject origin = null;
    private JavaScriptObject anchor = null;
    private JavaScriptObject scaledSize = null;
    
    public Builder(String url) {
      this.url = url;
    }
    
    public Builder setSize(HasSize size) {
      this.size = size.getJso();
      return this;
    }
    
    public Builder setOrigin(HasPoint origin) {
      this.origin = origin.getJso();
      return this;
    }
    
    public Builder setAnchor(HasPoint anchor) {
      this.anchor = anchor.getJso();
      return this;
    }
    
    public Builder setScaledSize(HasSize scaledSize) {
      this.scaledSize = scaledSize.getJso();
      return this;
    }
    
    public MarkerImage build() {
      return new MarkerImage(url, size, origin, anchor, scaledSize);
    }
  }
  
  final private JavaScriptObject jso;
  
  public MarkerImage(final JavaScriptObject jso) {
    this.jso = jso;
  }
  
  private MarkerImage(String url, JavaScriptObject size,
      JavaScriptObject origin, JavaScriptObject anchor,
      JavaScriptObject scaledSize) {
    this(MarkerImageImpl.impl.construct(url, size, origin, anchor, scaledSize));
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
