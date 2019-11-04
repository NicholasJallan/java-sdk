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
 * The type of Client Errors which can be returned by a service.
 */
@JsonAdapter(ClientErrorType.Adapter.class)
public enum ClientErrorType {
  
  END_USER_ERROR("END_USER_ERROR"),
  
  CONFIGURATION_ERROR("CONFIGURATION_ERROR"),
  
  DEVELOPER_ERROR("DEVELOPER_ERROR");

  private String value;

  ClientErrorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClientErrorType fromValue(String text) {
    for (ClientErrorType b : ClientErrorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ClientErrorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClientErrorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClientErrorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClientErrorType.fromValue(String.valueOf(value));
    }
  }
}

