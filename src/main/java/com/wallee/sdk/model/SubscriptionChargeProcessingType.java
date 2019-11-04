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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;
import java.util.*;
import java.time.OffsetDateTime;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(SubscriptionChargeProcessingType.Adapter.class)
public enum SubscriptionChargeProcessingType {
  
  SYNCHRONOUS("SYNCHRONOUS"),
  
  CHARGE_FLOW("CHARGE_FLOW");

  private String value;

  SubscriptionChargeProcessingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SubscriptionChargeProcessingType fromValue(String text) {
    for (SubscriptionChargeProcessingType b : SubscriptionChargeProcessingType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SubscriptionChargeProcessingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SubscriptionChargeProcessingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SubscriptionChargeProcessingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SubscriptionChargeProcessingType.fromValue(String.valueOf(value));
    }
  }
}

