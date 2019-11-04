/*
 * wallee
 * JAVA SDK
 *
 * OpenAPI spec version: 2.0.0
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
import com.wallee.sdk.model.SubscriptionSuspension;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.*;
import java.time.OffsetDateTime;

/** 5
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2019-11-04T09:15:25.279+01:00")
public class SubscriptionSuspensionRunning extends SubscriptionSuspension {
  
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionSuspensionRunning subscriptionSuspensionRunning = (SubscriptionSuspensionRunning) o;
    return Objects.equals(this.createdOn, subscriptionSuspensionRunning.createdOn) &&
        Objects.equals(this.effectiveEndDate, subscriptionSuspensionRunning.effectiveEndDate) &&
        Objects.equals(this.endAction, subscriptionSuspensionRunning.endAction) &&
        Objects.equals(this.id, subscriptionSuspensionRunning.id) &&
        Objects.equals(this.language, subscriptionSuspensionRunning.language) &&
        Objects.equals(this.linkedSpaceId, subscriptionSuspensionRunning.linkedSpaceId) &&
        Objects.equals(this.note, subscriptionSuspensionRunning.note) &&
        Objects.equals(this.periodBill, subscriptionSuspensionRunning.periodBill) &&
        Objects.equals(this.plannedEndDate, subscriptionSuspensionRunning.plannedEndDate) &&
        Objects.equals(this.plannedPurgeDate, subscriptionSuspensionRunning.plannedPurgeDate) &&
        Objects.equals(this.reason, subscriptionSuspensionRunning.reason) &&
        Objects.equals(this.state, subscriptionSuspensionRunning.state) &&
        Objects.equals(this.subscription, subscriptionSuspensionRunning.subscription) &&
        Objects.equals(this.version, subscriptionSuspensionRunning.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, effectiveEndDate, endAction, id, language, linkedSpaceId, note, periodBill, plannedEndDate, plannedPurgeDate, reason, state, subscription, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionSuspensionRunning {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    endAction: ").append(toIndentedString(endAction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    periodBill: ").append(toIndentedString(periodBill)).append("\n");
    sb.append("    plannedEndDate: ").append(toIndentedString(plannedEndDate)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

