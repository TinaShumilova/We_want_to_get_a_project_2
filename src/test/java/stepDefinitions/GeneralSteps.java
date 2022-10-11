package stepDefinitions;

import org.openqa.selenium.WebDriver;

public class GeneralSteps {

    protected WebDriver driver;

    public GeneralSteps(){
        this.driver = Hooks.driver;
    }
}
