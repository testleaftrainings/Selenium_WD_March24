package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
                  glue="stepdefnition",
                  monochrome = true,publish=true,
                 // tags="@regression"//it will run specific tag only
                  tags="@smoke and @Sanity"// Scenarios having both tags@smoke and @Sanity it will run
                //  tags="@smoke or @Sanity"
                 //tags="not @functional" 
                  
		)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
