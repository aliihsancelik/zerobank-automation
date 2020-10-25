package com.zerobank.step_definitions;

import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PayBillsStepDefs {

    @When("the user completes the blanks for the payment operation")
    public void the_user_completes_the_blanks_for_the_payment_operation() {
        new Select(Driver.get().findElement(By.cssSelector("#sp_payee"))).selectByIndex(0);
        new Select(Driver.get().findElement(By.cssSelector("#sp_account"))).selectByIndex(0);
        Driver.get().findElement(By.cssSelector("#sp_amount")).sendKeys("1");
        Driver.get().findElement(By.cssSelector("#sp_date")).click();
        Driver.get().findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
        Driver.get().findElement(By.cssSelector("[name='description']")).sendKeys("loan");
        Driver.get().findElement(By.cssSelector("[type='submit']")).click();

    }

    @Then("the user gets {string}")
    public void the_user_gets(String expectedMessage) {
      String actualMessage = Driver.get().findElement(By.xpath("//span[contains(text(),'The payment was successfully')]")).getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    @When("the user doesn't fill the blanks and click")
    public void the_user_doesn_t_fill_the_blanks_and_click() {
        Driver.get().findElement(By.cssSelector("[type='submit']")).click();
    }

    @Then("the user see required warning pop-up message for filling the missing parts")
    public void the_user_see_required_warning_pop_up_message_for_filling_the_missing_parts() {
        Boolean message = Boolean.parseBoolean(Driver.get().findElement(By.cssSelector("#sp_amount")).getAttribute("required"));
        Assert.assertTrue(message);
    }

    @When("the user types letters or characters in {string} field")
    public void the_user_types_letters_or_characters_in_field(String field) {
        Driver.get().findElement(By.xpath("//input[@name='"+field.toLowerCase()+"']")).sendKeys("@A");
    }

    @Then("{string} field should not accept them")
    public void field_should_not_accept_them(String field) {
       String type =  Driver.get().findElement(By.xpath("//input[@name='"+field.toLowerCase()+"']")).getAttribute("value");
       Assert.assertTrue(type.length()==0);
    }


}
