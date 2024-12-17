package assignments.week6.day2.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Delete.feature",
glue={"stepdefinition","hooks"},publish=true, monochrome = true)

public class DeleteRunner extends AbstractTestNGCucumberTests
{

}
