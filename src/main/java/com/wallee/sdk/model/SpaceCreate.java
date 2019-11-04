/*
 * wallee
 * JAVA SDK
 *
 * OpenAPI spec version: 2.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wallee.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.wallee.sdk.model.AbstractSpaceUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class SpaceCreate extends AbstractSpaceUpdate {
  
  @SerializedName("account")
  protected Long account = null;

  
  
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpaceCreate spaceCreate = (SpaceCreate) o;
    return Objects.equals(this.name, spaceCreate.name) &&
        Objects.equals(this.postalAddress, spaceCreate.postalAddress) &&
        Objects.equals(this.primaryCurrency, spaceCreate.primaryCurrency) &&
        Objects.equals(this.requestLimit, spaceCreate.requestLimit) &&
        Objects.equals(this.state, spaceCreate.state) &&
        Objects.equals(this.technicalContactAddresses, spaceCreate.technicalContactAddresses) &&
        Objects.equals(this.timeZone, spaceCreate.timeZone) &&
        Objects.equals(this.account, spaceCreate.account) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, postalAddress, primaryCurrency, requestLimit, state, technicalContactAddresses, timeZone, account, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

