package com.google.gwt.maps.client.mvc;

import com.google.gwt.core.client.JavaScriptObject;

public interface HasMVCObject {

  public JavaScriptObject getJso();

  public void bindTo(String key, HasMVCObject target);
  
  public void changed(String key);
}
