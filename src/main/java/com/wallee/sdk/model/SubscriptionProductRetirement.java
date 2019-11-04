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
import com.wallee.sdk.model.SubscriptionProduct;
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
public class SubscriptionProductRetirement {
  
  @SerializedName("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @SerializedName("product")
  protected SubscriptionProduct product = null;

  
  @SerializedName("respectTerminiationPeriodsEnabled")
  protected Boolean respectTerminiationPeriodsEnabled = null;

  
  @SerializedName("targetProduct")
  protected SubscriptionProduct targetProduct = null;

  
  @SerializedName("version")
  protected Integer version = null;

  
  
   /**
   * The created on date indicates the date on which the entity was stored into the database.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
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
   * 
   * @return product
  **/
  @ApiModelProperty(value = "")
  public SubscriptionProduct getProduct() {
    return product;
  }

  
   /**
   * 
   * @return respectTerminiationPeriodsEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isRespectTerminiationPeriodsEnabled() {
    return respectTerminiationPeriodsEnabled;
  }

  
   /**
   * 
   * @return targetProduct
  **/
  @ApiModelProperty(value = "")
  public SubscriptionProduct getTargetProduct() {
    return targetProduct;
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
    SubscriptionProductRetirement subscriptionProductRetirement = (SubscriptionProductRetirement) o;
    return Objects.equals(this.createdOn, subscriptionProductRetirement.createdOn) &&
        Objects.equals(this.id, subscriptionProductRetirement.id) &&
        Objects.equals(this.linkedSpaceId, subscriptionProductRetirement.linkedSpaceId) &&
        Objects.equals(this.product, subscriptionProductRetirement.product) &&
        Objects.equals(this.respectTerminiationPeriodsEnabled, subscriptionProductRetirement.respectTerminiationPeriodsEnabled) &&
        Objects.equals(this.targetProduct, subscriptionProductRetirement.targetProduct) &&
        Objects.equals(this.version, subscriptionProductRetirement.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, id, linkedSpaceId, product, respectTerminiationPeriodsEnabled, targetProduct, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductRetirement {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    respectTerminiationPeriodsEnabled: ").append(toIndentedString(respectTerminiationPeriodsEnabled)).append("\n");
    sb.append("    targetProduct: ").append(toIndentedString(targetProduct)).append("\n");
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

