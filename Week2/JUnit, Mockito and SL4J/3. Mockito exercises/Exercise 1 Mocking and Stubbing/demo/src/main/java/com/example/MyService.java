package com.example;

public class MyService {
    private ExternalApi api;

    // Constructor injection of ExternalApi
    public MyService(ExternalApi api) {
        this.api = api;
    }

    // This method uses the external API
    public String fetchData() {
        return api.getData();
    }
}
