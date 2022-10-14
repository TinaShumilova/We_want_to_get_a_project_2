package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class MainPageSteps extends GeneralSteps {


    @Given("^I moves to on shop page$")
    public void iAmOnShopPage(){
        driver.get(mainPage.getHomePageUrl());
    }

    @Then("^I check I am on the home page$")
    public void checkPage(){
        assertEquals(mainPage.getHomePageUrl(), driver.getCurrentUrl());
    }




    @When("^I add one item in Shopping Cart$")
    public void iAddOneItemInShoppingCart() throws InterruptedException {
        mainPage.clickOnCartButtonInItemCard();
        Thread.sleep(5000);
    }




}
