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
 * Output
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-04T14:50:02.272+02:00[Africa/Harare]")
public class Output {
  public static final String SERIALIZED_NAME_1 = "1";
  @SerializedName(SERIALIZED_NAME_1)
  private String _1;

  public static final String SERIALIZED_NAME_2 = "2";
  @SerializedName(SERIALIZED_NAME_2)
  private String _2;


  public Output _1(String _1) {
    
    this._1 = _1;
    return this;
  }

   /**
   * Get _1
   * @return _1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/1.0/instances/example/logs/exec_b0f737b4-2c8a-4edf-a7c1-4cc7e4e9e155.stdout", value = "")

  public String get1() {
    return _1;
  }


  public void set1(String _1) {
    this._1 = _1;
  }


  public Output _2(String _2) {
    
    this._2 = _2;
    return this;
  }

   /**
   * Get _2
   * @return _2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/1.0/instances/example/logs/exec_b0f737b4-2c8a-4edf-a7c1-4cc7e4e9e155.stderr", value = "")

  public String get2() {
    return _2;
  }


  public void set2(String _2) {
    this._2 = _2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Output output = (Output) o;
    return Objects.equals(this._1, output._1) &&
        Objects.equals(this._2, output._2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_1, _2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Output {\n");
    sb.append("    _1: ").append(toIndentedString(_1)).append("\n");
    sb.append("    _2: ").append(toIndentedString(_2)).append("\n");
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

