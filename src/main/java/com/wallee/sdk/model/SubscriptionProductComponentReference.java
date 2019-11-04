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
import com.wallee.sdk.model.SubscriptionProductComponentReferenceState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The product component reference binds components from different product versions together. By binding them together the product version migration can be realized.
 */
public class SubscriptionProductComponentReference {
  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @SerializedName("name")
  protected String name = null;

  
  @SerializedName("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @SerializedName("spaceId")
  protected Long spaceId = null;

  
  @SerializedName("state")
  protected SubscriptionProductComponentReferenceState state = null;

  
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
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The component reference name is used internally to identify the reference. For example the name is used within search fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The component reference name is used internally to identify the reference. For example the name is used within search fields and hence it should be distinct and descriptive.")
  public String getName() {
    return name;
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
   * 
   * @return spaceId
  **/
  @ApiModelProperty(value = "")
  public Long getSpaceId() {
    return spaceId;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public SubscriptionProductComponentReferenceState getState() {
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
    SubscriptionProductComponentReference subscriptionProductComponentReference = (SubscriptionProductComponentReference) o;
    return Objects.equals(this.id, subscriptionProductComponentReference.id) &&
        Objects.equals(this.linkedSpaceId, subscriptionProductComponentReference.linkedSpaceId) &&
        Objects.equals(this.name, subscriptionProductComponentReference.name) &&
        Objects.equals(this.plannedPurgeDate, subscriptionProductComponentReference.plannedPurgeDate) &&
        Objects.equals(this.spaceId, subscriptionProductComponentReference.spaceId) &&
        Objects.equals(this.state, subscriptionProductComponentReference.state) &&
        Objects.equals(this.version, subscriptionProductComponentReference.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, name, plannedPurgeDate, spaceId, state, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductComponentReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
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

