package com.google.gwt.maps.client.directions;

import com.google.gwt.core.client.JavaScriptObject;

public interface HasTextAndValue {

  public JavaScriptObject getJso();
  
  public String getText();
  
  public double getValue();
  
}
