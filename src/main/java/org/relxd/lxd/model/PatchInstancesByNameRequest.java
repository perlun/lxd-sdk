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
import org.relxd.lxd.model.CpuConfig;
import org.relxd.lxd.model.Devices3;

/**
 * PatchInstancesByNameRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-14T17:33:23.019065+02:00[Africa/Harare]")
public class PatchInstancesByNameRequest {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private CpuConfig config;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private Devices3 devices;

  public static final String SERIALIZED_NAME_EPHEMERAL = "ephemeral";
  @SerializedName(SERIALIZED_NAME_EPHEMERAL)
  private Boolean ephemeral;


  public PatchInstancesByNameRequest config(CpuConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CpuConfig getConfig() {
    return config;
  }


  public void setConfig(CpuConfig config) {
    this.config = config;
  }


  public PatchInstancesByNameRequest devices(Devices3 devices) {
    
    this.devices = devices;
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Devices3 getDevices() {
    return devices;
  }


  public void setDevices(Devices3 devices) {
    this.devices = devices;
  }


  public PatchInstancesByNameRequest ephemeral(Boolean ephemeral) {
    
    this.ephemeral = ephemeral;
    return this;
  }

   /**
   * Get ephemeral
   * @return ephemeral
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getEphemeral() {
    return ephemeral;
  }


  public void setEphemeral(Boolean ephemeral) {
    this.ephemeral = ephemeral;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchInstancesByNameRequest patchInstancesByNameRequest = (PatchInstancesByNameRequest) o;
    return Objects.equals(this.config, patchInstancesByNameRequest.config) &&
        Objects.equals(this.devices, patchInstancesByNameRequest.devices) &&
        Objects.equals(this.ephemeral, patchInstancesByNameRequest.ephemeral);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, devices, ephemeral);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchInstancesByNameRequest {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    ephemeral: ").append(toIndentedString(ephemeral)).append("\n");
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

