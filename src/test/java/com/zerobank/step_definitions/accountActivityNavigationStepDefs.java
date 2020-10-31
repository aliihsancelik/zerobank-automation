package com.zerobank.step_definitions;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class accountActivityNavigationStepDefs {

    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String accountType) {
        Driver.get().findElement(By.xpath("//a[contains(text(),'"+accountType+"')]")).click();
        BrowserUtils.waitFor(2);
    }


    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String expectedAccountType) {
        WebElement dropDown = Driver.get().findElement(By.cssSelector("#aa_accountId"));
        String actualAccountType = new Select(dropDown).getFirstSelectedOption().getText();
        Assert.assertEquals(expectedAccountType,actualAccountType);
    }
}
