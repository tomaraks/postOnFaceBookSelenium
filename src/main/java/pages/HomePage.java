package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private By homeButton = By.id("u_0_c");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitUntilHomeButtonIsVisible() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(homeButton)));
    }

    public void enterStatus(String status) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.findElement(By.xpath("//textarea[contains(@title,'Write something here...')]")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@contenteditable='true']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@contenteditable='true']")));
        driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys(status);
    }

    public void clickPostButton() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Post']"))).click();
    }
}
