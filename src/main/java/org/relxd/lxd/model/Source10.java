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
 * Source10
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-09T10:04:09.006814+02:00[Africa/Harare]")
public class Source10 {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private String certificate;

  public static final String SERIALIZED_NAME_FINGERPRINT = "fingerprint";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT)
  private String fingerprint;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public Source10 type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "image", required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Source10 mode(String mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Only pull is supported for now
   * @return mode
  **/
  @ApiModelProperty(example = "pull", required = true, value = "Only pull is supported for now")

  public String getMode() {
    return mode;
  }


  public void setMode(String mode) {
    this.mode = mode;
  }


  public Source10 server(String server) {
    
    this.server = server;
    return this;
  }

   /**
   * Remote server (pull mode only)
   * @return server
  **/
  @ApiModelProperty(example = "https://10.0.2.3:8443", required = true, value = "Remote server (pull mode only)")

  public String getServer() {
    return server;
  }


  public void setServer(String server) {
    this.server = server;
  }


  public Source10 protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Protocol (one of lxd or simplestreams, defaults to lxd)
   * @return protocol
  **/
  @ApiModelProperty(example = "lxd", required = true, value = "Protocol (one of lxd or simplestreams, defaults to lxd)")

  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public Source10 secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Secret (pull mode only, private images only)
   * @return secret
  **/
  @ApiModelProperty(example = "my-secret-string", required = true, value = "Secret (pull mode only, private images only)")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public Source10 certificate(String certificate) {
    
    this.certificate = certificate;
    return this;
  }

   /**
   * Optional PEM certificate. If not mentioned, system CA is used.
   * @return certificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PEM certificate", value = "Optional PEM certificate. If not mentioned, system CA is used.")

  public String getCertificate() {
    return certificate;
  }


  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  public Source10 fingerprint(String fingerprint) {
    
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Fingerprint of the image (must be set if alias isn&#39;t)
   * @return fingerprint
  **/
  @ApiModelProperty(example = "SHA256", required = true, value = "Fingerprint of the image (must be set if alias isn't)")

  public String getFingerprint() {
    return fingerprint;
  }


  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }


  public Source10 alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Name of the alias (must be set if fingerprint isn&#39;t)
   * @return alias
  **/
  @ApiModelProperty(example = "ubuntu/devel", required = true, value = "Name of the alias (must be set if fingerprint isn't)")

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public Source10 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abc", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Source10 url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL for the image
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.some-server.com/image", value = "URL for the image")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Source10 source10 = (Source10) o;
    return Objects.equals(this.type, source10.type) &&
        Objects.equals(this.mode, source10.mode) &&
        Objects.equals(this.server, source10.server) &&
        Objects.equals(this.protocol, source10.protocol) &&
        Objects.equals(this.secret, source10.secret) &&
        Objects.equals(this.certificate, source10.certificate) &&
        Objects.equals(this.fingerprint, source10.fingerprint) &&
        Objects.equals(this.alias, source10.alias) &&
        Objects.equals(this.name, source10.name) &&
        Objects.equals(this.url, source10.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, mode, server, protocol, secret, certificate, fingerprint, alias, name, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Source10 {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

