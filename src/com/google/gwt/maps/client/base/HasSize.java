package com.google.gwt.maps.client.base;

import com.google.gwt.core.client.JavaScriptObject;

public interface HasSize {
  
  public JavaScriptObject getJso();
  
  public boolean equalsTo(HasSize other);
  
  public String toString();
  
  public int getHeight();
  
  public int getWidth();

}
