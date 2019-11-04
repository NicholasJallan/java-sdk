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
@JsonAdapter(OneClickPaymentMode.Adapter.class)
public enum OneClickPaymentMode {
  
  DISABLED("DISABLED"),
  
  ALLOW("ALLOW"),
  
  FORCE("FORCE");

  private String value;

  OneClickPaymentMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OneClickPaymentMode fromValue(String text) {
    for (OneClickPaymentMode b : OneClickPaymentMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OneClickPaymentMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final OneClickPaymentMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OneClickPaymentMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OneClickPaymentMode.fromValue(String.valueOf(value));
    }
  }
}

