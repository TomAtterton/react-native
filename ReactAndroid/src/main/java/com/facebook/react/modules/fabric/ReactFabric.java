package com.facebook.react.modules.fabric;

import com.facebook.react.bridge.JavaScriptModule;

/**
 * JS module used to execute Fabric specific methods.
 * Note: This is a temporary class that will be replaced when Fabric is fully integrated with the
 * rest of the modules.
 */
public interface ReactFabric extends JavaScriptModule {

  /**
   * JS method used to unmount Fabric surfaces.
   * @param rootTag {@link int} react tag of Root {@link com.facebook.react.uimanager.ReactShadowNode}
   */
  void unmountComponentAtNode(int rootTag);

}
