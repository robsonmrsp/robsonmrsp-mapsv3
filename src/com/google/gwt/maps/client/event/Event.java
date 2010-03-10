package com.google.gwt.maps.client.event;

import com.google.gwt.maps.client.HasJso;
import com.google.gwt.maps.client.event.impl.EventImpl;

public class Event {

  public static HasMapsEventListener addListener(HasJso instance, String eventName,
      EventCallback callback) {
    final HasMapsEventListener listener = new MapsEventListener(EventImpl.impl
        .addListener(instance.getJso(), eventName, callback));
    return listener;
  }

  
  public static HasMapsEventListener addListener(HasJso instance, String eventName,
      MouseEventCallback callback) {
    final HasMapsEventListener listener = new MapsEventListener(EventImpl.impl
        .addMouseListener(instance.getJso(), eventName, callback));
    return listener;
  }


  public static HasMapsEventListener addListenerOnce(HasJso instance, String eventName,
      EventCallback callback) {
    final HasMapsEventListener listener = new MapsEventListener(EventImpl.impl
        .addListenerOnce(instance.getJso(), eventName, callback));
    return listener;
  }

  
  public static HasMapsEventListener addListenerOnce(HasJso instance, String eventName,
      MouseEventCallback callback) {
    final HasMapsEventListener listener = new MapsEventListener(EventImpl.impl
        .addMouseListenerOnce(instance.getJso(), eventName, callback));
    return listener;
  }
  
  public static void clearInstanceListeners(HasJso instance) {
    EventImpl.impl.clearInstanceListeners(instance.getJso());
  }

  
  public static void clearListeners(HasJso instance, String eventName) {
    EventImpl.impl.clearListeners(instance.getJso(), eventName);
  }

  
  public static void removeListener(HasMapsEventListener listener) {
    EventImpl.impl.removeListener(listener.getJso());
  }

}
