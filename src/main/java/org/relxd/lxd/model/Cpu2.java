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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.relxd.lxd.model.Sockets;

/**
 * Cpu2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-22T12:08:40.528566+02:00[Africa/Harare]")
public class Cpu2 {
  public static final String SERIALIZED_NAME_SOCKETS = "sockets";
  @SerializedName(SERIALIZED_NAME_SOCKETS)
  private List<Sockets> sockets = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total;


  public Cpu2 sockets(List<Sockets> sockets) {
    
    this.sockets = sockets;
    return this;
  }

  public Cpu2 addSocketsItem(Sockets socketsItem) {
    if (this.sockets == null) {
      this.sockets = new ArrayList<Sockets>();
    }
    this.sockets.add(socketsItem);
    return this;
  }

   /**
   * Get sockets
   * @return sockets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Sockets> getSockets() {
    return sockets;
  }


  public void setSockets(List<Sockets> sockets) {
    this.sockets = sockets;
  }


  public Cpu2 total(BigDecimal total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public BigDecimal getTotal() {
    return total;
  }


  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cpu2 cpu2 = (Cpu2) o;
    return Objects.equals(this.sockets, cpu2.sockets) &&
        Objects.equals(this.total, cpu2.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sockets, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cpu2 {\n");
    sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

