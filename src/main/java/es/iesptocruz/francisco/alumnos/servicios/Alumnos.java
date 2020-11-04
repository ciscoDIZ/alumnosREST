package es.iesptocruz.francisco.alumnos.servicios;

import es.iesptocruz.francisco.alumnos.modelo.Alumno;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/alumnos")
public class Alumnos {
    @GET
    @Path("/info")
    public Response getInfo(){
        return Response.status(200).entity("Alumnos OK").build();
    }

    @GET
    @Path("/xml")
    @Produces({MediaType.APPLICATION_XML})
    public Alumno getXML(){
        return null;
    }

    @GET
    @Path("/json")
    @Produces({MediaType.APPLICATION_JSON})
    public Alumno getJson(){
        return null;
    }

    @GET
    @Path("/text")
    @Produces({MediaType.TEXT_PLAIN})
    public String getHTML(){
        return null;
    }
}
