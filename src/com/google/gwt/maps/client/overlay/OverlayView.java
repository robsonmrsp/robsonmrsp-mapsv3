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
import com.google.gwt.maps.client.HasMap;
import com.google.gwt.maps.client.HasMapCanvasProjection;

/**
 * 
 *
 * @author vinay.sekhri@gmail.com (Vinay Sekhri)
 */
public abstract class OverlayView implements HasOverlayView {
  
  public OverlayView() {
    super();
    init(this);
    setDraw(this);
    setOnAdd(this);
    setOnRemove(this);
  }
  
  native void init(OverlayView view) /*-{
    OverlayView.prototype = $wnd.google.maps.OverlayView.protoype;
  }-*/;
  
  native void setDraw(OverlayView view) /*-{
    this.prototype.draw = function() {
      view.@com.google.gwt.maps.client.overlay.OverlayView::draw()();
    }
  }-*/;
  
  native void setOnAdd(OverlayView view) /*-{
    this.prototype.onAdd = function() {
      view.@com.google.gwt.maps.client.overlay.OverlayView::onAdd()();
    }
  }-*/;
  
  native void setOnRemove(OverlayView view) /*-{
    this.prototype.onRemove = function() {
      view.@com.google.gwt.maps.client.overlay.OverlayView::onRemove()();
    }
  }-*/;

  @Override
  public HasMap getMap() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public HasMapCanvasProjection getProjection() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setMap(HasMap map) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public JavaScriptObject getJso() {
    // TODO Auto-generated method stub
    return null;
  }

}
