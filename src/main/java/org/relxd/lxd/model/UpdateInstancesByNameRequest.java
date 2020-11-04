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
import org.relxd.lxd.model.DevicesRoot;
import org.relxd.lxd.model.HardwareSpecsConfig;
import org.relxd.lxd.model.UpdateInstancesByNameRequest2;
import org.relxd.lxd.model.UpdateInstancesByNameRequestOneOf;

/**
 * UpdateInstancesByNameRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-04T14:50:02.272+02:00[Africa/Harare]")
public class UpdateInstancesByNameRequest {
  public static final String SERIALIZED_NAME_RESTORE = "restore";
  @SerializedName(SERIALIZED_NAME_RESTORE)
  private String restore;

  public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
  private String architecture;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private HardwareSpecsConfig config;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private DevicesRoot devices;

  public static final String SERIALIZED_NAME_EPHEMERAL = "ephemeral";
  @SerializedName(SERIALIZED_NAME_EPHEMERAL)
  private Boolean ephemeral;

  public static final String SERIALIZED_NAME_PROFILES = "profiles";
  @SerializedName(SERIALIZED_NAME_PROFILES)
  private List<String> profiles = null;


  public UpdateInstancesByNameRequest restore(String restore) {
    
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


  public UpdateInstancesByNameRequest architecture(String architecture) {
    
    this.architecture = architecture;
    return this;
  }

   /**
   * Get architecture
   * @return architecture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "x86_64", value = "")

  public String getArchitecture() {
    return architecture;
  }


  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }


  public UpdateInstancesByNameRequest config(HardwareSpecsConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HardwareSpecsConfig getConfig() {
    return config;
  }


  public void setConfig(HardwareSpecsConfig config) {
    this.config = config;
  }


  public UpdateInstancesByNameRequest devices(DevicesRoot devices) {
    
    this.devices = devices;
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DevicesRoot getDevices() {
    return devices;
  }


  public void setDevices(DevicesRoot devices) {
    this.devices = devices;
  }


  public UpdateInstancesByNameRequest ephemeral(Boolean ephemeral) {
    
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


  public UpdateInstancesByNameRequest profiles(List<String> profiles) {
    
    this.profiles = profiles;
    return this;
  }

  public UpdateInstancesByNameRequest addProfilesItem(String profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<String>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

   /**
   * Get profiles
   * @return profiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getProfiles() {
    return profiles;
  }


  public void setProfiles(List<String> profiles) {
    this.profiles = profiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInstancesByNameRequest updateInstancesByNameRequest = (UpdateInstancesByNameRequest) o;
    return Objects.equals(this.restore, updateInstancesByNameRequest.restore) &&
        Objects.equals(this.architecture, updateInstancesByNameRequest.architecture) &&
        Objects.equals(this.config, updateInstancesByNameRequest.config) &&
        Objects.equals(this.devices, updateInstancesByNameRequest.devices) &&
        Objects.equals(this.ephemeral, updateInstancesByNameRequest.ephemeral) &&
        Objects.equals(this.profiles, updateInstancesByNameRequest.profiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restore, architecture, config, devices, ephemeral, profiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInstancesByNameRequest {\n");
    sb.append("    restore: ").append(toIndentedString(restore)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    ephemeral: ").append(toIndentedString(ephemeral)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
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

