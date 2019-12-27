package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By username = By.id("email");
    private By password = By.name("pass");
    private By loginButton = By.id("loginbutton");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String userName) {
        driver.findElement(username).sendKeys(userName);
    }

    public void enterPassword(String passWord) {
        driver.findElement(password).sendKeys(passWord);
    }

    public HomePage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }
}
