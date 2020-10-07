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

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")

public class ShopifySubscriptionVersion extends Indentable {
  
  @JsonProperty("billingAddress")
  protected ShopifySubscriptionAddress billingAddress;

  
  @JsonProperty("billingDayOfMonth")
  protected Integer billingDayOfMonth;

  
  @JsonProperty("billingIntervalAmount")
  protected Integer billingIntervalAmount;

  
  @JsonProperty("billingIntervalUnit")
  protected ShopifySubscriptionBillingIntervalUnit billingIntervalUnit;

  
  @JsonProperty("billingWeekday")
  protected ShopifySubscriptionWeekday billingWeekday;

  
  @JsonProperty("createdBy")
  protected Long createdBy;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn;

  
  @JsonProperty("currency")
  protected String currency;

  
  @JsonProperty("dischargedBy")
  protected Long dischargedBy;

  
  @JsonProperty("dischargedOn")
  protected OffsetDateTime dischargedOn;

  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("items")
  protected List<ShopifySubscriptionVersionItem> items;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId;

  
  @JsonProperty("maximalBillingCycles")
  protected Integer maximalBillingCycles;

  
  @JsonProperty("maximalSuspendableCycles")
  protected Integer maximalSuspendableCycles;

  
  @JsonProperty("minimalBillingCycles")
  protected Integer minimalBillingCycles;

  
  @JsonProperty("paymentGateway")
  protected String paymentGateway;

  
  @JsonProperty("shippingAddress")
  protected ShopifySubscriptionAddress shippingAddress;

  
  @JsonProperty("shippingRate")
  protected String shippingRate;

  
  @JsonProperty("shop")
  protected Long shop;

  
  @JsonProperty("state")
  protected ShopifySubscriptionVersionState state;

  
  @JsonProperty("storeOrderConfirmationEmailEnabled")
  protected Boolean storeOrderConfirmationEmailEnabled;

  
  @JsonProperty("subscriberSuspensionAllowed")
  protected Boolean subscriberSuspensionAllowed;

  
  @JsonProperty("subscription")
  protected ShopifySubscription subscription;

  
  @JsonProperty("terminationBillingCycles")
  protected Integer terminationBillingCycles;

  
  @JsonProperty("token")
  protected Long token;

  
  @JsonProperty("version")
  protected Integer version;

  
  
