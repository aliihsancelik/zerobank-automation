package com.zerobank.step_definitions;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class HOOKS {

    static final Logger logger = LogManager.getLogger(HOOKS.class);

    @Before(order = 0) //for all scenarios executes before, order=0 means before everything for @before
    public void setUp(Scenario scenario){

        logger.info("####### SCENARIO: " + scenario.getName() + " ####### ");
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After(order = 0) //for all scenarios executes before, order=0 means after everything for @after OPPOSITE of before!!
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        logger.info("======= " + scenario.getStatus() + " === " + scenario.getName() + " =======");

        Driver.closeDriver();
    }



    @Before(value = "@database", order = 1) //custom before: the scenario you put @database before, it runs before
    public void setUpDatabase(){

        System.out.println("\tconnecting to database");
    }
    @After(value = "@database", order = 1 ) //custom after: the scenario you put @database before, it runs after
    public void tearDownDatabase(){

        System.out.println("\tdisconnecting to database");
    }
}
