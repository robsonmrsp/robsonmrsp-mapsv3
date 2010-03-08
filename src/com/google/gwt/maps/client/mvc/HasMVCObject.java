package com.google.gwt.maps.client.mvc;

import com.google.gwt.core.client.JavaScriptObject;

public interface HasMVCObject {

  public JavaScriptObject getJso();

  public void bindTo(String key, HasMVCObject target);
  
  public void changed(String key);
  
  JavaScriptObject get(String key);
  
  void notify(String key);
  
  void set(String key, JavaScriptObject value);
  
  void setValues(JavaScriptObject values);
  
  void unbind(String key);
  
  void unbindAll();
  
}
