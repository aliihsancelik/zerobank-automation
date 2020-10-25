package com.zerobank.step_definitions;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSummaryStepDefs {

    @Then("the user should see the title as {string}")
    public void the_user_should_see_the_title_as(String title) {
        Assert.assertEquals(title, Driver.get().getTitle());
    }

    @Then("the user should have the following account types")
    public void the_user_should_have_the_following_account_types(List<String> expectedAccountTypes) {

        List<WebElement> actualAccountTypes = Driver.get().findElements(By.xpath("//h2[@class='board-header']"));
        Assert.assertEquals(expectedAccountTypes,BrowserUtils.getElementsText(actualAccountTypes));

    }

    @Then("the user should see the Credit Account Table's columns")
    public void the_user_should_see_the_Credit_Account_Table_s_columns(List<String> expectedCreditAccountsTable) {
        List<WebElement> actualCreditAccountsTable = Driver.get().findElements(By.xpath("(//div[@class='board-content'])[3]//th"));
        Assert.assertEquals(expectedCreditAccountsTable,BrowserUtils.getElementsText(actualCreditAccountsTable));
    }
}
