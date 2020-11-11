package com.zerobank.step_definitions;

import com.zerobank.pages.PayBillPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class PurchaseForeignCurrencyStepDefs {


    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> expectedCurrencies) {

        List<WebElement> actualCurrenciesWE = new Select(new PayBillPage().currencySelectDropDwn).getOptions();
        List<String> actualCurrencies = BrowserUtils.getElementsText(actualCurrenciesWE);

        for (String expectedCurrency : expectedCurrencies) {
            Assert.assertTrue(actualCurrencies.contains(expectedCurrency));
        }
    }

    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {
        PayBillPage payBillPage = new PayBillPage();
        payBillPage.inputAmount.clear();
        payBillPage.inputAmount.sendKeys("121");
        payBillPage.calculatecostBtn.click();

    }


    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
        BrowserUtils.waitFor(1);
        Alert alert = Driver.get().switchTo().alert();
        Assert.assertTrue(alert.getText().contains("ensure that you have filled all the required fields"));

    }


    @When("user tries to calculate cost without entering a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {
        Select select = new Select(new PayBillPage().currencySelectDropDwn);
        List<WebElement> dropdown = select.getOptions();


            for (int i = 1; i < dropdown.size(); i++) {
                BrowserUtils.waitFor(1);
                select.selectByIndex(i);
                new PayBillPage().calculatecostBtn.click();
                BrowserUtils.waitFor(1);
                Alert alert = Driver.get().switchTo().alert();
                Assert.assertTrue(alert.getText().contains("ensure that you have filled all the required fields"));
                alert.accept();
                Driver.get().switchTo().defaultContent();
                BrowserUtils.waitFor(1);
            }
    }


    @When("user put an amount and select a currency then success message should display")
    public void user_put_an_amount_and_select_a_currency_then_success_message_should_display() {

        Select select = new Select(new PayBillPage().currencySelectDropDwn);
        List<WebElement> dropdown = select.getOptions();
        PayBillPage payBillPage = new PayBillPage();

        for (int i = 1; i < dropdown.size(); i++) {

            BrowserUtils.waitFor(1);
            payBillPage.inputAmount.clear();
            payBillPage.inputAmount.sendKeys("121");
            select.selectByIndex(i);
            payBillPage.SelectedCurrency.click();
            payBillPage.purchaseButton.click();
            BrowserUtils.waitFor(1);
            Assert.assertTrue(payBillPage.purchaseSuccessMessage.isDisplayed());
            BrowserUtils.waitFor(1);
            payBillPage.navigateToModule("Purchase Foreign Currency");
            BrowserUtils.waitFor(1);
        }

    }


    @When("user put an amount and select a currency then conversion amount should display")
    public void user_put_an_amount_and_select_a_currency_then_conversion_amount_should_display() {

        Select select = new Select(new PayBillPage().currencySelectDropDwn);
        List<WebElement> dropdown = select.getOptions();
        List<String> stringDropdown = BrowserUtils.getElementsText(dropdown);
        PayBillPage payBillPage = new PayBillPage();


        for (int i = 1; i < dropdown.size(); i++) {

            BrowserUtils.waitFor(1);
            payBillPage.inputAmount.clear();
            payBillPage.inputAmount.sendKeys("121");
            select.selectByIndex(i);
            payBillPage.SelectedCurrency.click();
            payBillPage.calculatecostBtn.click();
            BrowserUtils.waitFor(1);
            String s = stringDropdown.get(i).substring(stringDropdown.get(i).indexOf('(')+1 , stringDropdown.get(i).indexOf(')'));
            System.out.println(s);
            Assert.assertTrue(payBillPage.conversionAmount.getText().contains(s));
            BrowserUtils.waitFor(1);
        }
    }



}
