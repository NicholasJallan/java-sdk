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
import com.wallee.sdk.model.PaymentTerminalConfigurationVersion;
import com.wallee.sdk.model.PaymentTerminalLocationVersion;
import com.wallee.sdk.model.PaymentTerminalState;
import com.wallee.sdk.model.PaymentTerminalType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/** 5
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2019-11-04T09:15:25.279+01:00")
public class PaymentTerminal {
  
  @SerializedName("configurationVersion")
  protected PaymentTerminalConfigurationVersion configurationVersion = null;

  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("identifier")
  protected String identifier = null;

  
  @SerializedName("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @SerializedName("locationVersion")
  protected PaymentTerminalLocationVersion locationVersion = null;

  
  @SerializedName("name")
  protected String name = null;

  
  @SerializedName("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @SerializedName("state")
  protected PaymentTerminalState state = null;

  
  @SerializedName("terminalDeviceId")
  protected Long terminalDeviceId = null;

  
  @SerializedName("type")
  protected PaymentTerminalType type = null;

  
  @SerializedName("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return configurationVersion
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminalConfigurationVersion getConfigurationVersion() {
    return configurationVersion;
  }

  
   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * The identifier uniquely identifies the terminal. Normally it is visible on the device or in the display of the device.
   * @return identifier
  **/
  @ApiModelProperty(value = "The identifier uniquely identifies the terminal. Normally it is visible on the device or in the display of the device.")
  public String getIdentifier() {
    return identifier;
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
   * 
   * @return locationVersion
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminalLocationVersion getLocationVersion() {
    return locationVersion;
  }

  
   /**
   * The terminal name is used internally to identify the terminal in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The terminal name is used internally to identify the terminal in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.")
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
   * @return state
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminalState getState() {
    return state;
  }

  
   /**
   * 
   * @return terminalDeviceId
  **/
  @ApiModelProperty(value = "")
  public Long getTerminalDeviceId() {
    return terminalDeviceId;
  }

  
   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminalType getType() {
    return type;
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
    PaymentTerminal paymentTerminal = (PaymentTerminal) o;
    return Objects.equals(this.configurationVersion, paymentTerminal.configurationVersion) &&
        Objects.equals(this.id, paymentTerminal.id) &&
        Objects.equals(this.identifier, paymentTerminal.identifier) &&
        Objects.equals(this.linkedSpaceId, paymentTerminal.linkedSpaceId) &&
        Objects.equals(this.locationVersion, paymentTerminal.locationVersion) &&
        Objects.equals(this.name, paymentTerminal.name) &&
        Objects.equals(this.plannedPurgeDate, paymentTerminal.plannedPurgeDate) &&
        Objects.equals(this.state, paymentTerminal.state) &&
        Objects.equals(this.terminalDeviceId, paymentTerminal.terminalDeviceId) &&
        Objects.equals(this.type, paymentTerminal.type) &&
        Objects.equals(this.version, paymentTerminal.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationVersion, id, identifier, linkedSpaceId, locationVersion, name, plannedPurgeDate, state, terminalDeviceId, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminal {\n");
    
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    locationVersion: ").append(toIndentedString(locationVersion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    terminalDeviceId: ").append(toIndentedString(terminalDeviceId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

