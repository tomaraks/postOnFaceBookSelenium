package tests;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginPostTest extends BaseTest {
    private static final String USERNAME = "xxx@gmail.in";
    private static final String PASSWORD = "xxxxxxxx";
    private static final String STATUS = "Hello World";

    @Test()
    public void loginAndPostTest() throws InterruptedException {
        loginPage.enterUserName(USERNAME);
        loginPage.enterPassword(PASSWORD);
        HomePage homePage = loginPage.clickLoginButton();
        homePage.waitUntilHomeButtonIsVisible();

        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).perform();
        action.sendKeys(Keys.ESCAPE).perform();

        homePage.enterStatus(STATUS);
        homePage.clickPostButton();
        Thread.sleep(20000);
    }
}
