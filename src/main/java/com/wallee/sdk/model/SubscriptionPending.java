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
import com.wallee.sdk.model.SubscriptionUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class SubscriptionPending extends SubscriptionUpdate {
  
  @SerializedName("reference")
  protected String reference = null;

  
  @SerializedName("subscriber")
  protected Long subscriber = null;

  
  @SerializedName("token")
  protected Long token = null;

  
  
  public SubscriptionPending reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * 
   * @return reference
  **/
  @ApiModelProperty(value = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  
  public SubscriptionPending subscriber(Long subscriber) {
    this.subscriber = subscriber;
    return this;
  }

   /**
   * 
   * @return subscriber
  **/
  @ApiModelProperty(value = "")
  public Long getSubscriber() {
    return subscriber;
  }

  public void setSubscriber(Long subscriber) {
    this.subscriber = subscriber;
  }

  
  public SubscriptionPending token(Long token) {
    this.token = token;
    return this;
  }

   /**
   * 
   * @return token
  **/
  @ApiModelProperty(value = "")
  public Long getToken() {
    return token;
  }

  public void setToken(Long token) {
    this.token = token;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPending subscriptionPending = (SubscriptionPending) o;
    return Objects.equals(this.id, subscriptionPending.id) &&
        Objects.equals(this.version, subscriptionPending.version) &&
        Objects.equals(this.affiliate, subscriptionPending.affiliate) &&
        Objects.equals(this.description, subscriptionPending.description) &&
        Objects.equals(this.plannedTerminationDate, subscriptionPending.plannedTerminationDate) &&
        Objects.equals(this.reference, subscriptionPending.reference) &&
        Objects.equals(this.subscriber, subscriptionPending.subscriber) &&
        Objects.equals(this.token, subscriptionPending.token) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, affiliate, description, plannedTerminationDate, reference, subscriber, token, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPending {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    affiliate: ").append(toIndentedString(affiliate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    plannedTerminationDate: ").append(toIndentedString(plannedTerminationDate)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

