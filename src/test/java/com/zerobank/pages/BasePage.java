package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void navigateTo(String tab, String module){
        Driver.get().findElement(By.xpath("//a[contains(text(),'"+tab+"')]")).click();
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.xpath("//a[contains(text(),'"+module+"')]")).click();
    }
    public void navigateTo(String tab){
        Driver.get().findElement(By.xpath("//a[contains(text(),'"+tab+"')]")).click();
        BrowserUtils.waitFor(1);
    }
}
