package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class MainPageSteps extends GeneralSteps {



    @Given("^I am on shop main page$")
    public void iAmOnShopMainPage(){
        driver.get(mainPage.getHomePageUrl());
    }

    @Then("^I check the page$")
    public void checkPage(){
        assertEquals(mainPage.getHomePageUrl(), driver.getCurrentUrl());
    }


    @Given("^I am on shop page$")
    public void iAmOnShopPage(){
        driver.get(mainPage.getHomePageUrl());
    }

    @When("^I add one item in Shopping Cart$")
    public void iAddOneItemInShoppingCart() throws InterruptedException {
        mainPage.clickOnCartButtonInItemCard();
        Thread.sleep(5000);
    }

    @Then("^I click to the Checkout link$")
    public void iClickToTheCheckoutLink() throws InterruptedException {
        mainPage.clickOnCheckoutLink();
        Thread.sleep(5000);
    }

}
