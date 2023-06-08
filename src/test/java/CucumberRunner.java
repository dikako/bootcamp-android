import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:build/cucumber.json",
                "html:build/report.html",
                "pretty"
        },
        features = "src/test/resources/features")
public class CucumberRunner {
}