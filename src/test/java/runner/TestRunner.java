package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Дмитрий on 03.08.2017.
 */

//tags = "@smoke"

@CucumberOptions(
        plugin={"pretty", "html:target/cucumber-html-report",
                "json:target/cucumber-report.json"},
        features ="src/test/java/features/",
        glue ="steps", tags = "@smoke")

public class TestRunner extends AbstractTestNGCucumberTests{}