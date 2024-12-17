package assignments.week6.day1.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/java/features/A1.feature",
glue="stepdefinition",publish=true, monochrome = true)


public class A1 extends AbstractTestNGCucumberTests
{

}
