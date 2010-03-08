package com.google.gwt.maps.client.geocoder;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.HasLatLngBounds;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.base.LatLngBounds;

public class GeocoderRequest implements HasGeocoderRequest {

  final private JavaScriptObject jso;
  
  public GeocoderRequest(final JavaScriptObject jso) {
    this.jso = jso;
  }
  
  public GeocoderRequest() {
    this(GeocoderRequestImpl.impl.construct());
  }

  @Override
  public String getAddress() {
    return GeocoderRequestImpl.impl.getAddress(jso);
  }

  @Override
  public HasLatLngBounds getBounds() {
    return new LatLngBounds(GeocoderRequestImpl.impl.getBounds(jso));
  }

  @Override
  public String getLanguage() {
    return GeocoderRequestImpl.impl.getLanguage(jso);
  }

  @Override
  public HasLatLng getLatLng() {
    return new LatLng(GeocoderRequestImpl.impl.getLatLng(jso));
  }

  @Override
  public String getRegion() {
    return GeocoderRequestImpl.impl.getRegion(jso);
  }

  @Override
  public void setAddress(String address) {
    GeocoderRequestImpl.impl.setAddress(jso, address);
  }

  @Override
  public void setBounds(HasLatLngBounds bounds) {
    GeocoderRequestImpl.impl.setBounds(jso, bounds.getJso());
  }

  @Override
  public void setLanguage(String language) {
    GeocoderRequestImpl.impl.setLanguage(jso, language);
  }

  @Override
  public void setLatLng(HasLatLng latLng) {
    GeocoderRequestImpl.impl.setLatLng(jso, latLng.getJso());
  }

  @Override
  public void setRegion(String region) {
    GeocoderRequestImpl.impl.setRegion(jso, region);
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
