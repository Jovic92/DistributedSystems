package com.main;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/Random")
public class Random {

	@GET
	@Path("/Hello/{name}")
	public Response printMessage(@PathParam("name") String name) {
		return Response.status(200).entity("Hello " + name).build();
	}

}
