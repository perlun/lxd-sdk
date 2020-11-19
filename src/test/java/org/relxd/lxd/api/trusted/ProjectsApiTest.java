
package org.relxd.lxd.api.trusted;

import com.google.gson.JsonSyntaxException;
import org.junit.After;
import org.junit.jupiter.api.*;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.api.ProjectsApi;
import org.relxd.lxd.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.TestCase.assertEquals;

/**
 * API tests for ProjectsApi
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProjectsApiTest {

    private ProjectsApi api;
    private Logger logger;

    @BeforeAll
    public void setup() {
        api = new ProjectsApi();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
    }

    @After
    public void deleteProjects(){
        deleteProjectsByNameTest();
    }
    /**
     * 
     *
     * Remove a project
     *
     */
    @Test
    public void deleteProjectsByNameTest() {
        String name = "project1rename";

        try {
            BackgroundOperationResponse response = api.deleteProjectsByName(name);
            logger.info("Delete Projects By Name Response >>>>> {}", response);
            assertEquals(Integer.valueOf(200),response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }
    
    /**
     * 
     *
     * List of projects
     *
     */
    @Test
    @Order(2)
    public void getProjectsTest() {
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getProjects(recursion, filter);
            logger.info("Get Projects Response >>>>>> {}", response);
            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Project configuration
     *
     */
    @Test
    @Order(4)
    public void getProjectsByNameTest() {
        String name = "project1rename";
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getProjectsByName(name, recursion, filter);
            logger.info("Get Projects By Name Response >>>>> {}", response);
            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Update the project information
     *
     */
    @Test
    @Order(6)
    public void patchProjectsByNameTest() {
        String name = "project1rename";
        UpdateProjectsByNameRequest request = new UpdateProjectsByNameRequest();
        request.setDescription("My new Profile Description");

        try {
            BackgroundOperationResponse response = api.patchProjectsByName(name, request);
            logger.info("Patch Projects By Name >>>>>> {}", response);
            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }
    
    /**
     * 
     *
     * Define a new project
     *
     */
    @Test
    @Order(1)
    public void postProjectsTest() {
        CreateProjectsRequest request = new CreateProjectsRequest();

        FeaturesConfig featuresConfig = new FeaturesConfig();
        featuresConfig.setFeaturesImages("true");
        featuresConfig.setFeaturesProfiles("true");

        request.setName("project1");
        request.setDescription("My new description for new project");
        request.setConfig(featuresConfig);

        try {
            BackgroundOperationResponse response = api.postProjects(request);
            logger.info("Post Projects Response >>>>>> {}", response);
            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Rename a project
     *
     */
    @Test
    @Order(3)
    public void postProjectsByNameTest() {
        String name = "project1";
        CreateProjectsByNameRequest request = new CreateProjectsByNameRequest();
        request.setName("project1rename");

        try {
            BackgroundOperationResponse response = api.postProjectsByName(name, request);
            logger.info("Post Projects By Name Response >>>>>> {}", response);
            assertEquals(Integer.valueOf(100), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Replace the project information
     *
     */
    @Test
    @Order(5)
    public void putProjectsByNameTest() {
        String name = "project1rename";

        FeaturesConfig featuresConfig = new FeaturesConfig();
        featuresConfig.setFeaturesProfiles("true");
        featuresConfig.setFeaturesImages("true");

        UpdateProjectsByNameRequest request = new UpdateProjectsByNameRequest();
        request.setDescription("New Description for project1rename");
        request.setConfig(featuresConfig);

        try {
            BackgroundOperationResponse response = api.putProjectsByName(name, request);
            logger.info("Put Projects By Name Response >>>>> {}", response);
            assertEquals(Integer.valueOf(200), response.getStatusCode());
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

        }
        return errorResponse;
    }
    
}
