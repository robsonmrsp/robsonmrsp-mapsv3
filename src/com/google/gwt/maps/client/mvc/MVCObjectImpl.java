package com.google.gwt.maps.client.mvc;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Constructor;
import com.google.gwt.jsio.client.JSFlyweightWrapper;

public interface MVCObjectImpl extends JSFlyweightWrapper {

  public MVCObjectImpl impl = GWT.create(MVCObjectImpl.class);
  
  @Constructor("$wnd.google.maps.MVCObject")
  public JavaScriptObject construct();

  public void bindTo(JavaScriptObject jso, String key, JavaScriptObject target);
  
  public void changed(JavaScriptObject jso, String key);
  
}
