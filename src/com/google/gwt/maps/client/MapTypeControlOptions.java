package com.google.gwt.maps.client;

import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.maps.client.impl.ControlPositionImpl;
import com.google.gwt.maps.client.impl.MapTypeControlOptionsImpl;
import com.google.gwt.maps.client.impl.MapTypeControlStyleImpl;

public class MapTypeControlOptions implements HasMapTypeControlOptions {

  final private JavaScriptObject jso;
  final private ControlPositionImpl controlPositionImpl;
  final private MapTypeControlStyleImpl mapTypeControlStyleImpl;
  
  public MapTypeControlOptions(JavaScriptObject jso,
      ControlPositionImpl controlPositionImpl,
      MapTypeControlStyleImpl mapTypeControlStyleImpl) {
    this.jso = jso;
    this.controlPositionImpl = controlPositionImpl;
    this.mapTypeControlStyleImpl = mapTypeControlStyleImpl;
  }

  public MapTypeControlOptions(ControlPositionImpl controlPositionImpl,
      MapTypeControlStyleImpl mapTypeControlStyleImpl) {
    this(MapTypeControlOptionsImpl.impl.construct(), controlPositionImpl, mapTypeControlStyleImpl);
  }
  
  @Override
  public void setMapTypeIds(List<String> mapTypeIds) {
    JsArrayString ids = (JsArrayString) JavaScriptObject.createArray();
    MapTypeControlOptionsImpl.impl.setMapTypeIds(ids, ids);
  }

  @Override
  public void setPosition(ControlPosition position) {
    MapTypeControlOptionsImpl.impl.setPosition(jso,
        controlPositionImpl.getValue(position));
  }

  @Override
  public void setStyle(MapTypeControlStyle style) {
    MapTypeControlOptionsImpl.impl.setStyle(jso,
        mapTypeControlStyleImpl.getValue(style));
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
