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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.DatabaseTranslatedString;
import com.wallee.sdk.model.InstallmentPlanConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The installment plan slice defines a single slice of an installment plan.
 */
public class InstallmentPlanSliceConfiguration {
  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("lineItemTitle")
  protected DatabaseTranslatedString lineItemTitle = null;

  
  @SerializedName("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @SerializedName("period")
  protected String period = null;

  
  @SerializedName("plan")
  protected InstallmentPlanConfiguration plan = null;

  
  @SerializedName("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @SerializedName("priority")
  protected Integer priority = null;

  
  @SerializedName("proportion")
  protected BigDecimal proportion = null;

  
  @SerializedName("state")
  protected CreationEntityState state = null;

  
  @SerializedName("version")
  protected Integer version = null;

  
  
   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * The title of this slices line items. The title is visible to the buyer.
   * @return lineItemTitle
  **/
  @ApiModelProperty(value = "The title of this slices line items. The title is visible to the buyer.")
  public DatabaseTranslatedString getLineItemTitle() {
    return lineItemTitle;
  }

  
   /**
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The period defines how much time passes between the last slice and this slice. The charge is triggered at the end of the period. When the slice should be charged immediately the period needs to be zero.
   * @return period
  **/
  @ApiModelProperty(value = "The period defines how much time passes between the last slice and this slice. The charge is triggered at the end of the period. When the slice should be charged immediately the period needs to be zero.")
  public String getPeriod() {
    return period;
  }

  
   /**
   * The installment plan this slice belongs to.
   * @return plan
  **/
  @ApiModelProperty(value = "The installment plan this slice belongs to.")
  public InstallmentPlanConfiguration getPlan() {
    return plan;
  }

  
   /**
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The priority controls in which order the slices are applied. The lower the value the higher the precedence.
   * @return priority
  **/
  @ApiModelProperty(value = "The priority controls in which order the slices are applied. The lower the value the higher the precedence.")
  public Integer getPriority() {
    return priority;
  }

  
   /**
   * The proportion defines how much of the total installment payment has to be paid in this slice. The value is summed up with the other slices and the ratio of all proportions compared to proportion of this slice determines how much the buyer has to pay in this slice.
   * @return proportion
  **/
  @ApiModelProperty(value = "The proportion defines how much of the total installment payment has to be paid in this slice. The value is summed up with the other slices and the ratio of all proportions compared to proportion of this slice determines how much the buyer has to pay in this slice.")
  public BigDecimal getProportion() {
    return proportion;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public CreationEntityState getState() {
    return state;
  }

  
   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentPlanSliceConfiguration installmentPlanSliceConfiguration = (InstallmentPlanSliceConfiguration) o;
    return Objects.equals(this.id, installmentPlanSliceConfiguration.id) &&
        Objects.equals(this.lineItemTitle, installmentPlanSliceConfiguration.lineItemTitle) &&
        Objects.equals(this.linkedSpaceId, installmentPlanSliceConfiguration.linkedSpaceId) &&
        Objects.equals(this.period, installmentPlanSliceConfiguration.period) &&
        Objects.equals(this.plan, installmentPlanSliceConfiguration.plan) &&
        Objects.equals(this.plannedPurgeDate, installmentPlanSliceConfiguration.plannedPurgeDate) &&
        Objects.equals(this.priority, installmentPlanSliceConfiguration.priority) &&
        Objects.equals(this.proportion, installmentPlanSliceConfiguration.proportion) &&
        Objects.equals(this.state, installmentPlanSliceConfiguration.state) &&
        Objects.equals(this.version, installmentPlanSliceConfiguration.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lineItemTitle, linkedSpaceId, period, plan, plannedPurgeDate, priority, proportion, state, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentPlanSliceConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lineItemTitle: ").append(toIndentedString(lineItemTitle)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    proportion: ").append(toIndentedString(proportion)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

