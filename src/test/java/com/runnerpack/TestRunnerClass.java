package com.runnerpack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\feature\\Login.feature"},glue = {"com.runnerpackage"})
public class TestRunnerClass {
}
