package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.CheckoutPage;
import pageObjects.HeaderPage;
import pageObjects.MainPage;

public class GeneralSteps {

    protected WebDriver driver;
    static MainPage mainPage;
    static CheckoutPage checkoutPage;

    static HeaderPage headerPage;

    public GeneralSteps(){
        this.driver = Hooks.driver;
        mainPage = PageFactory.initElements(Hooks.driver, MainPage.class);
        checkoutPage = PageFactory.initElements(Hooks.driver, CheckoutPage.class);
        headerPage = PageFactory.initElements(Hooks.driver, HeaderPage.class);
    }
}
