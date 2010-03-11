package com.google.gwt.maps.client;

import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.HasPoint;

/**
 * @author vinay.sekhri@gmail.com (Vinay Sekhri)
 */
public interface HasMapCanvasProjection extends HasJso {

  /**
   * Computes the geographical coordinates from pixel coordinates in the map's container.
   */
  public HasLatLng fromContainerPixelToLatLng(HasPoint pixel);

  /**
   * Computes the geographical coordinates from pixel coordinates in the div
   * that holds the draggable map.
   */
  public HasLatLng fromDivPixelToLatLng(HasPoint pixel);

  /**
   * Computes the pixel coordinates of the given geographical location in the
   * DOM element the map's outer container.
   */
  public HasPoint fromLatLngToContainerPixel(HasLatLng latLng);

  /**
   * Computes the pixel coordinates of the given geographical location in the
   * DOM element that holds the draggable map.
   */
  public HasPoint fromLatLngToDivPixel(HasLatLng latLng);
  
  /**
   * The width of the world in pixels in the current zoom level.
   */
  public int getWorldWidth();
  
}
