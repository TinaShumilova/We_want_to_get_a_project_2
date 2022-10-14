package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;


import static org.junit.Assert.assertTrue;

public class HeaderSteps extends GeneralSteps{

    @Then("^I click on Checkout in top menu$")
    public void iClickToTheCheckoutLink() throws InterruptedException {
        Thread.sleep(5000);
        headerPage.clickOnCheckoutLink();

    }
    @Then("^I click on Shopping Cart in top menu$")
    public void shoppingCartInTopMenu() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/i")).click();
        Thread.sleep(5000);
    }

    @Then("^I click on Shopping Cart popup$")
    public void clickPopup() throws InterruptedException {
        headerPage.clickOnCartPopup();
        Thread.sleep(5000);
    }

    @And("^I see the the Shopping Cart dropdown menu displayed$")
    public void popupDisplayed() {
        assertTrue(headerPage.getCartDropdownMenu().isDisplayed());

    }

    @Then("^I click on Checkout$")
    public void smallCheckoutButton() throws InterruptedException {
        Thread.sleep(5000);
        headerPage.clickOnCheckoutButtonInPopup();

    }


}
