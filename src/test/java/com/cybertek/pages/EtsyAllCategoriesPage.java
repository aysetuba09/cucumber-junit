package com.cybertek.pages;

import com.cybertek.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyAllCategoriesPage {
    public EtsyAllCategoriesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(tagName = "h1")
    public WebElement allCategoriesHeader;
}
