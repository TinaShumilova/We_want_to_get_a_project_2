package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class WishListSteps extends GeneralSteps{

    @Given("^I am logged it to registered account$")
    public void iAmLoggedIntoRegisteredAccount() {
        driver.get(loginPage.getLoginPageUrl());
        loginPage.enterExistingUserLogin();
        loginPage.submitLoginBtn.click();
    }

    @And("^I navigate to homepage$")
    public void iNavigateToHomePage() {
        mainPage.getHomePageUrl();

    }


    @And("^I click See all Desktops$")
    public void iClickSeeAllDesktops() {
        mainPage.desktopsMenuBtn.click();
        mainPage.seeAllDesktopsLink.click();
    }

    @When("^I add Apple Cinema product to wishlist$")
    public void iAddAppleCinemaItemToWishlist() {
        mainPage.addFirstItemWishlistBtn.click();
    }

    @And("^I see success message for Apple Cinema$")
    public void iSeeSuccessMsgAppleCinema() {
        assertTrue(mainPage.successMsg.isDisplayed());
        assertEquals("Success: You have added Apple Cinema 30\" to your wish list!\n×", mainPage.successMsg.getText());
    }

    @And("^I open wishlist page$")
    public void iOpenWishlistPage() {
        mainPage.wishlistPageLinkBtn.click();
        //assertEquals("http://www.demoshop24.com/index.php?route=account/wishlist", driver.getCurrentUrl());

    }

    @And("^I see that url contains next path: \"([^\"]*)\"$")
    public void testSTep(String pathExpected) {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains(pathExpected));
    }

    @Then("^I see previously selected Apple Cinema product in wishlist$")
    public void iSeeAppleCinemaProductInWishlist() {
        assertTrue(wishListPage.appleCinemaItem.isDisplayed());
        wishListPage.removeFirstItemFromWishListBtn.click();
    }


    @Then("^I click remove Apple Cinema from wishlist$")
    public void iClickRemoveAppleCinemaWishlist() {
        wishListPage.removeFirstItemFromWishListBtn.click();
    }

    @And("^Apple Cinema is removed from wishlist$")
    public void iRemoveAppleCinemaFromWishlist() {
        assertFalse(wishListPage.checkAppleCinemaItemIsRemoved());
    }

    @And("^I see remove success message$")
    public void iSeeRemoveSuccessMsg() {
        assertTrue(mainPage.successMsg.isDisplayed());
        assertEquals("Success: You have modified your wish list!\n" +
                "×", mainPage.successMsg.getText());
    }

    @And("^I click move to cart button$")
    public void iClickMoveToCartFromWishlist() throws InterruptedException {
        wishListPage.moveToCartFirstItemFromWishListBtn.click();
        Thread.sleep(1000);
        wishListPage.removeFirstItemFromWishListBtn.click();
    }

    @And("^I navigate to shopping cart$")
    public void iNavigateToCartPage() {
        mainPage.cartPageLinkBtn.click();
    }


    @And("^I click Cameras menu$")
    public void iClickCamerasMenu() {
        mainPage.camerasMenuBtn.click();
    }

    @When("^I add Canon EOS product to wishlist$")
    public void iAddCanonItemToWishlist() {
        mainPage.addSecondItemWishlistBtn.click();
    }

    @Then("^I see previously selected Canon EOS in wishlist$")
    public void iSeeCanonInWishlist() throws InterruptedException {
        assertTrue(wishListPage.canonItem.isDisplayed());
        Thread.sleep(1000);
        wishListPage.removeFirstItemFromWishListBtn.click();

    }

    @Then("^I see previously selected Canon EOS in cart$")
    public void iSeeMacBookInCart() {
        assertTrue(wishListPage.canonItem.isDisplayed());

    }

    @And("^I see success message for Canon EOS$")
    public void iSeeSuccessMsgCanonEOS() {
        assertTrue(mainPage.successMsg.isDisplayed());
        assertEquals("Success: You have added Canon EOS 5D to your wish list!\n×", mainPage.successMsg.getText());
    }

    @And("^I click Tablets menu$")
    public void iClickTabletsMenu() {
        mainPage.tabletsMenuBtn.click();
    }

    @And("^I click add item to cart on PDP page$")
    public void iClickAddToCartPDPpage() {
        mainPage.pDpAddToCartBtn.click();
    }

    @When("^I add Samsung Galaxy Tab product to wishlist$")
    public void iAddSamsungTabToWishlist() {
        mainPage.addFirstItemWishlistBtn.click();
    }

    @And("^I see success message for Samsung Galaxy Tab$")
    public void iSeeSuccessMsgSamsungTab() throws InterruptedException {
        assertTrue(mainPage.successMsg.isDisplayed());
        Thread.sleep(2000);
        assertEquals("Success: You have added Samsung Galaxy Tab 10.1 to your wish list!\n×", mainPage.successMsg.getText());
    }

    @Then("^I see previously Galaxy Tab in wishlist$")
    public void iSeeGalaxyTabInWishlist() {
        assertTrue(wishListPage.samsungTabletItem.isDisplayed());
    }

    @Then("^I see out of stock message$")
    public void iSeeOutOfStockMsg() throws InterruptedException {

        Thread.sleep(2000);
        assertTrue(mainPage.outOfStockMsg.isDisplayed());
        assertEquals("rgba(169, 68, 66, 1)", mainPage.outOfStockMsg.getCssValue("color"));
        assertEquals("Products marked with *** are not available in the desired quantity or not in stock!\n" +
                "×", mainPage.outOfStockMsg.getText());
    }

    @And("^I see product is marked with 3 red stars$")
    public void iSeeThreeStarsMarkForOutOfStock() {
        assertTrue(mainPage.threeStarsMark.isEnabled());
        assertEquals("***", mainPage.threeStarsMark.getText());
        assertEquals("rgba(169, 68, 66, 1)", mainPage.threeStarsMark.getCssValue("color"));
        mainPage.removeFirstItemCartPageBtn.click();

    }

    /// new added wish list steps

    @Then("^I assert Wish List count is \"([^\"]*)\"$")
    public void iAssertWishListCountIs(String wishListCount){
        mainPage.checkWishListCount(wishListCount);
    }

    @Then("^I clean my Wish List$")
    public void iCleanMyWishlist() {
        mainPage.wishlistPageLinkBtn.click();
        wishListPage.removeFirstItemFromWishListBtn.click();
    }

    @Then("^I navigate to SamsungTab PDP$")
    public void iNavigateToSamsungTabPdp(){
        mainPage.clickSamsungTabProduct.click();
    }




}
