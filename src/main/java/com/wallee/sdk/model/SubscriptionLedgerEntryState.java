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
@JsonAdapter(SubscriptionLedgerEntryState.Adapter.class)
public enum SubscriptionLedgerEntryState {
  
  OPEN("OPEN"),
  
  SCHEDULED("SCHEDULED"),
  
  PAID("PAID");

  private String value;

  SubscriptionLedgerEntryState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SubscriptionLedgerEntryState fromValue(String text) {
    for (SubscriptionLedgerEntryState b : SubscriptionLedgerEntryState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SubscriptionLedgerEntryState> {
    @Override
    public void write(final JsonWriter jsonWriter, final SubscriptionLedgerEntryState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SubscriptionLedgerEntryState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SubscriptionLedgerEntryState.fromValue(String.valueOf(value));
    }
  }
}

