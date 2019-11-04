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
 * The &#39;order by&#39; type specifies how the result is sorted.
 */
@JsonAdapter(EntityQueryOrderByType.Adapter.class)
public enum EntityQueryOrderByType {
  
  DESC("DESC"),
  
  ASC("ASC");

  private String value;

  EntityQueryOrderByType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EntityQueryOrderByType fromValue(String text) {
    for (EntityQueryOrderByType b : EntityQueryOrderByType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EntityQueryOrderByType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EntityQueryOrderByType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EntityQueryOrderByType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EntityQueryOrderByType.fromValue(String.valueOf(value));
    }
  }
}

