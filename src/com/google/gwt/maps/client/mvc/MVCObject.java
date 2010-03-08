package com.google.gwt.maps.client.mvc;

import com.google.gwt.core.client.JavaScriptObject;

public class MVCObject implements HasMVCObject {

  final private JavaScriptObject jso;
  
  public MVCObject(final JavaScriptObject jso) {
    this.jso = jso;
  }

  public MVCObject() {
    this(MVCObjectImpl.impl.construct());
  }
  
  @Override
  public void bindTo(String key, HasMVCObject target) {
    MVCObjectImpl.impl.bindTo(jso, key, target.getJso());
  }

  @Override
  public void changed(String key) {
    MVCObjectImpl.impl.changed(jso, key);
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
