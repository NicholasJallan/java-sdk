/*
 * wallee
 * JAVA SDK
 *
 * OpenAPI spec version: 2.0.1
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
import com.wallee.sdk.model.AbstractTransactionInvoiceCommentActive;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class TransactionInvoiceCommentCreate extends AbstractTransactionInvoiceCommentActive {
  
  @SerializedName("transactionInvoice")
  protected Long transactionInvoice = null;

  
  
  public TransactionInvoiceCommentCreate transactionInvoice(Long transactionInvoice) {
    this.transactionInvoice = transactionInvoice;
    return this;
  }

   /**
   * 
   * @return transactionInvoice
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getTransactionInvoice() {
    return transactionInvoice;
  }

  public void setTransactionInvoice(Long transactionInvoice) {
    this.transactionInvoice = transactionInvoice;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInvoiceCommentCreate transactionInvoiceCommentCreate = (TransactionInvoiceCommentCreate) o;
    return Objects.equals(this.content, transactionInvoiceCommentCreate.content) &&
        Objects.equals(this.transactionInvoice, transactionInvoiceCommentCreate.transactionInvoice) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, transactionInvoice, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInvoiceCommentCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    transactionInvoice: ").append(toIndentedString(transactionInvoice)).append("\n");
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
