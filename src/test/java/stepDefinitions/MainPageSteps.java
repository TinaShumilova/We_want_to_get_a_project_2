package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.MainPage;
import static org.junit.Assert.assertEquals;

public class MainPageSteps extends GeneralSteps {

    public MainPage mainPage = new MainPage();

    @Given("^I am on shop main page$")
    public void iAmOnShopMainPage(){
        driver.get(mainPage.getPageUrl());
    }

    @Then("^I check the page$")
    public void checkPage(){
        assertEquals(mainPage.getPageUrl(), driver.getCurrentUrl());
    }


}
