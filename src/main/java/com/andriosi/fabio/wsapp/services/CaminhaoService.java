/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.wsapp.services;

import com.andriosi.fabio.session.CaminhaoFacade;
import com.andriosi.fabio.wsapp.entities.Caminhao;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("caminhao")
public class CaminhaoService{
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCaminhao(){
        return Response.ok(new CaminhaoFacade().findAll()).build();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createCaminhao(Caminhao caminhao){
        CaminhaoFacade facade = new CaminhaoFacade();
        facade.create(caminhao);
        return Response.ok().build();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response getCaminhaById(@PathParam("id")Long id){
        return Response.ok(new CaminhaoFacade().find(id)).build();
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateCaminhao(Caminhao caminhao){
        new CaminhaoFacade().edit(caminhao);
        return Response.ok().build();
    }
    
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteCaminhao(Caminhao caminhao){
        new CaminhaoFacade().remove(caminhao);
        return Response.ok().build();
    }
}
