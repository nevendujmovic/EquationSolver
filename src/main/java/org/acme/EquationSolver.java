package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.text.DecimalFormat;
// this path will ensure the providing of required variables
// to the endpoint request
@Path("/equationsolver/{a}/{b}/{c}/{d}/{u}/{z}")
public class EquationSolver {
    // this is the main method that will be exposed as endpoint
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String solveEquation(@PathParam("a") float a,
                                @PathParam("b") float b,
                                @PathParam("c") float c,
                                @PathParam("d") float d,
                                @PathParam("z") float z,
                                @PathParam("u") float u) {
// use formulas explend in previos section
        float det = a * d - b * c;
        float x = (1 / det) * d * u + (1 / det) * (-b) * z;
        float y = (1 / det) * (-c) * u + (1 / det) * a * z;
// format result on two decimal places, and convert it to string
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String x_AsString = decimalFormat.format(x);
        String y_AsString = decimalFormat.format(y);
        return "x = " + x_AsString + ", " + "y = " + y_AsString;
    }
}