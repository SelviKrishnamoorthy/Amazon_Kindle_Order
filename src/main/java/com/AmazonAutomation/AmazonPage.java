package com.AmazonAutomation;

import com.Automation.utils.core.ConfigReader;
import com.Automation.utils.core.WebActions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AmazonPage extends WebActions {

    WebDriver driver;
    public AmazonPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public AmazonPage navigateToWebsite(){
        driver.get(ConfigReader.appUrl);
        return this;
    }
    public AmazonPage clickonHamburgerMenu() throws Exception {
    clickOn("AmazonPage.clickAll");
    return this;
    }

    public AmazonPage clickKindle() throws Exception {
        clickOn("AmazonPage.clickKindle");
        clickOn("AmazonPage.clickSubKindle");
        return this;
    }

    public AmazonPage clickOnBuy() throws Exception {
        clickOn("AmazonPage.clickBuy");
        return this;
    }

    public void isEmailorMobileNumberDisplayed() throws Exception {
        String EmailOrMobile=getTextFrom("AmazonPage.checkEmail");
        System.out.println(EmailOrMobile);
        Assert.assertTrue(EmailOrMobile.contains("E-mail address or mobile"),"Testcase Passed");
    }
}
