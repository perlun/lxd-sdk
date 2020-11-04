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
import org.relxd.lxd.model.Properties4;

/**
 * UpdateImagesFingerprintRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-04T14:50:02.272+02:00[Africa/Harare]")
public class UpdateImagesFingerprintRequest {
  public static final String SERIALIZED_NAME_AUTO_UPDATE = "auto_update";
  @SerializedName(SERIALIZED_NAME_AUTO_UPDATE)
  private Boolean autoUpdate;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Properties4 properties;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;


  public UpdateImagesFingerprintRequest autoUpdate(Boolean autoUpdate) {
    
    this.autoUpdate = autoUpdate;
    return this;
  }

   /**
   * Get autoUpdate
   * @return autoUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getAutoUpdate() {
    return autoUpdate;
  }


  public void setAutoUpdate(Boolean autoUpdate) {
    this.autoUpdate = autoUpdate;
  }


  public UpdateImagesFingerprintRequest properties(Properties4 properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Properties4 getProperties() {
    return properties;
  }


  public void setProperties(Properties4 properties) {
    this.properties = properties;
  }


  public UpdateImagesFingerprintRequest _public(Boolean _public) {
    
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    this._public = _public;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateImagesFingerprintRequest updateImagesFingerprintRequest = (UpdateImagesFingerprintRequest) o;
    return Objects.equals(this.autoUpdate, updateImagesFingerprintRequest.autoUpdate) &&
        Objects.equals(this.properties, updateImagesFingerprintRequest.properties) &&
        Objects.equals(this._public, updateImagesFingerprintRequest._public);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoUpdate, properties, _public);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateImagesFingerprintRequest {\n");
    sb.append("    autoUpdate: ").append(toIndentedString(autoUpdate)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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

