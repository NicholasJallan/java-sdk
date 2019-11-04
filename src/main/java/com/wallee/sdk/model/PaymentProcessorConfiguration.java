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
import com.wallee.sdk.model.CreationEntityState;
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
public class PaymentProcessorConfiguration {
  
  @SerializedName("contractId")
  protected Long contractId = null;

  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @SerializedName("name")
  protected String name = null;

  
  @SerializedName("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @SerializedName("processor")
  protected Long processor = null;

  
  @SerializedName("state")
  protected CreationEntityState state = null;

  
  @SerializedName("version")
  protected Integer version = null;

  
  
   /**
   * The contract links the processor configuration with the contract that is used to process payments.
   * @return contractId
  **/
  @ApiModelProperty(value = "The contract links the processor configuration with the contract that is used to process payments.")
  public Long getContractId() {
    return contractId;
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
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The processor configuration name is used internally to identify a specific processor configuration. For example the name is used within search fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The processor configuration name is used internally to identify a specific processor configuration. For example the name is used within search fields and hence it should be distinct and descriptive.")
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
   * A processor handles the connection to a third part company (a Payment Service Provider) that technically manages the transaction and therefore processes the payment. For the same processor multiple processor configuration can be setup.
   * @return processor
  **/
  @ApiModelProperty(value = "A processor handles the connection to a third part company (a Payment Service Provider) that technically manages the transaction and therefore processes the payment. For the same processor multiple processor configuration can be setup.")
  public Long getProcessor() {
    return processor;
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
    PaymentProcessorConfiguration paymentProcessorConfiguration = (PaymentProcessorConfiguration) o;
    return Objects.equals(this.contractId, paymentProcessorConfiguration.contractId) &&
        Objects.equals(this.id, paymentProcessorConfiguration.id) &&
        Objects.equals(this.linkedSpaceId, paymentProcessorConfiguration.linkedSpaceId) &&
        Objects.equals(this.name, paymentProcessorConfiguration.name) &&
        Objects.equals(this.plannedPurgeDate, paymentProcessorConfiguration.plannedPurgeDate) &&
        Objects.equals(this.processor, paymentProcessorConfiguration.processor) &&
        Objects.equals(this.state, paymentProcessorConfiguration.state) &&
        Objects.equals(this.version, paymentProcessorConfiguration.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, id, linkedSpaceId, name, plannedPurgeDate, processor, state, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProcessorConfiguration {\n");
    
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
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

