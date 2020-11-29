package com.baran.webservis.RestApi;

public class BaseManager {

    protected RestApi getRestApiClient(){
        RestApiClient restApiClient = new RestApiClient(BaseUrl.BASE_URL);

        return restApiClient.getRestApi();
    }
}
