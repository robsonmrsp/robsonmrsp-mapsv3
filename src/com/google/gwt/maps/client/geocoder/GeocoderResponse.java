package com.google.gwt.maps.client.geocoder;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;

public class GeocoderResponse implements HasGeocoderResponse {

  final private JavaScriptObject jso;
  
  public GeocoderResponse(final JavaScriptObject jso) {
    this.jso = jso;
  }

  @Override
  public List<HasAddressComponent> getAddressComponents() {
    List<HasAddressComponent> acl = new ArrayList<HasAddressComponent>();
    for (JavaScriptObject ac : GeocoderResponseImpl.impl.getAddressComponents(jso)) {
      acl.add(new AddressComponent(ac));
    }
    return acl;
  }

  @Override
  public String getFormattedAddress() {
    return GeocoderResponseImpl.impl.getFormattedAddress(jso);
  }

  @Override
  public HasGeometry getGeometry() {
    return new Geometry(GeocoderResponseImpl.impl.getGeometry(jso));
  }

  @Override
  public List<String> getTypes() {
    List<String> types = new ArrayList<String>();
    types.addAll(GeocoderResponseImpl.impl.getTypes(jso));
    return types;
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
