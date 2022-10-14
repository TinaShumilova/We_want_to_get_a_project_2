package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.CheckoutPage;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckoutSteps extends GeneralSteps {

    @Then("^I am on Checkout page$")
    public void assertIAmOnCheckoutPage() throws InterruptedException {
        Thread.sleep(5000);
        assertEquals(checkoutPage.getCheckoutPageUrl(),driver.getCurrentUrl());
    }

    @And("^I input e-mail and password:$")
    public void iInputEmailAndPassword(Map<String,String> accountValues){
        checkoutPage.getEmailFieldInCheckoutPage().clear();
        checkoutPage.getEmailFieldInCheckoutPage().sendKeys(accountValues.get("email"));
        checkoutPage.getPasswordFieldInCheckoutPage().clear();
        checkoutPage.getPasswordFieldInCheckoutPage().sendKeys(accountValues.get("password"));
    }
    @And("^I click on Login button$")
    public void iClickOnLoginButton(){
        checkoutPage.clickOnLogginButtonInCheckoutPage();
    }

    @And("^I check Step 2: Billing Details block is available and opened$")
    public void assertBillingDetailesBlockIsEvaible(){
        assertTrue(checkoutPage.getStepTwoBlock().isDisplayed());

    }
}
