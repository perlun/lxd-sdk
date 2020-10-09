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
import org.relxd.lxd.model.FileSystemMountOptionsAndThinPoolConfig;
import org.relxd.lxd.model.UpdateStoragePoolsByNameVolumesByTypeNameRequest2;
import org.relxd.lxd.model.UpdateStoragePoolsByNameVolumesByTypeNameRequestOneOf;

/**
 * UpdateStoragePoolsByNameVolumesByTypeNameRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-09T10:04:09.006814+02:00[Africa/Harare]")
public class UpdateStoragePoolsByNameVolumesByTypeNameRequest {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private FileSystemMountOptionsAndThinPoolConfig config;

  public static final String SERIALIZED_NAME_RESTORE = "restore";
  @SerializedName(SERIALIZED_NAME_RESTORE)
  private String restore;


  public UpdateStoragePoolsByNameVolumesByTypeNameRequest config(FileSystemMountOptionsAndThinPoolConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileSystemMountOptionsAndThinPoolConfig getConfig() {
    return config;
  }


  public void setConfig(FileSystemMountOptionsAndThinPoolConfig config) {
    this.config = config;
  }


  public UpdateStoragePoolsByNameVolumesByTypeNameRequest restore(String restore) {
    
    this.restore = restore;
    return this;
  }

   /**
   * Get restore
   * @return restore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "snapshot-name", value = "")

  public String getRestore() {
    return restore;
  }


  public void setRestore(String restore) {
    this.restore = restore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateStoragePoolsByNameVolumesByTypeNameRequest updateStoragePoolsByNameVolumesByTypeNameRequest = (UpdateStoragePoolsByNameVolumesByTypeNameRequest) o;
    return Objects.equals(this.config, updateStoragePoolsByNameVolumesByTypeNameRequest.config) &&
        Objects.equals(this.restore, updateStoragePoolsByNameVolumesByTypeNameRequest.restore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, restore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateStoragePoolsByNameVolumesByTypeNameRequest {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    restore: ").append(toIndentedString(restore)).append("\n");
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

