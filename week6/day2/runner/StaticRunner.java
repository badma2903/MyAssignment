package assignments.week6.day2.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/features/Static.feature",
glue="stepdefinition",publish=true, monochrome = true)


public class StaticRunner extends AbstractTestNGCucumberTests
{

}
