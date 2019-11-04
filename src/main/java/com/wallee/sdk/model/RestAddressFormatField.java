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
@JsonAdapter(RestAddressFormatField.Adapter.class)
public enum RestAddressFormatField {
  
  GIVEN_NAME("GIVEN_NAME"),
  
  FAMILY_NAME("FAMILY_NAME"),
  
  ORGANIZATION_NAME("ORGANIZATION_NAME"),
  
  STREET("STREET"),
  
  DEPENDENT_LOCALITY("DEPENDENT_LOCALITY"),
  
  CITY("CITY"),
  
  POSTAL_STATE("POSTAL_STATE"),
  
  POST_CODE("POST_CODE"),
  
  SORTING_CODE("SORTING_CODE"),
  
  COUNTRY("COUNTRY");

  private String value;

  RestAddressFormatField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RestAddressFormatField fromValue(String text) {
    for (RestAddressFormatField b : RestAddressFormatField.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<RestAddressFormatField> {
    @Override
    public void write(final JsonWriter jsonWriter, final RestAddressFormatField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RestAddressFormatField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RestAddressFormatField.fromValue(String.valueOf(value));
    }
  }
}

