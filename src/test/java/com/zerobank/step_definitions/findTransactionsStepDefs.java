package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.BasePage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class findTransactionsStepDefs {

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String fromDate, String toDate) {
         AccountActivityPage accountActivityPage = new AccountActivityPage();
         accountActivityPage.fromDateInputBox.clear();
          accountActivityPage.fromDateInputBox.sendKeys(fromDate);
          accountActivityPage.toDateInputBox.clear();
          accountActivityPage.toDateInputBox.sendKeys(toDate);
          accountActivityPage.findButton.click();

    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String resultMin, String resultMax) {
        List<WebElement> dates = Driver.get().findElements(By.xpath("//div[@id='filtered_transactions_for_account']//table//tbody//tr//td[1]"));
        List<String> datesTexts = BrowserUtils.getElementsText(dates);
        for (String datesText : datesTexts) {
            String s = datesText.replace("-","");
            System.out.println(s);
        }

    }

    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String string) {

    }

    @Given("the user navigates to {string} tab and {string} module")
    public void the_user_navigates_to_tab_and_module(String tab, String module) {
       new BasePage().navigateTo(tab,module);
    }


    @When("clicks find")
    public void clicks_find() {

    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {

    }


    @When("the user enters {string}")
    public void the_user_enters(String description) {
      AccountActivityPage accountActivityPage = new AccountActivityPage();
      accountActivityPage.descriptionInput.clear();
      accountActivityPage.descriptionInput.sendKeys(description);
    }

    @When("clicks search")
    public void clicks_search() {
        new AccountActivityPage().findButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String decs) {
        String expectedDescription = decs.toUpperCase();
        List<WebElement> elements = Driver.get().findElements(By.xpath("//div[@id='filtered_transactions_for_account']//table//tbody//tr//td[2]"));
        List<String> descriptions = BrowserUtils.getElementsText(elements);

        boolean flag = false;

        for (String actualDescription : descriptions) {

            if(actualDescription.contains(expectedDescription)) {
                System.out.println(actualDescription+" , "+ expectedDescription);
                flag = true;
            }
        }
        Assert.assertTrue(flag);
    }


    @Then("results table should show at least one result under {string}")
    public void results_table_should_show_at_least_one_result_under(String column) {

        if (column.equalsIgnoreCase("Deposit")) {
            List<WebElement> elements = Driver.get().findElements(By.xpath("//div[@id='filtered_transactions_for_account']//table//tbody//tr//td[3]"));
            List<String> results = BrowserUtils.getElementsText(elements);

            int count = 0;

            for (String result : results) {
             if(!result.equals("")){
                 count++;
             }
            }
            System.out.println(count);
            if(count>0){
                Assert.assertTrue(true);
            }else{
                Assert.assertTrue(false);
            }

        } else if (column.equalsIgnoreCase("Withdrawal")) {
            List<WebElement> elements = Driver.get().findElements(By.xpath("//div[@id='filtered_transactions_for_account']//table//tbody//tr//td[4]"));
            List<String> results = BrowserUtils.getElementsText(elements);

            int count = 0;

            for (String result : results) {
                if(!result.equals("")){
                    count++;
                }
              }
            System.out.println(count);
            if(count>0){
                Assert.assertTrue(true);
            }else{
                Assert.assertTrue(false);
            }
          }

        }


        @When("user selects type {string}")
        public void user_selects_type (String column){
         new Select(new AccountActivityPage().typeDropDown).selectByVisibleText(column);
            BrowserUtils.waitFor(2);
        }

        @Then("results table should show no result under {string}")
        public void results_table_should_show_no_result_under (String column){

            if (column.equalsIgnoreCase("Deposit")) {
                List<WebElement> elements = Driver.get().findElements(By.xpath("//div[@id='filtered_transactions_for_account']//table//tbody//tr//td[3]"));
                List<String> results = BrowserUtils.getElementsText(elements);

                int count = 0;

                for (String result : results) {
                    if(!result.equals("")){
                        count++;
                    }
                }
                System.out.println(count);
                if(count==0){
                    Assert.assertTrue(true);
                }else{
                    Assert.assertTrue(false);
                }

            } else if (column.equalsIgnoreCase("Withdrawal")) {
                List<WebElement> elements = Driver.get().findElements(By.xpath("//div[@id='filtered_transactions_for_account']//table//tbody//tr//td[4]"));
                List<String> results = BrowserUtils.getElementsText(elements);

                int count = 0;

                for (String result : results) {
                    if(!result.equals("")){
                        count++;
                    }
                }
                System.out.println(count);
                if(count==0){
                    Assert.assertTrue(true);
                }else{
                    Assert.assertTrue(false);
                }
            }
        }

}
