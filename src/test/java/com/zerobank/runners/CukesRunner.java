package com.zerobank.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json",//we run and report with maven and the results come to this file(the 2 plugins in pom are related with this way of reporting)
                "html:target/default-html-reports"},//we run and report with CukesRunner and the results come to this file(this is simple reporting, we mostly use the up below one)


        features = "src/test/resources/features",
        glue = "com/zerobank/step_definitions",

        dryRun = false, //dryRun = true won't execute the code inside the definitions, just will check and find the undefined steps!
        // if we put dryRun = false it will be normal execution, so dryRun=true helps us to earn time for finding the undefined steps!

        tags = "@smoke"

        //tags = "@smoke" //all the tags with smoke gonna execute even on a feature or on a scenario,
        //you can manage your smoke or regression suite with this way!
        //tags = "@driver and @login" => it means which has driver AND login run it
        //tags = "@driver or @store_manager" => it means which has driver OR login run it
        //tags = "@login and not @sales_manager and not @store_manager" => it means;
        //- which has login and has not sales_manager and has not @store_manager run it (same with exclude)
        //if we put some tag after not: 'not @...' it will run all tags but not the one you wrote after not!
        //command+shift+F => (this finds the tags and you can delete from whatever you want)

)

public class CukesRunner {

}
