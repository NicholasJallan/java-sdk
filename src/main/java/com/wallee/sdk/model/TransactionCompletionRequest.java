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
import com.wallee.sdk.model.CompletionLineItemCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/** 5
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2019-11-04T09:15:25.279+01:00")
public class TransactionCompletionRequest {
  
  @SerializedName("externalId")
  protected String externalId = null;

  
  @SerializedName("lastCompletion")
  protected Boolean lastCompletion = null;

  
  @SerializedName("lineItems")
  protected List<CompletionLineItemCreate> lineItems = null;

  
  @SerializedName("transactionId")
  protected Long transactionId = null;

  
  
  public TransactionCompletionRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * The external ID helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "The external ID helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public TransactionCompletionRequest lastCompletion(Boolean lastCompletion) {
    this.lastCompletion = lastCompletion;
    return this;
  }

   /**
   * The last completion flag indicates if this is the last completion. After the last completion is created no further completions can be issued.
   * @return lastCompletion
  **/
  @ApiModelProperty(required = true, value = "The last completion flag indicates if this is the last completion. After the last completion is created no further completions can be issued.")
  public Boolean isLastCompletion() {
    return lastCompletion;
  }

  public void setLastCompletion(Boolean lastCompletion) {
    this.lastCompletion = lastCompletion;
  }

  
  public TransactionCompletionRequest lineItems(List<CompletionLineItemCreate> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public TransactionCompletionRequest addLineItemsItem(CompletionLineItemCreate lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * The line items which will be used to complete the transaction.
   * @return lineItems
  **/
  @ApiModelProperty(value = "The line items which will be used to complete the transaction.")
  public List<CompletionLineItemCreate> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<CompletionLineItemCreate> lineItems) {
    this.lineItems = lineItems;
  }

  
  public TransactionCompletionRequest transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The ID of the transaction which should be completed.
   * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "The ID of the transaction which should be completed.")
  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionCompletionRequest transactionCompletionRequest = (TransactionCompletionRequest) o;
    return Objects.equals(this.externalId, transactionCompletionRequest.externalId) &&
        Objects.equals(this.lastCompletion, transactionCompletionRequest.lastCompletion) &&
        Objects.equals(this.lineItems, transactionCompletionRequest.lineItems) &&
        Objects.equals(this.transactionId, transactionCompletionRequest.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, lastCompletion, lineItems, transactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCompletionRequest {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    lastCompletion: ").append(toIndentedString(lastCompletion)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

