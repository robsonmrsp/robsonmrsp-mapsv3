package com.google.gwt.maps.client;

import com.google.gwt.dom.client.Document;
import com.google.gwt.maps.client.base.HasLatLngBounds;
import com.google.gwt.user.client.ui.AnimatedLayout;
import com.google.gwt.user.client.ui.Widget;

public class MapWidget extends Widget {

  private HasMap map;
  
  public MapWidget(HasMapOptions options) {
    setElement(Document.get().createDivElement());
    map = new Map(getElement(), options);
  }
  
  public HasMap getMap() {
    return map;
  }

  /**
   * Note: Call this *after* you add it to a LayoutPanel
   */
  public void fitBounds(HasLatLngBounds bounds) {
    // Doesn't seem to work without this
    forceParentLayout(this.getParent());
    map.fitBounds(bounds);
  }

  /**
   * Recursive method that will fore layout everything from the root down
   */
  private void forceParentLayout(Widget w) {
    if (w == null)
      return;
    else
      forceParentLayout(w.getParent());
    if (w instanceof AnimatedLayout)
      ((AnimatedLayout) w).forceLayout();
  }
}
