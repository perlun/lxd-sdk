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


package org.relxd.lxd.api;

import org.relxd.lxd.ApiException;
import org.relxd.lxd.model.BasicBackgroundOperationResponse;
import org.relxd.lxd.model.CreateStoragePoolsByNameVolumesByTypeNameRequest;
import org.relxd.lxd.model.CreateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest;
import org.relxd.lxd.model.CreateStoragePoolsByNameVolumesByTypeNameSnapshotsRequest;
import org.relxd.lxd.model.CreateStoragePoolsByNameVolumesByTypeRequest;
import org.relxd.lxd.model.CreateStoragePoolsByNameVolumesRequest;
import org.relxd.lxd.model.CreateStoragePoolsRequest;
import org.relxd.lxd.model.ErrorResponse;
import org.relxd.lxd.model.GetStoragePoolsByNameResourcesResponse;
import org.relxd.lxd.model.GetStoragePoolsByNameResponse;
import org.relxd.lxd.model.GetStoragePoolsByNameVolumesByTypeNameResponse;
import org.relxd.lxd.model.GetStoragePoolsByNameVolumesByTypeNameSnapshotsNameResponse;
import org.relxd.lxd.model.PatchStoragePoolsByNameRequest;
import org.relxd.lxd.model.StandardServerResponse;
import org.relxd.lxd.model.UpdateStoragePoolsByNameRequest;
import org.relxd.lxd.model.UpdateStoragePoolsByNameVolumesByTypeNameRequest;
import org.relxd.lxd.model.UpdateStoragePoolsByNameVolumesByTypeNameRequest2;
import org.relxd.lxd.model.UpdateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoragePoolsApi
 */
@Ignore
public class StoragePoolsApiTest {

