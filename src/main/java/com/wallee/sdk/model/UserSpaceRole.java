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
 * 
 */
public class UserSpaceRole {
  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("role")
  protected Long role = null;

  
  @SerializedName("space")
  protected Long space = null;

  
  @SerializedName("user")
  protected Long user = null;

  
  @SerializedName("version")
  protected Integer version = null;

  
  
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
   * @return role
  **/
  @ApiModelProperty(value = "")
  public Long getRole() {
    return role;
  }

  
   /**
   * 
   * @return space
  **/
  @ApiModelProperty(value = "")
  public Long getSpace() {
    return space;
  }

  
   /**
   * 
   * @return user
  **/
  @ApiModelProperty(value = "")
  public Long getUser() {
    return user;
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
    UserSpaceRole userSpaceRole = (UserSpaceRole) o;
    return Objects.equals(this.id, userSpaceRole.id) &&
        Objects.equals(this.role, userSpaceRole.role) &&
        Objects.equals(this.space, userSpaceRole.space) &&
        Objects.equals(this.user, userSpaceRole.user) &&
        Objects.equals(this.version, userSpaceRole.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, role, space, user, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSpaceRole {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    space: ").append(toIndentedString(space)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

