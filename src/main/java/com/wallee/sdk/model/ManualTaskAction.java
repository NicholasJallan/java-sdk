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
import com.wallee.sdk.model.ManualTaskActionStyle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class ManualTaskAction {
  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("label")
  protected Map<String, String> label = null;

  
  @SerializedName("style")
  protected ManualTaskActionStyle style = null;

  
  @SerializedName("taskType")
  protected Long taskType = null;

  
  
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
   * @return label
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getLabel() {
    return label;
  }

  
   /**
   * 
   * @return style
  **/
  @ApiModelProperty(value = "")
  public ManualTaskActionStyle getStyle() {
    return style;
  }

  
   /**
   * 
   * @return taskType
  **/
  @ApiModelProperty(value = "")
  public Long getTaskType() {
    return taskType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManualTaskAction manualTaskAction = (ManualTaskAction) o;
    return Objects.equals(this.id, manualTaskAction.id) &&
        Objects.equals(this.label, manualTaskAction.label) &&
        Objects.equals(this.style, manualTaskAction.style) &&
        Objects.equals(this.taskType, manualTaskAction.taskType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, style, taskType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualTaskAction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
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

