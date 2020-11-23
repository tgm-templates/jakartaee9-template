package org.mvnsearch;

import org.junit.jupiter.api.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class WebClientTest {
    @Test
    public void testHttpGet() {
        Client webClient = ClientBuilder.newClient();
        Response res = webClient.target("http://httpbin.org/ip").request().get();
        String text = res.readEntity(String.class);
        System.out.println(text);
    }
}
