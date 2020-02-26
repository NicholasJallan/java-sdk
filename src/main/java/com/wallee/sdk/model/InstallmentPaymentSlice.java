/**
*  SDK
*
* This library allows to interact with the  payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package com.wallee.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.wallee.sdk.model.InstallmentPayment;
import com.wallee.sdk.model.InstallmentPaymentSliceState;
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionAwareEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * An installment payment slice represents a single transaction of money from the buyer to the merchant.
 */
public class InstallmentPaymentSlice extends TransactionAwareEntity {
  
  @SerializedName("chargeOn")
  protected OffsetDateTime chargeOn = null;

  
  @SerializedName("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @SerializedName("installmentPayment")
  protected InstallmentPayment installmentPayment = null;

  
  @SerializedName("lineItems")
  protected List<LineItem> lineItems = null;

  
  @SerializedName("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @SerializedName("state")
  protected InstallmentPaymentSliceState state = null;

  
  @SerializedName("transaction")
  protected Transaction transaction = null;

  
  @SerializedName("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return chargeOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getChargeOn() {
    return chargeOn;
  }

  
   /**
   * The created on date indicates the date on which the entity was stored into the database.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * 
   * @return installmentPayment
  **/
  @ApiModelProperty(value = "")
  public InstallmentPayment getInstallmentPayment() {
    return installmentPayment;
  }

  
   /**
   * 
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<LineItem> getLineItems() {
    return lineItems;
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
  public InstallmentPaymentSliceState getState() {
    return state;
  }

  
   /**
   * 
   * @return transaction
  **/
  @ApiModelProperty(value = "")
  public Transaction getTransaction() {
    return transaction;
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
    InstallmentPaymentSlice installmentPaymentSlice = (InstallmentPaymentSlice) o;
    return Objects.equals(this.id, installmentPaymentSlice.id) &&
        Objects.equals(this.linkedSpaceId, installmentPaymentSlice.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, installmentPaymentSlice.linkedTransaction) &&
        Objects.equals(this.chargeOn, installmentPaymentSlice.chargeOn) &&
        Objects.equals(this.createdOn, installmentPaymentSlice.createdOn) &&
        Objects.equals(this.installmentPayment, installmentPaymentSlice.installmentPayment) &&
        Objects.equals(this.lineItems, installmentPaymentSlice.lineItems) &&
        Objects.equals(this.plannedPurgeDate, installmentPaymentSlice.plannedPurgeDate) &&
        Objects.equals(this.state, installmentPaymentSlice.state) &&
        Objects.equals(this.transaction, installmentPaymentSlice.transaction) &&
        Objects.equals(this.version, installmentPaymentSlice.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, linkedTransaction, chargeOn, createdOn, installmentPayment, lineItems, plannedPurgeDate, state, transaction, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentPaymentSlice {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    chargeOn: ").append(toIndentedString(chargeOn)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    installmentPayment: ").append(toIndentedString(installmentPayment)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

