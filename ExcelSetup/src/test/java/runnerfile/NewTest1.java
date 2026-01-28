package runnerfile;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features={"src/test/java/runnerfile"},
glue="runnerfile",
tags="@tag1",
plugin= {
	"pretty",
	"html:target/cucumber-reports/cucumber.html",
	"json:target/cucumber-reports/CucumberTestReport.json",
	"junit:target/cucumber-reports/CucumberTestReport.xml"
}
)
public class NewTest1 extends AbstractTestNGCucumberTests{
  

}
