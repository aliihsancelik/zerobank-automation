package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillPage extends BasePage {

    @FindBy (xpath="//input[@id='np_new_payee_name']")
    public WebElement payeeName;

    @FindBy (css="#np_new_payee_address")
    public WebElement payeeAddress;

    @FindBy (xpath="//input[@id='np_new_payee_account']")
    public WebElement payeeAccount;

    @FindBy (xpath = "//input[@id='np_new_payee_details']")
    public WebElement payeeDetails;

    @FindBy(xpath = "//input[@value='Add']")
    public WebElement addButton;

    @FindBy(xpath = "//div[contains(text(),'was successfully created')]")
    public WebElement successMessage;



}
