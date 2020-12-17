package org.Hanie.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/EmployeeInformation")
public class EmpInfo {
    @Path("/Info")
    @GET
    @Produces("text/plain")
    public String saveInfo (@QueryParam("Full Name") String name , @QueryParam("Age") String age , @QueryParam("Gender") String gender ,@QueryParam("Education") String edu )
    {
        System.out.println("form executed in server");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("full name", name);
        jsonObject.put("age", age);
        jsonObject.put("gender",gender);
        jsonObject.put("education",edu);

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(jsonObject);

        return jsonArray.toJSONString();
    }

}
