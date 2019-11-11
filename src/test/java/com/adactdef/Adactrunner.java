package com.adactdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\adactinfeat\\adactin.feature"},glue = {"com.adactdef"})

public class Adactrunner {

}
