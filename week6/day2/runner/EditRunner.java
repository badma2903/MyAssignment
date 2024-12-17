package assignments.week6.day2.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/features/Edit.feature",
glue={"stepdefinition","hooks"},publish=true, monochrome = true)

public class EditRunner extends AbstractTestNGCucumberTests
{

}