    private final StoragePoolsApi api = new StoragePoolsApi();

    
    /**
     * 
     *
     * Remove a storage pool
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStoragePoolsByNameTest() throws ApiException {
        String pool = null;
        StandardServerResponse response = api.deleteStoragePoolsByName(pool);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete a storage volume of a given type on a given storage pool
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStoragePoolsByNameVolumesByTypeNameTest() throws ApiException {
        String pool = null;
        String type = null;
        String name = null;
        StandardServerResponse response = api.deleteStoragePoolsByNameVolumesByTypeName(pool, type, name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Remove the volume snapshot
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStoragePoolsByNameVolumesByTypeNameSnapshotsNameTest() throws ApiException {
        String pool = null;
        String type = null;
        String name = null;
        BasicBackgroundOperationResponse response = api.deleteStoragePoolsByNameVolumesByTypeNameSnapshotsName(pool, type, name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List of storage pools
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolsTest() throws ApiException {
        Integer recursion = null;
        String filter = null;
        List<String> response = api.getStoragePools(recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Information about a storage pool
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolsByNameTest() throws ApiException {
        String pool = null;
        Integer recursion = null;
        String filter = null;
        GetStoragePoolsByNameResponse response = api.getStoragePoolsByName(pool, recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Information about the resources available to the storage pool
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolsByNameResourcesTest() throws ApiException {
        String pool = null;
        Integer recursion = null;
        String filter = null;
        GetStoragePoolsByNameResourcesResponse response = api.getStoragePoolsByNameResources(pool, recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List of storage volumes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolsByNameVolumesTest() throws ApiException {
        String pool = null;
        Integer recursion = null;
        String filter = null;
        List<String> response = api.getStoragePoolsByNameVolumes(pool, recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Information about a storage volume of a given type on a storage pool
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolsByNameVolumesByTypeNameTest() throws ApiException {
        String pool = null;
        String type = null;
        String name = null;
        Integer recursion = null;
        String filter = null;
        GetStoragePoolsByNameVolumesByTypeNameResponse response = api.getStoragePoolsByNameVolumesByTypeName(pool, type, name, recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List of volume snapshots
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolsByNameVolumesByTypeNameSnapshotsTest() throws ApiException {
        String pool = null;
        String type = null;
        String name = null;
        Integer recursion = null;
        String filter = null;
        List<String> response = api.getStoragePoolsByNameVolumesByTypeNameSnapshots(pool, type, name, recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Snapshot information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoragePoolsByNameVolumesByTypeNameSnapshotsNameTest() throws ApiException {
        String pool = null;
        String type = null;
        String name = null;
        Integer recursion = null;
        String filter = null;
        GetStoragePoolsByNameVolumesByTypeNameSnapshotsNameResponse response = api.getStoragePoolsByNameVolumesByTypeNameSnapshotsName(pool, type, name, recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update the storage pool information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchStoragePoolsByNameTest() throws ApiException {
        String pool = null;
        PatchStoragePoolsByNameRequest body = null;
        StandardServerResponse response = api.patchStoragePoolsByName(pool, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update the storage volume information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchStoragePoolsByNameVolumesByTypeNameTest() throws ApiException {
        String pool = null;
        String type = null;
        String name = null;
        UpdateStoragePoolsByNameVolumesByTypeNameRequest2 body = null;
        StandardServerResponse response = api.patchStoragePoolsByNameVolumesByTypeName(pool, type, name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Define a new storage pool
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postStoragePoolsTest() throws ApiException {
        CreateStoragePoolsRequest body = null;
        StandardServerResponse response = api.postStoragePools(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a new storage volume on a given storage pool
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postStoragePoolsByNameVolumesTest() throws ApiException {
        String pool = null;
        CreateStoragePoolsByNameVolumesRequest body = null;
        StandardServerResponse response = api.postStoragePoolsByNameVolumes(pool, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a new storage volume of a particular type on a given storage pool
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postStoragePoolsByNameVolumesByTypeTest() throws ApiException {
        String pool = null;
        String type = null;
        CreateStoragePoolsByNameVolumesByTypeRequest body = null;
        StandardServerResponse response = api.postStoragePoolsByNameVolumesByType(pool, type, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Rename a storage volume on a given storage pool
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postStoragePoolsByNameVolumesByTypeNameTest() throws ApiException {
        String pool = null;
        String type = null;
        String name = null;
        CreateStoragePoolsByNameVolumesByTypeNameRequest body = null;
        BasicBackgroundOperationResponse response = api.postStoragePoolsByNameVolumesByTypeName(pool, type, name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a new volume snapshot
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postStoragePoolsByNameVolumesByTypeNameSnapshotsTest() throws ApiException {
        String pool = null;
        String type = null;
        String name = null;
        CreateStoragePoolsByNameVolumesByTypeNameSnapshotsRequest body = null;
        BasicBackgroundOperationResponse response = api.postStoragePoolsByNameVolumesByTypeNameSnapshots(pool, type, name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Used to rename the volume snapshot
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postStoragePoolsByNameVolumesByTypeNameSnapshotsNameTest() throws ApiException {
        String pool = null;
        String type = null;
        String name = null;
        CreateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest body = null;
        BasicBackgroundOperationResponse response = api.postStoragePoolsByNameVolumesByTypeNameSnapshotsName(pool, type, name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Replace the storage pool information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putStoragePoolsByNameTest() throws ApiException {
        String pool = null;
        UpdateStoragePoolsByNameRequest body = null;
        StandardServerResponse response = api.putStoragePoolsByName(pool, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Replace the storage volume information or restore from snapshot
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putStoragePoolsByNameVolumesByTypeNameTest() throws ApiException {
        String pool = null;
        String type = null;
        String name = null;
        UpdateStoragePoolsByNameVolumesByTypeNameRequest body = null;
        StandardServerResponse response = api.putStoragePoolsByNameVolumesByTypeName(pool, type, name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Volume snapshot information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putStoragePoolsByNameVolumesByTypeNameSnapshotsNameTest() throws ApiException {
        String pool = null;
        String type = null;
        String name = null;
        UpdateStoragePoolsByNameVolumesByTypeNameSnapshotsNameRequest body = null;
        GetStoragePoolsByNameVolumesByTypeNameSnapshotsNameResponse response = api.putStoragePoolsByNameVolumesByTypeNameSnapshotsName(pool, type, name, body);

        // TODO: test validations
    }
    
}
