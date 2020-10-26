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

import com.google.gson.JsonSyntaxException;
import org.junit.After;
import org.junit.jupiter.api.*;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.model.BackgroundOperationResponse;
import org.relxd.lxd.model.ErrorResponse;
import org.relxd.lxd.model.UpdateClusterMembersByNameRequest;
import org.relxd.lxd.model.UpdateClusterRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertEquals;

/**
 * API tests for ClusterApi
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ClusterApiTest {

    private ClusterApi api;
    private Logger logger;

    @BeforeEach
    public void setup() {

        api = new ClusterApi();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
    }

    @After
    public void deleteClusters(){
        deleteClusterMembersByNameTest();
    }
    
    /**
     * 
     *
     * Remove a member of the cluster
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Order(6)
    public void deleteClusterMembersByNameTest() {
        String name = "new-server";
        BigDecimal force = null;

        try {
            BackgroundOperationResponse response = api.deleteClusterMembersByName(name, force);
            logger.info("Delete Cluster Members Response >>>>>> {}", response);

            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }
    
    /**
     * 
     *
     * Information about a cluster (such as networks and storage pools)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Order(2)
    public void getClusterTest() {
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getCluster(recursion, filter);
            logger.info("Get Cluster Response >>>>>> {}", response);

            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }


    }
    
    /**
     * 
     *
     * List of LXD members in the cluster
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Order(4)
    public void getClusterMembersTest() {
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getClusterMembers(recursion, filter);
            logger.info("Get Cluster Response >>>>>> {}", response);

            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Retrieve the member&#39;s information and status
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Order(5)
    public void getClusterMembersByNameTest() {
        String name = "new-server";
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getClusterMembersByName(name, recursion, filter);
            logger.info("Get Cluster Members By Name Response >>>>>> {}", response);

            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Rename a cluster member
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Order(1)
    public void postClusterMembersByNameTest() {
        String name = "another-server";
        UpdateClusterMembersByNameRequest request = new UpdateClusterMembersByNameRequest();
        request.serverName("new-server");

        try {
            BackgroundOperationResponse response = api.postClusterMembersByName(name, request);
            logger.info("Post Cluster Members By Name Response >>>>>> {}", response);

            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }
    
    /**
     * 
     *
     * Bootstrap or join a cluster, or disable clustering on this node
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Order(3)
    public void putClusterTest() {
        UpdateClusterRequest request = new UpdateClusterRequest();
        request.setServerName("lxd1");
        request.setEnabled(true);

        try {
            BackgroundOperationResponse response = api.putCluster(request);
            logger.info("Put Cluster By Name Response >>>>>> {}", response);

            assertEquals(Integer.valueOf(100), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    private ErrorResponse catchApiException(ApiException e) {
        JSON json = new JSON();
        ErrorResponse errorResponse = new ErrorResponse();
        try {
            errorResponse = json.deserialize(e.getResponseBody(), ErrorResponse.class);
            logger.info("ERROR RESPONSE >>>> " + errorResponse);
        }catch (JsonSyntaxException ex){
            ex.printStackTrace();
        }
        return errorResponse;
    }
    
}
