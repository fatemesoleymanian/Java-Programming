package org.Hanie.controller;

import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/Student")

public class Student {
    @Path("/Info")
    @GET
    @Produces("text/plain")
    public String students (@QueryParam("name") String name ,@QueryParam("stId") String iD , @QueryParam("Programming") String progScore, @QueryParam("Math") String mathScore)
    {
        System.out.println("app executed in server");
        JSONObject info = new JSONObject();
        info.put("name", name);
        info.put("student id", iD);


        JSONObject score = new JSONObject();
        score.put("math score", mathScore);
        score.put("programming score", progScore);


        return "result is  "+ info.toJSONString ()+" "+score.toJSONString();
    }
}
