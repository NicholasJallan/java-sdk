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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * This model holds the card data in plain.
 */
public class UnencryptedCardData {
  
  @SerializedName("cardHolderName")
  protected String cardHolderName = null;

  
  @SerializedName("cardVerificationCode")
  protected String cardVerificationCode = null;

  
  @SerializedName("expiryDate")
  protected String expiryDate = null;

  
  @SerializedName("primaryAccountNumber")
  protected String primaryAccountNumber = null;

  
  
   /**
   * The card holder name is the name printed onto the card. It identifies the person who owns the card.
   * @return cardHolderName
  **/
  @ApiModelProperty(value = "The card holder name is the name printed onto the card. It identifies the person who owns the card.")
  public String getCardHolderName() {
    return cardHolderName;
  }

  
   /**
   * The card verification code (CVC) is a 3 to 4 digit code typically printed on the back of the card. It helps to ensure that the card holder is authorizing the transaction. For card not-present transactions this field is optional.
   * @return cardVerificationCode
  **/
  @ApiModelProperty(value = "The card verification code (CVC) is a 3 to 4 digit code typically printed on the back of the card. It helps to ensure that the card holder is authorizing the transaction. For card not-present transactions this field is optional.")
  public String getCardVerificationCode() {
    return cardVerificationCode;
  }

  
   /**
   * The card expiry date indicates when the card expires. The format is the format yyyy-mm where yyyy is the year (e.g. 2019) and the mm is the month (e.g. 09).
   * @return expiryDate
  **/
  @ApiModelProperty(value = "The card expiry date indicates when the card expires. The format is the format yyyy-mm where yyyy is the year (e.g. 2019) and the mm is the month (e.g. 09).")
  public String getExpiryDate() {
    return expiryDate;
  }

  
   /**
   * The primary account number (PAN) identifies the card. The number is numeric and typically printed on the front of the card.
   * @return primaryAccountNumber
  **/
  @ApiModelProperty(value = "The primary account number (PAN) identifies the card. The number is numeric and typically printed on the front of the card.")
  public String getPrimaryAccountNumber() {
    return primaryAccountNumber;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnencryptedCardData unencryptedCardData = (UnencryptedCardData) o;
    return Objects.equals(this.cardHolderName, unencryptedCardData.cardHolderName) &&
        Objects.equals(this.cardVerificationCode, unencryptedCardData.cardVerificationCode) &&
        Objects.equals(this.expiryDate, unencryptedCardData.expiryDate) &&
        Objects.equals(this.primaryAccountNumber, unencryptedCardData.primaryAccountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardHolderName, cardVerificationCode, expiryDate, primaryAccountNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnencryptedCardData {\n");
    
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    cardVerificationCode: ").append(toIndentedString(cardVerificationCode)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    primaryAccountNumber: ").append(toIndentedString(primaryAccountNumber)).append("\n");
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

