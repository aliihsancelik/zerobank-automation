package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountActivityPage extends BasePage{

    @FindBy(css = "#aa_fromDate")
    public WebElement fromDateInputBox;

    @FindBy(css = "#aa_toDate")
    public WebElement toDateInputBox;

    @FindBy(xpath = "//button[contains(text(),'Find')]")
    public WebElement findButton;
}
