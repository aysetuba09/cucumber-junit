package com.cybertek.step_definitions;

import com.cybertek.pages.CloudTablesHomePage;
import com.cybertek.utulities.ConfigurationReader;
import com.cybertek.utulities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CloudTablesStepDefs {
    CloudTablesHomePage cloudTablesHomePage = new CloudTablesHomePage();
    @Given("User is on cloudtables homepage")
    public void user_is_on_cloudtables_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cloudtables.url"));
        Assert.assertEquals("title is not matched", "Editor | Editing for DataTables", Driver.getDriver().getTitle());
    }
    @When("User clicks on New button")
    public void user_clicks_on_new_button() {
cloudTablesHomePage.newButton.click();
    }
    @When("User enters {string} to firstname field")
    public void user_enters_to_firstname_field(String firstname) {
        cloudTablesHomePage.firstName.sendKeys(firstname);
    }
    @When("User enters {string} to lastname field")
    public void user_enters_to_lastname_field(String lastname) {
cloudTablesHomePage.lastName.sendKeys(lastname);
    }
    @When("User enters {string} to position field")
    public void user_enters_to_position_field(String position) {
        cloudTablesHomePage.position.sendKeys(position);
    }
    @When("User enters {string} to salary field")
    public void user_enters_to_salary_field(String salary) {
        cloudTablesHomePage.salary.sendKeys(salary);
    }
    @When("User clicks on create button")
    public void user_clicks_on_create_button() {
cloudTablesHomePage.createButton.click();
    }
}
