package runner;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "junit:target/junit/junit-report.xml",
                "json:target/cucumber.json",
        },
        features = "src/test/resources/features",
        glue = "step_definitions",
        dryRun = false,
        tags = ""
)



public class CukesRunner {

}
