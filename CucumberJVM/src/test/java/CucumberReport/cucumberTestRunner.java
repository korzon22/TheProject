//We've got here the Test Runner - with Cucumber annotations,
//definition of report, format and placement. .feature file is
//defined as well.

package CucumberReport;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber"},

        features = {"src/test/java/CucumberReport/cucumberReport.feature"}
)

//Specifying pretty as a format option ensure that HTML report will be generated.
//When we specify html:target/Destination - It will generate the HTML report
//inside the Destination folder, in the target folder of the maven project.

public class cucumberTestRunner { }