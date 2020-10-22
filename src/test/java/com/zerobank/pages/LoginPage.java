package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "[id='signin_button']")
    public WebElement signIn;

    @FindBy(css = "[name='user_login']")
    public WebElement username;

    @FindBy(css = "[name='user_password']")
    public WebElement password;

    @FindBy(css = "[name='submit']")
    public WebElement submit;


    public void login(String usernameSTR,String passwordSTR){

        signIn.click();
        username.sendKeys(usernameSTR);
        password.sendKeys(passwordSTR);
        submit.click();


    }


}
