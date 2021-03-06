package org.camunda.bpm.container.impl.threading.ra.inflow;

import javax.resource.spi.Activation;
import javax.resource.spi.ActivationSpec;
import javax.resource.spi.InvalidPropertyException;
import javax.resource.spi.ResourceAdapter;




/**
 * 
 * @author Daniel Meyer
 */
@Activation(
  messageListeners = { JobExecutionHandler.class }
)
public class JobExecutionHandlerActivationSpec implements ActivationSpec {

  private ResourceAdapter ra;

  public void validate() throws InvalidPropertyException {
    // nothing to do (the endpoint has no activation properties)
  }

  public ResourceAdapter getResourceAdapter() {
    return ra;
  }

  public void setResourceAdapter(ResourceAdapter ra) {
    this.ra = ra;
  }

}
