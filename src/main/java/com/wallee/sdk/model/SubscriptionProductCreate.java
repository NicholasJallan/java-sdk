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
import com.wallee.sdk.model.AbstractSubscriptionProductActive;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * A subscription product represents a product to which a subscriber can subscribe to. A product defines how much the subscription costs and in what cycles the subscribe is charged.
 */
public class SubscriptionProductCreate extends AbstractSubscriptionProductActive {
  
  @SerializedName("reference")
  protected String reference = null;

  
  
  public SubscriptionProductCreate reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * The product reference identifies the product for external systems. This field may contain the product&#39;s SKU.
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "The product reference identifies the product for external systems. This field may contain the product's SKU.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionProductCreate subscriptionProductCreate = (SubscriptionProductCreate) o;
    return Objects.equals(this.allowedPaymentMethodConfigurations, subscriptionProductCreate.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.failedPaymentSuspensionPeriod, subscriptionProductCreate.failedPaymentSuspensionPeriod) &&
        Objects.equals(this.name, subscriptionProductCreate.name) &&
        Objects.equals(this.sortOrder, subscriptionProductCreate.sortOrder) &&
        Objects.equals(this.state, subscriptionProductCreate.state) &&
        Objects.equals(this.reference, subscriptionProductCreate.reference) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPaymentMethodConfigurations, failedPaymentSuspensionPeriod, name, sortOrder, state, reference, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    failedPaymentSuspensionPeriod: ").append(toIndentedString(failedPaymentSuspensionPeriod)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

