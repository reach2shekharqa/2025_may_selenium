package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// import factory.Browser;

public class LoginPage extends BasePage {
    //private WebDriver driver;

    // Locators
    private By usernameField = By.id("user-name");
    private By passwordField = By.cssSelector("#password");
    private By loginButton = By.id("login-button");

    // Constructor
    public LoginPage(WebDriver driver) {
       super(driver);
    }

    // Actions
    public LoginPage enterUsername(String username) {
       driver.findElement(usernameField).sendKeys(username);
       return this;
    }

    public LoginPage enterPassword(String password) {
       driver.findElement(passwordField).sendKeys(password);
       return this;
    }

    public HomePage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }

    
}
