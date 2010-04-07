/* Copyright (c) 2010 Vinay Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.gwt.maps.sample.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.maps.client.HasJso;
import com.google.gwt.maps.client.HasMap;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.event.Event;
import com.google.gwt.maps.client.event.EventCallback;
import com.google.gwt.maps.client.overlay.HasMarker;
import com.google.gwt.maps.client.overlay.Marker;
import com.google.gwt.maps.sample.client.presenter.EventSimplePresenter.Display;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Simple event sample ui.
 *
 * @author vinay.sekhri@gmail.com (Vinay Sekhri)
 */
public class EventSimpleView extends Composite implements Display {
  
  final private static int ZOOM = 8;
  final private static LatLng CENTER = new LatLng(-34.397, 150.644);
  final private static String MAP_TYPE = new MapTypeId().getRoadmap();
  
  final private MapWidget mapWidget;
  final private Marker marker;

  private static EventSimpleViewUiBinder uiBinder = GWT
      .create(EventSimpleViewUiBinder.class);

  @UiTemplate("SimpleView.ui.xml")
  interface EventSimpleViewUiBinder extends UiBinder<Widget, EventSimpleView> {
  }
  
  @UiField
  Anchor presenterLink;
  @UiField
  Anchor viewLink;
  @UiField
  SimplePanel mapWrapper;

  public EventSimpleView() {
    initWidget(uiBinder.createAndBindUi(this));
    final MapOptions options = new MapOptions();
    options.setZoom(ZOOM);
    options.setCenter(CENTER);
    options.setMapTypeId(MAP_TYPE);
    options.setDraggable(true);
    options.setNavigationControl(true);
    options.setMapTypeControl(true);
    mapWidget = new MapWidget(options);
    mapWrapper.setWidget(mapWidget);
    mapWidget.setSize("800px", "600px");
    
    marker = new Marker();
    marker.setPosition(CENTER);
    marker.setMap(getMap());
    marker.setTitle("Hello World!");
  }

  @Override
  public void addListener(final HasJso instance, final String eventName,
      final EventCallback callback) {
    Event.addListener(instance, eventName, callback);
  }

  @Override
  public void clearInstanceListeners(final HasJso instance) {
    Event.clearInstanceListeners(instance);
  }

  @Override
  public HasMap getMap() {
    return mapWidget.getMap();
  }

  @Override
  public HasMarker getMarker() {
    return marker;
  }

  @Override
  public Widget asWidget() {
    return this;
  }

  @Override
  public void setPresenterLink(String url) {
    presenterLink.setHref(url);
    presenterLink.setText(url);
  }

  @Override
  public void setViewLink(String url) {
    viewLink.setHref(url);
    viewLink.setText(url);
  }

}
