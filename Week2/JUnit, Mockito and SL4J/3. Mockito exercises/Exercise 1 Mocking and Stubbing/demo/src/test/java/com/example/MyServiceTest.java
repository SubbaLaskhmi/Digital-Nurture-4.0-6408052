package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Mock the ExternalApi
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Stub the method to return mock data
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject mock into the service
        MyService service = new MyService(mockApi);

        // Step 4: Call the method and assert the result
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}
