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
public class SubscriptionProductVersionRetirementCreate {
  
  @SerializedName("productVersion")
  protected Long productVersion = null;

  
  @SerializedName("respectTerminiationPeriodsEnabled")
  protected Boolean respectTerminiationPeriodsEnabled = null;

  
  @SerializedName("targetProduct")
  protected Long targetProduct = null;

  
  
  public SubscriptionProductVersionRetirementCreate productVersion(Long productVersion) {
    this.productVersion = productVersion;
    return this;
  }

   /**
   * 
   * @return productVersion
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getProductVersion() {
    return productVersion;
  }

  public void setProductVersion(Long productVersion) {
    this.productVersion = productVersion;
  }

  
  public SubscriptionProductVersionRetirementCreate respectTerminiationPeriodsEnabled(Boolean respectTerminiationPeriodsEnabled) {
    this.respectTerminiationPeriodsEnabled = respectTerminiationPeriodsEnabled;
    return this;
  }

   /**
   * 
   * @return respectTerminiationPeriodsEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isRespectTerminiationPeriodsEnabled() {
    return respectTerminiationPeriodsEnabled;
  }

  public void setRespectTerminiationPeriodsEnabled(Boolean respectTerminiationPeriodsEnabled) {
    this.respectTerminiationPeriodsEnabled = respectTerminiationPeriodsEnabled;
  }

  
  public SubscriptionProductVersionRetirementCreate targetProduct(Long targetProduct) {
    this.targetProduct = targetProduct;
    return this;
  }

   /**
   * 
   * @return targetProduct
  **/
  @ApiModelProperty(value = "")
  public Long getTargetProduct() {
    return targetProduct;
  }

  public void setTargetProduct(Long targetProduct) {
    this.targetProduct = targetProduct;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionProductVersionRetirementCreate subscriptionProductVersionRetirementCreate = (SubscriptionProductVersionRetirementCreate) o;
    return Objects.equals(this.productVersion, subscriptionProductVersionRetirementCreate.productVersion) &&
        Objects.equals(this.respectTerminiationPeriodsEnabled, subscriptionProductVersionRetirementCreate.respectTerminiationPeriodsEnabled) &&
        Objects.equals(this.targetProduct, subscriptionProductVersionRetirementCreate.targetProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVersion, respectTerminiationPeriodsEnabled, targetProduct);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductVersionRetirementCreate {\n");
    
    sb.append("    productVersion: ").append(toIndentedString(productVersion)).append("\n");
    sb.append("    respectTerminiationPeriodsEnabled: ").append(toIndentedString(respectTerminiationPeriodsEnabled)).append("\n");
    sb.append("    targetProduct: ").append(toIndentedString(targetProduct)).append("\n");
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

