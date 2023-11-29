import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features", tags ="@Bike", plugin = { "pretty", "html:target/cucumber-reports/report.html"}, publish = true)
public class RunCuke {


}
