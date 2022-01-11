package com.cybertek.pages;

import com.cybertek.utulities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VyTrackDashboardPage extends BasePage{
    @FindBy(xpath = "//li[@id='user-menu']/a")
    public WebElement fullName;

    @FindBy (xpath = "//a[.='Logout']")
    public WebElement logout;

    public void logout(){
        fullName.click();
        BrowserUtils.sleep(2);
        logout.click();
    }
}
