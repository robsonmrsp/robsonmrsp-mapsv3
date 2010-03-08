package com.google.gwt.maps.client.geocoder;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;

public class AddressComponent implements HasAddressComponent {

  final private JavaScriptObject jso;
  
  public AddressComponent(final JavaScriptObject jso) {
    this.jso = jso;
  }

  @Override
  public String getLongName() {
    return AddressComponentImpl.impl.getLongName(jso);
  }

  @Override
  public String getShortName() {
    return AddressComponentImpl.impl.getShortName(jso);
  }

  @Override
  public List<String> getTypes() {
    final List<String> types = new ArrayList<String>();
    types.addAll(AddressComponentImpl.impl.getTypes(jso));
    return types;
  }

  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
