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
  public JavaScriptObject get(String key) {
    return MVCObjectImpl.impl.get(jso, key);
  }

  @Override
  public void notify(String key) {
    MVCObjectImpl.impl.notify(jso, key);
  }

  @Override
  public void set(String key, JavaScriptObject value) {
    MVCObjectImpl.impl.set(value, key, value);
  }

  @Override
  public void setValues(JavaScriptObject values) {
    MVCObjectImpl.impl.setValues(values, values);
  }

  @Override
  public void unbind(String key) {
    MVCObjectImpl.impl.unbind(jso, key);
  }

  @Override
  public void unbindAll() {
    MVCObjectImpl.impl.unbindAll(jso);
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
