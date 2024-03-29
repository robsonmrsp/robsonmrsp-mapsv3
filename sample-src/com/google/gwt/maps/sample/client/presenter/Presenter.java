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
package com.google.gwt.maps.sample.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.maps.sample.client.view.View;

/**
 * Base presenter for all sample application presenters.
 *
 * @author vinay.sekhri@gmail.com (Vinay Sekhri)
 */
public interface Presenter<T extends View> {

  /**
   * Get reference of the presenter's eventBus.
   */
  HandlerManager getEventBus();
  
  /**
   * Get reference of the presenter's display.
   */
  T getDisplay();
  
  /**
   * Bind presenter to the display and/or eventbus.
   */
  void bind();

  /**
   * Release all the listeners. Must call it at the end of the presenter's
   * life-cycle to prevent memory leaks.
   */
  void release();
  
}
