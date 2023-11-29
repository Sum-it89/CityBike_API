import API.Find_CityBike;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDef
{


    Find_CityBike findCityBike = new Find_CityBike();

    @Given("I should able to send API request")
    public void i_should_able_to_send_api_request() {
    findCityBike.find_LatAndLon();
    }

    @When("I receive the success response")
    public void i_receive_the_success_response() {
    }

    @Then("I should be able to verify the Longitude and latitude")
    public void i_should_be_able_to_verify_the_longitude_and_latitude() {
       findCityBike.verify_latitude_longitude();
    }

    @Then("I should be able to verify Frankfurt is in Germany")
    public void i_should_be_able_to_verify_frankfurt_is_in_germany() {
    findCityBike.verify_City();
    findCityBike.verify_Country();
    }


}
