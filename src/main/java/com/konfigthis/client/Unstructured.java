package com.konfigthis.client;

import com.konfigthis.client.api.GeneralApi;

public class Unstructured {
    private ApiClient apiClient;
    public final GeneralApi general;

    public Unstructured() {
        this(null);
    }

    public Unstructured(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.general = new GeneralApi(this.apiClient);
    }

}
