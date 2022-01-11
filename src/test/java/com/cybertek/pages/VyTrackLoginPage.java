package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VyTrackLoginPage extends BasePage{
    @FindBy(id = "prependedInput")
    public WebElement _username;

    @FindBy(id = "prependedInput2")
    public WebElement _password;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    public void login(String username, String password){
        _username.sendKeys(username);
        _password.sendKeys(password);
        loginBtn.click();
    }
}
