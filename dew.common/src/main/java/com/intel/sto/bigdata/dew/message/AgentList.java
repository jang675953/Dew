package com.intel.sto.bigdata.dew.message;

import java.io.Serializable;
import java.util.Set;

/**
 * Request agent urls from master.
 * 
 * @author frank
 * 
 */
public class AgentList implements Serializable {

  private static final long serialVersionUID = 1L;
  // request hostName or ip, split by ";", null to request all agent urls.
  private Set<String> requestHosts;
  private Set<AgentRegister> responseUrls;

  public Set<String> getRequestHosts() {
    return requestHosts;
  }

  public void setRequestHosts(Set<String> requestHosts) {
    this.requestHosts = requestHosts;
  }

  public Set<AgentRegister> getResponseUrls() {
    return responseUrls;
  }

  public void setResponseUrls(Set<AgentRegister> responseUrls) {
    this.responseUrls = responseUrls;
  }

}
