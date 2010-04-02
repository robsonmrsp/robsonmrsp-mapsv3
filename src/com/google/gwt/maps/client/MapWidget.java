package com.google.gwt.maps.client;

import com.google.gwt.dom.client.Document;
import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.HasLatLngBounds;
import com.google.gwt.maps.client.event.Event;
import com.google.gwt.user.client.ui.AnimatedLayout;
import com.google.gwt.user.client.ui.Widget;

public class MapWidget extends Widget {

  final private static String EXCEPTION_NOT_ATTACHED
      = "Map widget must be attached to window's document.";
  private HasMap map;
  
  public MapWidget(HasMapOptions options) {
    setElement(Document.get().createDivElement());
    map = new Map(getElement(), options);
  }
  
  public HasMap getMap() {
    return map;
  }

  /**
   * Note: Call this *after* you add it to a LayoutPanel. It will throw an exception if not done so.
   */
  public void fitBounds(HasLatLngBounds bounds) {
    if (!this.isAttached()) {
      throw new IllegalStateException(EXCEPTION_NOT_ATTACHED);
    }
    forceParentLayout(this.getParent());
    map.fitBounds(bounds);
  }

  /**
   * Recursive method that will fore layout everything from the root down
   */
  public void forceParentLayout(Widget w) {
    if (w == null)
      return;
    else
      forceParentLayout(w.getParent());
    if (w instanceof AnimatedLayout)
      ((AnimatedLayout) w).forceLayout();
  }

  @Override
  protected void onLoad() {
    super.onLoad();
    // Resize the map and retain the center.
    HasLatLng center = map.getCenter();
    Event.trigger(map, "resize");
    map.setCenter(center);
  }
  
}
