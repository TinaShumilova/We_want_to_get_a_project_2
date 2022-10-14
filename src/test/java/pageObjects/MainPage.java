package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class MainPage{

    @FindBy(how = How.XPATH, using = "//*[@type=\"button\" and @onclick=\"cart.add('43');\"]")
    private WebElement cartButtonInItemCard;
    @FindBy(how = How.XPATH, using = "//*[@href = 'http://www.demoshop24.com/index.php?route=checkout/checkout']")
    private WebElement checkoutLink;

///Team2 start

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a")
    public WebElement desktopsMenuBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]//div/a")
    public WebElement seeAllDesktopsLink;

    @FindBy(how = How.XPATH, using = "//*[@class='button-group']/button[2]")
    public WebElement addFirstItemWishlistBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/div[2]/ul/li[7]/a")
    public WebElement camerasMenuBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a")
    public WebElement seeAllLaptopsLink;

    @FindBy(how = How.XPATH, using = "//*[contains(@onclick, 'wishlist.add') and contains(@onclick, '30')]")
    public WebElement addSecondItemWishlistBtn;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Success')]")
    public WebElement successMsg;

    @FindBy(how = How.CSS, using = "#wishlist-total")
    public WebElement wishlistPageLinkBtn;

    @FindBy(how = How.XPATH, using = "//*[contains(@title, 'Shopping Cart')]")
    public WebElement cartPageLinkBtn;

    @FindBy(how = How.XPATH, using = "//*[contains(@data-original-title, \"Remove\")]")
    public WebElement removeFirstItemCartPageBtn;


    @FindBy(how = How.XPATH, using = "//*[contains(@id, 'menu')]//*[contains(text(),'Tablets')]")
    public WebElement tabletsMenuBtn;

    @FindBy(how = How.ID, using = "button-cart")
    public WebElement pDpAddToCartBtn;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Products')]")
    public WebElement outOfStockMsg;

    @FindBy(how = How.XPATH, using = "//*[contains(@class, \"text-danger\")]")
    public WebElement threeStarsMark;

//Team2 end

    public String getHomePageUrl(){return "http://www.demoshop24.com/index.php?route=common/home";}

    public void clickOnCartButtonInItemCard(){
        cartButtonInItemCard.click();
    }
    public void clickOnCheckoutLink(){
        checkoutLink.click();
    }
}
