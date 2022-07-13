package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne {
    @Test
    public void testSampleOne(){

        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        int status = response.getStatusCode();
        response.getTime();

        System.out.println("The API status is: " +status);
        System.out.println(response.getBody().asString());
        System.out.println(response.getHeader("content-type"));


        Assert.assertEquals(status,200);

    }
}
