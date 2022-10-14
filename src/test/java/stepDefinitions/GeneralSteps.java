package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.CheckoutPage;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.WishListPage;

public class GeneralSteps {

    protected WebDriver driver;
    static MainPage mainPage;
    static CheckoutPage checkoutPage;
    static WishListPage wishListPage;
    static LoginPage loginPage;


    public GeneralSteps(){
        this.driver = Hooks.driver;
        mainPage = PageFactory.initElements(Hooks.driver, MainPage.class);
        checkoutPage = PageFactory.initElements(Hooks.driver, CheckoutPage.class);
        wishListPage = PageFactory.initElements(Hooks.driver, WishListPage.class);
        loginPage = PageFactory.initElements(Hooks.driver, LoginPage.class);

    }
}
