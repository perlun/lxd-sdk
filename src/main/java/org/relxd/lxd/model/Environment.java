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

/**
 * Environment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-23T12:53:01.261363+02:00[Africa/Harare]")
public class Environment {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = null;

  public static final String SERIALIZED_NAME_ARCHITECTURES = "architectures";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURES)
  private List<String> architectures = null;

  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private String certificate;

  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_DRIVER_VERSION = "driver_version";
  @SerializedName(SERIALIZED_NAME_DRIVER_VERSION)
  private String driverVersion;

  public static final String SERIALIZED_NAME_KERNEL = "kernel";
  @SerializedName(SERIALIZED_NAME_KERNEL)
  private String kernel;

  public static final String SERIALIZED_NAME_KERNEL_ARCHITECTURE = "kernel_architecture";
  @SerializedName(SERIALIZED_NAME_KERNEL_ARCHITECTURE)
  private String kernelArchitecture;

  public static final String SERIALIZED_NAME_KERNEL_VERSION = "kernel_version";
  @SerializedName(SERIALIZED_NAME_KERNEL_VERSION)
  private String kernelVersion;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_SERVER_PID = "server_pid";
  @SerializedName(SERIALIZED_NAME_SERVER_PID)
  private Integer serverPid;

  public static final String SERIALIZED_NAME_SERVER_VERSION = "server_version";
  @SerializedName(SERIALIZED_NAME_SERVER_VERSION)
  private String serverVersion;

  public static final String SERIALIZED_NAME_STORAGE = "storage";
  @SerializedName(SERIALIZED_NAME_STORAGE)
  private String storage;

  public static final String SERIALIZED_NAME_STORAGE_VERSION = "storage_version";
  @SerializedName(SERIALIZED_NAME_STORAGE_VERSION)
  private String storageVersion;


  public Environment addresses(List<String> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public Environment addAddressesItem(String addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<String>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1.2.3.4:8443,[1234::1234]:8443]", value = "")

  public List<String> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public Environment architectures(List<String> architectures) {
    
    this.architectures = architectures;
    return this;
  }

  public Environment addArchitecturesItem(String architecturesItem) {
    if (this.architectures == null) {
      this.architectures = new ArrayList<String>();
    }
    this.architectures.add(architecturesItem);
    return this;
  }

   /**
   * Get architectures
   * @return architectures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"x86_64\",\"i686\"]", value = "")

  public List<String> getArchitectures() {
    return architectures;
  }


  public void setArchitectures(List<String> architectures) {
    this.architectures = architectures;
  }


  public Environment certificate(String certificate) {
    
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PEM certificate", value = "")

  public String getCertificate() {
    return certificate;
  }


  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  public Environment driver(String driver) {
    
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "lxc", value = "")

  public String getDriver() {
    return driver;
  }


  public void setDriver(String driver) {
    this.driver = driver;
  }


  public Environment driverVersion(String driverVersion) {
    
    this.driverVersion = driverVersion;
    return this;
  }

   /**
   * Get driverVersion
   * @return driverVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0.6", value = "")

  public String getDriverVersion() {
    return driverVersion;
  }


  public void setDriverVersion(String driverVersion) {
    this.driverVersion = driverVersion;
  }


  public Environment kernel(String kernel) {
    
    this.kernel = kernel;
    return this;
  }

   /**
   * Get kernel
   * @return kernel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Linux", value = "")

  public String getKernel() {
    return kernel;
  }


  public void setKernel(String kernel) {
    this.kernel = kernel;
  }


  public Environment kernelArchitecture(String kernelArchitecture) {
    
    this.kernelArchitecture = kernelArchitecture;
    return this;
  }

   /**
   * Get kernelArchitecture
   * @return kernelArchitecture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "x86_64", value = "")

  public String getKernelArchitecture() {
    return kernelArchitecture;
  }


  public void setKernelArchitecture(String kernelArchitecture) {
    this.kernelArchitecture = kernelArchitecture;
  }


  public Environment kernelVersion(String kernelVersion) {
    
    this.kernelVersion = kernelVersion;
    return this;
  }

   /**
   * Get kernelVersion
   * @return kernelVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.16", value = "")

  public String getKernelVersion() {
    return kernelVersion;
  }


  public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }


  public Environment server(String server) {
    
    this.server = server;
    return this;
  }

   /**
   * Get server
   * @return server
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "lxc", value = "")

  public String getServer() {
    return server;
  }


  public void setServer(String server) {
    this.server = server;
  }


  public Environment serverPid(Integer serverPid) {
    
    this.serverPid = serverPid;
    return this;
  }

   /**
   * Get serverPid
   * @return serverPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10224", value = "")

  public Integer getServerPid() {
    return serverPid;
  }


  public void setServerPid(Integer serverPid) {
    this.serverPid = serverPid;
  }


  public Environment serverVersion(String serverVersion) {
    
    this.serverVersion = serverVersion;
    return this;
  }

   /**
   * Get serverVersion
   * @return serverVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.8.1", value = "")

  public String getServerVersion() {
    return serverVersion;
  }


  public void setServerVersion(String serverVersion) {
    this.serverVersion = serverVersion;
  }


  public Environment storage(String storage) {
    
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "btrfs", value = "")

  public String getStorage() {
    return storage;
  }


  public void setStorage(String storage) {
    this.storage = storage;
  }


  public Environment storageVersion(String storageVersion) {
    
    this.storageVersion = storageVersion;
    return this;
  }

   /**
   * Get storageVersion
   * @return storageVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.19", value = "")

  public String getStorageVersion() {
    return storageVersion;
  }


  public void setStorageVersion(String storageVersion) {
    this.storageVersion = storageVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Environment environment = (Environment) o;
    return Objects.equals(this.addresses, environment.addresses) &&
        Objects.equals(this.architectures, environment.architectures) &&
        Objects.equals(this.certificate, environment.certificate) &&
        Objects.equals(this.driver, environment.driver) &&
        Objects.equals(this.driverVersion, environment.driverVersion) &&
        Objects.equals(this.kernel, environment.kernel) &&
        Objects.equals(this.kernelArchitecture, environment.kernelArchitecture) &&
        Objects.equals(this.kernelVersion, environment.kernelVersion) &&
        Objects.equals(this.server, environment.server) &&
        Objects.equals(this.serverPid, environment.serverPid) &&
        Objects.equals(this.serverVersion, environment.serverVersion) &&
        Objects.equals(this.storage, environment.storage) &&
        Objects.equals(this.storageVersion, environment.storageVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, architectures, certificate, driver, driverVersion, kernel, kernelArchitecture, kernelVersion, server, serverPid, serverVersion, storage, storageVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Environment {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    architectures: ").append(toIndentedString(architectures)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    driverVersion: ").append(toIndentedString(driverVersion)).append("\n");
    sb.append("    kernel: ").append(toIndentedString(kernel)).append("\n");
    sb.append("    kernelArchitecture: ").append(toIndentedString(kernelArchitecture)).append("\n");
    sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    serverPid: ").append(toIndentedString(serverPid)).append("\n");
    sb.append("    serverVersion: ").append(toIndentedString(serverVersion)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    storageVersion: ").append(toIndentedString(storageVersion)).append("\n");
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

