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
import org.relxd.lxd.model.Eth0;
import org.relxd.lxd.model.Root;

/**
 * ExpandedDevices
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-23T12:53:01.261363+02:00[Africa/Harare]")
public class ExpandedDevices {
  public static final String SERIALIZED_NAME_ETH0 = "eth0";
  @SerializedName(SERIALIZED_NAME_ETH0)
  private Eth0 eth0;

  public static final String SERIALIZED_NAME_ROOT = "root";
  @SerializedName(SERIALIZED_NAME_ROOT)
  private Root root;


  public ExpandedDevices eth0(Eth0 eth0) {
    
    this.eth0 = eth0;
    return this;
  }

   /**
   * Get eth0
   * @return eth0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Eth0 getEth0() {
    return eth0;
  }


  public void setEth0(Eth0 eth0) {
    this.eth0 = eth0;
  }


  public ExpandedDevices root(Root root) {
    
    this.root = root;
    return this;
  }

   /**
   * Get root
   * @return root
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Root getRoot() {
    return root;
  }


  public void setRoot(Root root) {
    this.root = root;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpandedDevices expandedDevices = (ExpandedDevices) o;
    return Objects.equals(this.eth0, expandedDevices.eth0) &&
        Objects.equals(this.root, expandedDevices.root);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eth0, root);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpandedDevices {\n");
    sb.append("    eth0: ").append(toIndentedString(eth0)).append("\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
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

