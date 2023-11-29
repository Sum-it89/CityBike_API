package API;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashSet;

import java.util.Set;

import static io.restassured.RestAssured.given;


public class Find_CityBike
{
    double lat =  50.1072;
    double lon =  8.66375;


    @BeforeClass
    public static void initialise (){
        RestAssured.baseURI = "http://api.citybik.es";
    }


        @Test
        public void find_LatAndLon () {

            Response response = given()
                    .basePath("v2/networks")
                    .param("lat", lat)
                    .param("lon", lon)
                    .param("appid", "8f43c06af0170c40282e9ffea1ff87eadc6629bc")
                    .and()
                    .when()
                    .get();

            response.prettyPrint();
        }


        @Test
        public void verify_latitude_longitude(){

           Response response = given().basePath("v2/networks").and().when().get();
           String latitude= response.jsonPath().getString("networks[280].location.latitude");
           String longitude = response.jsonPath().getString("networks[280].location.longitude");
            Set<String> country = new HashSet<>();
            country.add(latitude);
            country.add(longitude);
            System.out.println(country);

            Assert.assertEquals(response.jsonPath().getDouble("networks[280].location.latitude"), 50.1072);
        }

        @Test
        public void verify_City(){

            Response response = given().basePath("v2/networks").and().when().get();
            String location = response.jsonPath().getString("networks[280].location.city");
            Set<String> bike_city = new HashSet<>();
            bike_city.add(location);
            System.out.println(bike_city);
           Assert.assertTrue(bike_city.contains("Frankfurt"));
        }

        @Test
        public void verify_Country(){
        Response response = given().basePath("v2/networks").and().when().get();
        String location = response.jsonPath().getString("networks[280].location.country");
        Set<String> bike_location = new HashSet<>();
        bike_location.add(location);
        System.out.println(bike_location);
        Assert.assertEquals(bike_location, "GR");
    }
















}


