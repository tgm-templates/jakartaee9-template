package org.mvnsearch;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("")
@ApplicationScoped
public class PortalResource {
    @GET
    public String index() {
        return "hello World!";
    }

    @GET
    @Path("/ok")
    public Response ok() {
        String message = "This is a text response";
        return Response
                .status(Response.Status.OK)
                .entity(message)
                .build();
    }
}
