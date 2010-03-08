package com.google.gwt.maps.client.base;

import com.google.gwt.core.client.JavaScriptObject;

public interface HasPoint {
  
  public JavaScriptObject getJso();
  
  public boolean equalsTo(HasPoint other);
  
  public String toString();
  
  public int getX();
  
  public int getY();

}
