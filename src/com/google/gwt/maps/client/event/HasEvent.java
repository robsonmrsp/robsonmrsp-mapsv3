package com.google.gwt.maps.client.event;

import com.google.gwt.maps.client.HasJso;

public interface HasEvent {

  public HasMapsEventListener addListener(
      HasJso instance, String eventName, EventCallback callback);
  
  public HasMapsEventListener addListener(
      HasJso instance, String eventName, MouseEventCallback callback);

  public HasMapsEventListener addListenerOnce(
      HasJso instance, String eventName, EventCallback callback);
  
  public HasMapsEventListener addListenerOnce(
      HasJso instance, String eventName, MouseEventCallback callback);
  
  public void clearInstanceListeners(HasJso instance);
  
  public void clearListeners(HasJso instance, String eventName);
  
  public void removeListener(HasMapsEventListener listener);
  
}
