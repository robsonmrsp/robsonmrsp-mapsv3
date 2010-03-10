package com.google.gwt.maps.client;

import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.maps.client.base.HasLatLng;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.directions.DirectionsCallback;
import com.google.gwt.maps.client.directions.DirectionsRequest;
import com.google.gwt.maps.client.directions.DirectionsService;
import com.google.gwt.maps.client.directions.DirectionsTravelMode;
import com.google.gwt.maps.client.directions.HasDirectionsRequest;
import com.google.gwt.maps.client.directions.HasDirectionsResult;
import com.google.gwt.maps.client.directions.HasDirectionsRoute;
import com.google.gwt.maps.client.directions.HasDirectionsService;
import com.google.gwt.maps.client.directions.HasDirectionsStep;
import com.google.gwt.maps.client.directions.HasDirectionsTrip;
import com.google.gwt.maps.client.event.Event;
import com.google.gwt.maps.client.event.EventCallback;
import com.google.gwt.maps.client.geocoder.Geocoder;
import com.google.gwt.maps.client.geocoder.GeocoderCallback;
import com.google.gwt.maps.client.geocoder.GeocoderRequest;
import com.google.gwt.maps.client.geocoder.HasGeocoder;
import com.google.gwt.maps.client.geocoder.HasGeocoderRequest;
import com.google.gwt.maps.client.geocoder.HasGeocoderResponse;
import com.google.gwt.maps.client.impl.ControlPositionImpl;
import com.google.gwt.maps.client.impl.MapTypeControlStyleImpl;
import com.google.gwt.maps.client.impl.NavigationControlStyleImpl;
import com.google.gwt.maps.client.impl.ScaleControlStyleImpl;
import com.google.gwt.maps.client.overlay.HasMarker;
import com.google.gwt.maps.client.overlay.Marker;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;

public class MapsSample implements EntryPoint {

  @Override
  public void onModuleLoad() {
    MapWidget mapWidget = getMapWidget();
    mapWidget.setSize("100%", "100%");
    RootPanel.get().add(mapWidget);
    
    HasMarker marker = new Marker();
    marker.setPosition(new LatLng(-34.397, 150.644));
    marker.setMap(mapWidget.getMap());
    marker.setDraggable(true);
    marker.setClickable(true);
    
//    HasMapsEventListener listener
//        = Event.addListener(marker, HasMarker.Event.DRAG.getValue(), new MouseEventCallback() {
//      
//      @Override
//      public void callback(HasMouseEvent event) {
//        GWT.log("drag end at : " + event.getLatLng().toString(), null);
////        GWT.log("drag end at : ", null);
//      }
//    });
//    export(listener.getJso());
//    GWT.log("listener : " + new JSONObject(listener.getJso()).toString(), null);
    
    Event.addListener(marker, HasMarker.Event.DRAG_ENG.getValue(), new EventCallback() {
      
      @Override
      public void callback() {
        Window.alert("drag end ");
      }
    });
    
//    Event.removeListener(listener);
//    testGeocoder();
  }
  
  protected native void export(JavaScriptObject listener) /*-{
    $wnd.dragListener = listener;
  }-*/;
  
  protected MapWidget getMapWidget() {
    HasLatLng center = new LatLng(-34.397, 150.644);
    int zoom = 9;
    String mapTypeId = new MapTypeId().getRoadmap();
    HasNavigationControlOptions navOptions = new NavigationControlOptions(new ControlPositionImpl(), new NavigationControlStyleImpl());
    navOptions.setPosition(ControlPosition.TOP_LEFT);
    navOptions.setStyle(NavigationControlStyle.DEFAULT);
    HasScaleControlOptions scaleOptions = new ScaleControlOptions(new ControlPositionImpl(), new ScaleControlStyleImpl());
    scaleOptions.setStyle(ScaleControlStyle.DEFAULT);
    HasMapTypeControlOptions mapTypeOptions = new MapTypeControlOptions(new ControlPositionImpl(), new MapTypeControlStyleImpl());
    mapTypeOptions.setStyle(MapTypeControlStyle.DROPDOWN_MENU);
    
    HasMapOptions options = new MapOptions();
    options.setCenter(center);
    options.setZoom(zoom);
    options.setMapTypeId(mapTypeId);
    options.setNavigationControl(true);
    options.setNavigationControlOptions(navOptions);
    options.setScaleControl(true);
    options.setScaleControlOptions(scaleOptions);
    options.setMapTypeControl(true);
    options.setMapTypeControlOptions(mapTypeOptions);
    
    return new MapWidget(options);
  }
  
  protected void testGeocoder() {
    final String address = "10 10th St NW, Atlanta, GA 30309, USA";
    final HasGeocoderRequest request = new GeocoderRequest();
    request.setAddress(address);
    
    final HasGeocoder geocoder = new Geocoder();
    geocoder.geocode(request, new GeocoderCallback() {
      
      @Override
      public void callback(List<HasGeocoderResponse> responses, String status) {
        GWT.log(status, null);
//        Window.alert("geocoder responses : " + responses.size());
        testDirectionsServiceRoute();
      }
    });
  }
  
  protected void testDirectionsServiceRoute() {
    final HasDirectionsRequest request = new DirectionsRequest();
    request.setTravelMode(new DirectionsTravelMode().Driving());
    request.setOriginString("Delhi, India");
    request.setDestinationString("Agra, Uttar Pradesh, India");
    
    GWT.log(new JSONObject(request.getJso()).toString(), null);
    
    final DirectionsCallback callback = new DirectionsCallback() {
      
      @Override
      public void callback(HasDirectionsResult response, String status) {
        GWT.log(status, null);
//        Window.alert("route responses : " + responses.size());
        
//        GWT.log(new JSONObject(response.getJso()).toString(), null);
        
        final List<HasDirectionsTrip> trips = response.getTrips();
        final HasDirectionsTrip trip = trips.get(0);
        GWT.log(trip.getCopyrights(), null);
        GWT.log(trip.getWarnings().toString(), null);
        
        final List<HasDirectionsRoute> routes = trip.getRoutes();
        final HasDirectionsRoute route = routes.get(0);
        
        GWT.log("distance : " + route.getDistance().getText(), null);
        GWT.log("lat : " + route.getStartGeocode().getGeometry().getLocation().getLatitude(), null);
        
        final List<HasDirectionsStep> steps = route.getSteps();
        final HasDirectionsStep step = steps.get(0);
        
        GWT.log("step 1 latlng : " + step.getInstructions(), null);
        GWT.log(step.getStartPoint().toUrlValue(), null);
        GWT.log(step.getEncodedLatLngs(), null);
        
        final List<HasLatLng> latLngs = step.getLatLngs();
        GWT.log("step lat_lng : " + latLngs.get(0).toString(), null);
      }
      
    };
    
    final HasDirectionsService service = new DirectionsService();
    service.route(request, callback);
  }

}
