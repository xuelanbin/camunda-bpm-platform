/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.application.impl;

import org.camunda.bpm.application.ProcessApplicationDeploymentInfo;


/**
 * @author Daniel Meyer
 *
 */
public class ProcessApplicationDeploymentInfoImpl implements ProcessApplicationDeploymentInfo {
  
  protected String processEngineName;
  
  protected String deploymentName;
  
  protected String deploymentId;

  public String getProcessEngineName() {
    return processEngineName;
  }

  public void setProcessEngineName(String processEngineName) {
    this.processEngineName = processEngineName;
  }

  public String getDeploymentName() {
    return deploymentName;
  }

  public void setDeploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
  }

  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }


}
