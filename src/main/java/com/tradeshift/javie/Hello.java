package com.tradeshift.javie;


import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Javie on 15/7/23.
 */


@Path("annotation")
public class Hello {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.tradeshift.javie");
    Player player = applicationContext.getBean(Player.class);


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String runGet() {

        return "Everything gonna be fine!";

    }

    @POST
    @Path("player/name/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String runPOST(@PathParam("name") String name) {
        return name + player.play();
    }

    @POST
    @Path("test/id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public JSONObject run(@PathParam("id") int id) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("id",id);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    @POST
    @Path("test/json")
//    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String runJson(Player player) {
        return player.toString();
    }

    @POST
    @Path("test/form")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String runForm(@FormParam("msg") String msg){
        return msg;
    }


}
