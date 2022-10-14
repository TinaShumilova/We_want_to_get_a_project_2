package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.Hooks;

public class CheckoutPage {
    @FindBy(id = "input-email")
    private WebElement emailFieldInCheckoutPage;

    @FindBy(id = "input-password")
    private WebElement passwordFieldInCheckoutPage;

    @FindBy(id = "button-login")
    private WebElement loginButtonInCheckoutPage;

    @FindBy(xpath = "//*[@href='#collapse-payment-address']")
    private WebElement stepTwoBlock;


    public String getCheckoutPageUrl(){return "http://www.demoshop24.com/index.php?route=checkout/checkout";}

    public WebElement getEmailFieldInCheckoutPage(){
        return this.emailFieldInCheckoutPage;
    }

    public WebElement getPasswordFieldInCheckoutPage(){
        return this.passwordFieldInCheckoutPage;
    }

    public void clickOnLogginButtonInCheckoutPage(){
        loginButtonInCheckoutPage.click();
    }

    public WebElement getStepTwoBlock(){
        return this.stepTwoBlock;
    }
}
