/**
*  SDK
*
* This library allows to interact with the  payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
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


package com.wallee.sdk.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")

public class SpaceCreate extends AbstractSpaceUpdate {
  
  @JsonProperty("account")
  protected Long account;

  
  
  public SpaceCreate account(Long account) {
    this.account = account;
    return this;
  }

   /**
   * The account to which the space belongs to.
   * @return account
  **/
  @ApiModelProperty(required = true, value = "The account to which the space belongs to.")
  public Long getAccount() {
    return account;
  }

  public void setAccount(Long account) {
    this.account = account;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpaceCreate spaceCreate = (SpaceCreate) o;
    return Objects.equals(this.lastModifiedDate, spaceCreate.lastModifiedDate) &&
        Objects.equals(this.name, spaceCreate.name) &&
        Objects.equals(this.postalAddress, spaceCreate.postalAddress) &&
        Objects.equals(this.primaryCurrency, spaceCreate.primaryCurrency) &&
        Objects.equals(this.requestLimit, spaceCreate.requestLimit) && this.state == spaceCreate.state &&
        Objects.equals(this.technicalContactAddresses, spaceCreate.technicalContactAddresses) &&
        Objects.equals(this.timeZone, spaceCreate.timeZone) &&
        Objects.equals(this.account, spaceCreate.account) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModifiedDate, name, postalAddress, primaryCurrency, requestLimit, state, technicalContactAddresses, timeZone, account, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    primaryCurrency: ").append(toIndentedString(primaryCurrency)).append("\n");
    sb.append("    requestLimit: ").append(toIndentedString(requestLimit)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    technicalContactAddresses: ").append(toIndentedString(technicalContactAddresses)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("}");
    return sb.toString();
  }



}

