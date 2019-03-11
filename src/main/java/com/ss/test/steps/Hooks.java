package com.ss.test.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import com.ss.test.TestContext;

import static com.ss.test.TestContext.getDriver;

public class Hooks {

    @Before
    public void startTestContext() {
        new TestContext();
    }

    @After
    public void closeDriver(){
        getDriver().quit();
    }
}
