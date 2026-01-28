package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= {"src/test/java/Feat"},
glue="Steps",
tags="@tag1")

public class NewTest12 extends AbstractTestNGCucumberTests{
  @Test
  public void f() {
  }
}
