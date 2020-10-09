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
import java.math.BigDecimal;
import org.relxd.lxd.model.CreateNetworksByNameRequest;
import org.relxd.lxd.model.CreateNetworksRequest;
import org.relxd.lxd.model.ErrorResponse;
import org.relxd.lxd.model.GetNetworksByNameResponse;
import org.relxd.lxd.model.GetNetworksByNameStateResponse;
import org.relxd.lxd.model.GetNetworksUUIDResponse;
import org.relxd.lxd.model.PatchNetworksByNameRequest;
import org.relxd.lxd.model.StandardServerResponse;
import org.relxd.lxd.model.UpdateNetworksByNameRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NetworksApi
 */
@Ignore
public class NetworksApiTest {

    private final NetworksApi api = new NetworksApi();

    
    /**
     * 
     *
     * Remove a network
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNetworksByNameTest() throws ApiException {
        String name = null;
        StandardServerResponse response = api.deleteNetworksByName(name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Cancel an operation. Calling this will change the state to \&quot;cancelling\&quot; rather than actually removing the entry.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNetworksUUIDTest() throws ApiException {
        String uuid = null;
        StandardServerResponse response = api.deleteNetworksUUID(uuid);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List of networks
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworksTest() throws ApiException {
        Integer recursion = null;
        String filter = null;
        List<String> response = api.getNetworks(recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Information about a network
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworksByNameTest() throws ApiException {
        String name = null;
        Integer recursion = null;
        String filter = null;
        GetNetworksByNameResponse response = api.getNetworksByName(name, recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Network state
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworksByNameStateTest() throws ApiException {
        String name = null;
        Integer recursion = null;
        String filter = null;
        GetNetworksByNameStateResponse response = api.getNetworksByNameState(name, recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Background operation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworksUUIDTest() throws ApiException {
        String uuid = null;
        Integer recursion = null;
        String filter = null;
        GetNetworksUUIDResponse response = api.getNetworksUUID(uuid, recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Wait for an operation to finish
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworksUUIDWaitTest() throws ApiException {
        String uuid = null;
        Integer recursion = null;
        String filter = null;
        BigDecimal timeout = null;
        GetNetworksUUIDResponse response = api.getNetworksUUIDWait(uuid, recursion, filter, timeout);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * -&lt; This connection is upgraded into a websocket connection speaking the protocol defined by the operation type. For example, in the case of an exec operation, the websocket is the bidirectional pipe for stdin/stdout/stderr to flow to and from the process inside the instance. In the case of migration, it will be the primary interface over which the migration information is communicated. The secret here is the one that was provided when the operation was created. Guests are allowed to connect provided they have the right secret.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworksUUIDWebsocketTest() throws ApiException {
        String uuid = null;
        String secret = null;
        Integer recursion = null;
        String filter = null;
        GetNetworksUUIDResponse response = api.getNetworksUUIDWebsocket(uuid, secret, recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update the network information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNetworksByNameTest() throws ApiException {
        String name = null;
        PatchNetworksByNameRequest body = null;
        StandardServerResponse response = api.patchNetworksByName(name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Define a new network
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNetworksTest() throws ApiException {
        CreateNetworksRequest body = null;
        StandardServerResponse response = api.postNetworks(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Rename a network
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNetworksByNameTest() throws ApiException {
        String name = null;
        CreateNetworksByNameRequest body = null;
        Object response = api.postNetworksByName(name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Replace the network information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNetworksByNameTest() throws ApiException {
        String name = null;
        UpdateNetworksByNameRequest body = null;
        StandardServerResponse response = api.putNetworksByName(name, body);

        // TODO: test validations
    }
    
}
