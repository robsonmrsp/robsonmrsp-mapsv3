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
package com.google.gwt.maps.client.overlay;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.Exported;
import com.google.gwt.maps.client.HasMap;
import com.google.gwt.maps.client.HasMapCanvasProjection;
import com.google.gwt.maps.client.Map;
import com.google.gwt.maps.client.MapCanvasProjection;
import com.google.gwt.maps.client.mvc.MVCObject;
import com.google.gwt.maps.client.overlay.impl.OverlayViewImpl;

/**
 * 
 *
 * @author vinay.sekhri@gmail.com (Vinay Sekhri)
 */
public abstract class OverlayView extends MVCObject implements HasOverlayView {
  
  private final JavaScriptObject jso;
  
  public OverlayView(JavaScriptObject jso) {
    this.jso = jso;
    OverlayViewImpl.impl.bind(jso, this);
  }
  
  public OverlayView() {
    this(OverlayViewImpl.impl.construct());
  }
  
  @Override
  public HasMap getMap() {
    return new Map(OverlayViewImpl.impl.getMap(jso));
  }
  
  public JavaScriptObject getPanes() {
    return OverlayViewImpl.impl.getPanes(jso);
  }
  
  @Override
  public HasMapCanvasProjection getProjection() {
    return new MapCanvasProjection(OverlayViewImpl.impl.getProjection(jso));
  }
  
  @Override
  public void setMap(HasMap map) {
    OverlayViewImpl.impl.setMap(jso, map.getJso());
  }
  
  @Exported
  @Override
  public abstract void draw();
  
  @Exported
  @Override
  public abstract void onAdd();
  
  @Exported
  @Override
  public abstract void onRemove();
  
  @Override
  public JavaScriptObject getJso() {
    return jso;
  }

}
