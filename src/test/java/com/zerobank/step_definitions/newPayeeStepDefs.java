package com.zerobank.step_definitions;

import com.zerobank.pages.PayBillPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class newPayeeStepDefs {

    @Then("the user adds a new payee using following informations")
    public void the_user_adds_a_new_payee_using_following_informations(Map<String,String> payeeData) {
        BrowserUtils.waitFor(1);
        PayBillPage payBillPage = new PayBillPage();
        payBillPage.payeeName.sendKeys(payeeData.get("Payee Name"));
        payBillPage.payeeAddress.sendKeys(payeeData.get("Payee Address"));
        payBillPage.payeeAccount.sendKeys(payeeData.get("Account"));
        payBillPage.payeeDetails.sendKeys(payeeData.get("Payee details"));
        payBillPage.addButton.click();
    }

    @Then("the user should add a new payee successfully")
    public void the_user_should_add_a_new_payee_successfully() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(new PayBillPage().successMessage.isDisplayed());
    }
}
