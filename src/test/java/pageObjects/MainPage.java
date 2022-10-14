package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage{

    @FindBy(how = How.XPATH, using = "//*[@type=\"button\" and @onclick=\"cart.add('43');\"]")
    private WebElement cartButtonInItemCard;


    public String getHomePageUrl(){return "http://www.demoshop24.com/index.php?route=common/home";}

    public void clickOnCartButtonInItemCard(){
        cartButtonInItemCard.click();
    }


}
