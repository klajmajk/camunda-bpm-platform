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
package org.camunda.bpm.engine.rest.impl;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.impl.identity.Authentication;
import org.camunda.bpm.engine.impl.util.ClockUtil;
import org.camunda.bpm.engine.rest.dto.externaltask.FetchExternalTasksExtendedDto;

import javax.ws.rs.container.AsyncResponse;
import java.util.Date;

/**
 * @author Tassilo Weidner
 */
public class FetchAndLockRequest {

  protected Date requestTime = ClockUtil.getCurrentTime();
  protected FetchExternalTasksExtendedDto dto;
  protected AsyncResponse asyncResponse;
  protected ProcessEngine processEngine;
  protected Authentication authentication;

  public Date getRequestTime() {
    return requestTime;
  }

  public FetchAndLockRequest setRequestTime(Date requestTime) {
    this.requestTime = requestTime;
    return this;
  }

  public FetchExternalTasksExtendedDto getDto() {
    return dto;
  }

  public FetchAndLockRequest setDto(FetchExternalTasksExtendedDto dto) {
    this.dto = dto;
    return this;
  }

  public AsyncResponse getAsyncResponse() {
    return asyncResponse;
  }

  public FetchAndLockRequest setAsyncResponse(AsyncResponse asyncResponse) {
    this.asyncResponse = asyncResponse;
    return this;
  }

  public ProcessEngine getProcessEngine() {
    return processEngine;
  }

  public FetchAndLockRequest setProcessEngine(ProcessEngine processEngine) {
    this.processEngine = processEngine;
    return this;
  }

  public Authentication getAuthentication() {
    return authentication;
  }

  public FetchAndLockRequest setAuthentication(Authentication authentication) {
    this.authentication = authentication;
    return this;
  }

}
