package com.zerobank.step_definitions;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityStepDefs {

    @When("the user clicks to {string} tab")
    public void the_user_clicks_to_tab(String tab) {
        Driver.get().findElement(By.xpath("//*[text()='"+tab+"']")).click();
    }

    @Then("the Account dropdown default option should be Savings")
    public void the_Account_dropdown_default_option_should_be_Savings() {

     Select select = new Select(Driver.get().findElement(By.cssSelector("#aa_accountId")));
     Assert.assertEquals("Savings",select.getFirstSelectedOption().getText());
    }

    @Then("the Account dropdown should have the following options")
    public void the_Account_dropdown_should_have_the_following_options(List<String> expectedDropdown) {
        Select select = new Select(Driver.get().findElement(By.cssSelector("#aa_accountId")));
        List<WebElement> actualDropdown = select.getOptions();
        Assert.assertEquals(expectedDropdown, BrowserUtils.getElementsText(actualDropdown));
    }

    @Then("Transactions table should have the following column names")
    public void transactions_table_should_have_the_following_column_names(List<String> expectedTable) {
        List<WebElement> actualTable = Driver.get().findElements(By.xpath("//div[@id='all_transactions_for_account']//th"));
        Assert.assertEquals(expectedTable,BrowserUtils.getElementsText(actualTable));
    }
}
