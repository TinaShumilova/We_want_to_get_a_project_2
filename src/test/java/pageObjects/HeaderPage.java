package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HeaderPage {

    @FindBy(how = How.XPATH, using = "//*[@href = 'http://www.demoshop24.com/index.php?route=checkout/checkout']")
    private WebElement checkoutLink;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cart-total\"]")
    private WebElement cartPopup;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong/i")
    private WebElement checkoutButtonInPopup;

    @FindBy(how = How.XPATH, using = "//*[@class=\"dropdown-menu pull-right\"]")
    private WebElement cartDropdownMenu;

    public void clickOnCheckoutLink(){
        checkoutLink.click();
    }

    public void clickOnCartPopup(){
        cartPopup.click();
    }

    public void clickOnCheckoutButtonInPopup(){
        checkoutButtonInPopup.click();
    }

    public WebElement getCartDropdownMenu() {
        return cartDropdownMenu;
    }
}
