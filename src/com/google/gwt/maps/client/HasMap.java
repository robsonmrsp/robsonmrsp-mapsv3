package com.google.gwt.maps.client;

import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.HasLatLngBounds;
import com.google.gwt.user.client.Element;

/**
 * @author vinay.sekhri@gmail.com (Vinay Sekhri)
 */
public interface HasMap extends HasJso {

  /**
   * Sets the maps to fit to the given bounds.
   */
  public void fitBounds(HasLatLngBounds bounds);
  
  /**
   * Returns the lat/lng bounds of the current viewport.
   * If the map is not yet initialized (i.e. the mapType is still null),
   * or center and zoom have not been set then the result is null.
   */
  public HasLatLngBounds getBounds();
  
  public HasLatLng getCenter();
  
  public Element getDiv();
  
  public String getMapTypeId();
  
  int getZoom();

  /**
   * Changes the center of the map by the given distance in pixels. If the
   * distance is less than both the width and height of the map, the transition
   * will be smoothly animated. Note that the map coordinate system increases
   * from west to east (for x values) and north to south (for y values).
   */
  void panBy(int x, int y);

  /**
   * Changes the center of the map to the given LatLng. If the change is less
   * than both the width and height of the map, the transition will be smoothly
   * animated.
   */
  void panTo(HasLatLng latLng);

  /**
   * Pans the map by the minimum amount necessary to contain the given
   * LatLngBounds. It makes no guarantee where on the map the bounds will be,
   * except that as much of the bounds as possible will be visible. The bounds
   * will be positioned inside the area bounded by the map type and navigation
   * controls, if they are present on the map. If the bounds is larger than the
   * map, the map will be shifted to include the northwest corner of the bounds.
   * If the change in the map's position is less than both the width and height
   * of the map, the transition will be smoothly animated.
   */
  void panToBounds(HasLatLngBounds bounds);
  
  void setCenter(HasLatLng latLng);
  
  void setMapTypeId(String mapTypeId);
  
  void setOptions(HasMapOptions options);
  
  void setZoom(int zoom);
  
}
