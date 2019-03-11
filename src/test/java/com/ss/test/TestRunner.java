package com.ss.test;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(glue = "classpath:com.ss.test.steps", plugin = {"pretty"}, features = "src/test/resources/features/")
public class TestRunner {}
