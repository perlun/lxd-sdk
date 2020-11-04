/*
 * LXD
 * The services listed below are referred as .....
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@relxd.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.relxd.lxd.model;

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

/**
 * GetInstancesByNameBackupsByNameResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-04T14:50:02.272+02:00[Africa/Harare]")
public class GetInstancesByNameBackupsByNameResponse {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private String creationDate;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiry_date";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private String expiryDate;

  public static final String SERIALIZED_NAME_INSTANCE_ONLY = "instance_only";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ONLY)
  private Boolean instanceOnly;

  public static final String SERIALIZED_NAME_OPTIMIZED_STORAGE = "optimized_storage";
  @SerializedName(SERIALIZED_NAME_OPTIMIZED_STORAGE)
  private Boolean optimizedStorage;


  public GetInstancesByNameBackupsByNameResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "backupName", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetInstancesByNameBackupsByNameResponse creationDate(String creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-04-23T12:16:09+02:00", value = "")

  public String getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }


  public GetInstancesByNameBackupsByNameResponse expiryDate(String expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-04-23T12:16:09+02:00", value = "")

  public String getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }


  public GetInstancesByNameBackupsByNameResponse instanceOnly(Boolean instanceOnly) {
    
    this.instanceOnly = instanceOnly;
    return this;
  }

   /**
   * Get instanceOnly
   * @return instanceOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getInstanceOnly() {
    return instanceOnly;
  }


  public void setInstanceOnly(Boolean instanceOnly) {
    this.instanceOnly = instanceOnly;
  }


  public GetInstancesByNameBackupsByNameResponse optimizedStorage(Boolean optimizedStorage) {
    
    this.optimizedStorage = optimizedStorage;
    return this;
  }

   /**
   * Get optimizedStorage
   * @return optimizedStorage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getOptimizedStorage() {
    return optimizedStorage;
  }


  public void setOptimizedStorage(Boolean optimizedStorage) {
    this.optimizedStorage = optimizedStorage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInstancesByNameBackupsByNameResponse getInstancesByNameBackupsByNameResponse = (GetInstancesByNameBackupsByNameResponse) o;
    return Objects.equals(this.name, getInstancesByNameBackupsByNameResponse.name) &&
        Objects.equals(this.creationDate, getInstancesByNameBackupsByNameResponse.creationDate) &&
        Objects.equals(this.expiryDate, getInstancesByNameBackupsByNameResponse.expiryDate) &&
        Objects.equals(this.instanceOnly, getInstancesByNameBackupsByNameResponse.instanceOnly) &&
        Objects.equals(this.optimizedStorage, getInstancesByNameBackupsByNameResponse.optimizedStorage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, creationDate, expiryDate, instanceOnly, optimizedStorage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInstancesByNameBackupsByNameResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    instanceOnly: ").append(toIndentedString(instanceOnly)).append("\n");
    sb.append("    optimizedStorage: ").append(toIndentedString(optimizedStorage)).append("\n");
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