   /**
   * 
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionAddress getBillingAddress() {
    return billingAddress;
  }

  
   /**
   * 
   * @return billingDayOfMonth
  **/
  @ApiModelProperty(value = "")
  public Integer getBillingDayOfMonth() {
    return billingDayOfMonth;
  }

  
   /**
   * 
   * @return billingIntervalAmount
  **/
  @ApiModelProperty(value = "")
  public Integer getBillingIntervalAmount() {
    return billingIntervalAmount;
  }

  
   /**
   * 
   * @return billingIntervalUnit
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionBillingIntervalUnit getBillingIntervalUnit() {
    return billingIntervalUnit;
  }

  
   /**
   * 
   * @return billingWeekday
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionWeekday getBillingWeekday() {
    return billingWeekday;
  }

  
   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedBy() {
    return createdBy;
  }

  
   /**
   * 
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * 
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  
   /**
   * 
   * @return dischargedBy
  **/
  @ApiModelProperty(value = "")
  public Long getDischargedBy() {
    return dischargedBy;
  }

  
   /**
   * 
   * @return dischargedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDischargedOn() {
    return dischargedOn;
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
   * 
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<ShopifySubscriptionVersionItem> getItems() {
    return items;
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
   * @return maximalBillingCycles
  **/
  @ApiModelProperty(value = "")
  public Integer getMaximalBillingCycles() {
    return maximalBillingCycles;
  }

  
   /**
   * 
   * @return maximalSuspendableCycles
  **/
  @ApiModelProperty(value = "")
  public Integer getMaximalSuspendableCycles() {
    return maximalSuspendableCycles;
  }

  
   /**
   * 
   * @return minimalBillingCycles
  **/
  @ApiModelProperty(value = "")
  public Integer getMinimalBillingCycles() {
    return minimalBillingCycles;
  }

  
   /**
   * 
   * @return paymentGateway
  **/
  @ApiModelProperty(value = "")
  public String getPaymentGateway() {
    return paymentGateway;
  }

  
   /**
   * 
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionAddress getShippingAddress() {
    return shippingAddress;
  }

  
   /**
   * 
   * @return shippingRate
  **/
  @ApiModelProperty(value = "")
  public String getShippingRate() {
    return shippingRate;
  }

  
   /**
   * 
   * @return shop
  **/
  @ApiModelProperty(value = "")
  public Long getShop() {
    return shop;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionVersionState getState() {
    return state;
  }

  
   /**
   * 
   * @return storeOrderConfirmationEmailEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isStoreOrderConfirmationEmailEnabled() {
    return storeOrderConfirmationEmailEnabled;
  }

  
   /**
   * 
   * @return subscriberSuspensionAllowed
  **/
  @ApiModelProperty(value = "")
  public Boolean isSubscriberSuspensionAllowed() {
    return subscriberSuspensionAllowed;
  }

  
   /**
   * 
   * @return subscription
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscription getSubscription() {
    return subscription;
  }

  
   /**
   * 
   * @return terminationBillingCycles
  **/
  @ApiModelProperty(value = "")
  public Integer getTerminationBillingCycles() {
    return terminationBillingCycles;
  }

  
   /**
   * 
   * @return token
  **/
  @ApiModelProperty(value = "")
  public Long getToken() {
    return token;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifySubscriptionVersion shopifySubscriptionVersion = (ShopifySubscriptionVersion) o;
    return Objects.equals(this.billingAddress, shopifySubscriptionVersion.billingAddress) &&
        Objects.equals(this.billingDayOfMonth, shopifySubscriptionVersion.billingDayOfMonth) &&
        Objects.equals(this.billingIntervalAmount, shopifySubscriptionVersion.billingIntervalAmount) &&
      this.billingIntervalUnit == shopifySubscriptionVersion.billingIntervalUnit
      && this.billingWeekday == shopifySubscriptionVersion.billingWeekday &&
        Objects.equals(this.createdBy, shopifySubscriptionVersion.createdBy) &&
        Objects.equals(this.createdOn, shopifySubscriptionVersion.createdOn) &&
        Objects.equals(this.currency, shopifySubscriptionVersion.currency) &&
        Objects.equals(this.dischargedBy, shopifySubscriptionVersion.dischargedBy) &&
        Objects.equals(this.dischargedOn, shopifySubscriptionVersion.dischargedOn) &&
        Objects.equals(this.id, shopifySubscriptionVersion.id) &&
        Objects.equals(this.items, shopifySubscriptionVersion.items) &&
        Objects.equals(this.linkedSpaceId, shopifySubscriptionVersion.linkedSpaceId) &&
        Objects.equals(this.maximalBillingCycles, shopifySubscriptionVersion.maximalBillingCycles) &&
        Objects.equals(this.maximalSuspendableCycles, shopifySubscriptionVersion.maximalSuspendableCycles) &&
        Objects.equals(this.minimalBillingCycles, shopifySubscriptionVersion.minimalBillingCycles) &&
        Objects.equals(this.paymentGateway, shopifySubscriptionVersion.paymentGateway) &&
        Objects.equals(this.shippingAddress, shopifySubscriptionVersion.shippingAddress) &&
        Objects.equals(this.shippingRate, shopifySubscriptionVersion.shippingRate) &&
        Objects.equals(this.shop, shopifySubscriptionVersion.shop) && this.state == shopifySubscriptionVersion.state &&
        Objects.equals(this.storeOrderConfirmationEmailEnabled, shopifySubscriptionVersion.storeOrderConfirmationEmailEnabled) &&
        Objects.equals(this.subscriberSuspensionAllowed, shopifySubscriptionVersion.subscriberSuspensionAllowed) &&
        Objects.equals(this.subscription, shopifySubscriptionVersion.subscription) &&
        Objects.equals(this.terminationBillingCycles, shopifySubscriptionVersion.terminationBillingCycles) &&
        Objects.equals(this.token, shopifySubscriptionVersion.token) &&
        Objects.equals(this.version, shopifySubscriptionVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, billingDayOfMonth, billingIntervalAmount, billingIntervalUnit, billingWeekday, createdBy, createdOn, currency, dischargedBy, dischargedOn, id, items, linkedSpaceId, maximalBillingCycles, maximalSuspendableCycles, minimalBillingCycles, paymentGateway, shippingAddress, shippingRate, shop, state, storeOrderConfirmationEmailEnabled, subscriberSuspensionAllowed, subscription, terminationBillingCycles, token, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionVersion {\n");
    
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    billingDayOfMonth: ").append(toIndentedString(billingDayOfMonth)).append("\n");
    sb.append("    billingIntervalAmount: ").append(toIndentedString(billingIntervalAmount)).append("\n");
    sb.append("    billingIntervalUnit: ").append(toIndentedString(billingIntervalUnit)).append("\n");
    sb.append("    billingWeekday: ").append(toIndentedString(billingWeekday)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dischargedBy: ").append(toIndentedString(dischargedBy)).append("\n");
    sb.append("    dischargedOn: ").append(toIndentedString(dischargedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    maximalBillingCycles: ").append(toIndentedString(maximalBillingCycles)).append("\n");
    sb.append("    maximalSuspendableCycles: ").append(toIndentedString(maximalSuspendableCycles)).append("\n");
    sb.append("    minimalBillingCycles: ").append(toIndentedString(minimalBillingCycles)).append("\n");
    sb.append("    paymentGateway: ").append(toIndentedString(paymentGateway)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    shippingRate: ").append(toIndentedString(shippingRate)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    storeOrderConfirmationEmailEnabled: ").append(toIndentedString(storeOrderConfirmationEmailEnabled)).append("\n");
    sb.append("    subscriberSuspensionAllowed: ").append(toIndentedString(subscriberSuspensionAllowed)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    terminationBillingCycles: ").append(toIndentedString(terminationBillingCycles)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }



}

