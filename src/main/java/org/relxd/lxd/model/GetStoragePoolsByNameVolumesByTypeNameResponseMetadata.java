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
import java.util.ArrayList;
import java.util.List;
import org.relxd.lxd.model.BlockFileSystemAndMountOptionsConfig;

/**
 * GetStoragePoolsByNameVolumesByTypeNameResponseMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-09T10:04:09.006814+02:00[Africa/Harare]")
public class GetStoragePoolsByNameVolumesByTypeNameResponseMetadata {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USED_BY = "used_by";
  @SerializedName(SERIALIZED_NAME_USED_BY)
  private List<String> usedBy = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private BlockFileSystemAndMountOptionsConfig config;


  public GetStoragePoolsByNameVolumesByTypeNameResponseMetadata type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "custom", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public GetStoragePoolsByNameVolumesByTypeNameResponseMetadata usedBy(List<String> usedBy) {
    
    this.usedBy = usedBy;
    return this;
  }

  public GetStoragePoolsByNameVolumesByTypeNameResponseMetadata addUsedByItem(String usedByItem) {
    if (this.usedBy == null) {
      this.usedBy = new ArrayList<String>();
    }
    this.usedBy.add(usedByItem);
    return this;
  }

   /**
   * Get usedBy
   * @return usedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUsedBy() {
    return usedBy;
  }


  public void setUsedBy(List<String> usedBy) {
    this.usedBy = usedBy;
  }


  public GetStoragePoolsByNameVolumesByTypeNameResponseMetadata name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "vol1", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetStoragePoolsByNameVolumesByTypeNameResponseMetadata config(BlockFileSystemAndMountOptionsConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BlockFileSystemAndMountOptionsConfig getConfig() {
    return config;
  }


  public void setConfig(BlockFileSystemAndMountOptionsConfig config) {
    this.config = config;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStoragePoolsByNameVolumesByTypeNameResponseMetadata getStoragePoolsByNameVolumesByTypeNameResponseMetadata = (GetStoragePoolsByNameVolumesByTypeNameResponseMetadata) o;
    return Objects.equals(this.type, getStoragePoolsByNameVolumesByTypeNameResponseMetadata.type) &&
        Objects.equals(this.usedBy, getStoragePoolsByNameVolumesByTypeNameResponseMetadata.usedBy) &&
        Objects.equals(this.name, getStoragePoolsByNameVolumesByTypeNameResponseMetadata.name) &&
        Objects.equals(this.config, getStoragePoolsByNameVolumesByTypeNameResponseMetadata.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, usedBy, name, config);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStoragePoolsByNameVolumesByTypeNameResponseMetadata {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usedBy: ").append(toIndentedString(usedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

