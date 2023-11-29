import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class Hooks
{
    @BeforeClass
    public static void initialise (){
        RestAssured.baseURI = "http://api.citybik.es";
    }
}
