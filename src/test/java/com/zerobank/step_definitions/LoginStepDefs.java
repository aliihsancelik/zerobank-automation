package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefs {


    @When("the user logs in")
    public void the_user_logs_in() {
        new LoginPage().login(ConfigurationReader.get("username"),ConfigurationReader.get("password"));
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        Assert.assertTrue(Driver.get().getTitle().contains("Summary"));
    }

    @When("the user logs in with {string} and {string}")
    public void the_user_logs_in_with_and(String username, String password) {
        new LoginPage().login(username,password);
    }

    @Then("the user should see the error message")
    public void the_user_should_see_the_error_message() {
        Assert.assertTrue(Driver.get().findElement(By.cssSelector(".alert.alert-error")).isDisplayed());
    }



}
