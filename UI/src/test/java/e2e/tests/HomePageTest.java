package e2e.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest {

    @Test
    public void homepageTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();

        driver.get("https://www.saucedemo.com/");

        // Use LoginPage
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();

        // Use HomePage
        HomePage homePage = new HomePage(driver);

        // Verify inventory buttons count
        int countActual = homePage.getInventoryButtonCount();
        Assert.assertEquals(countActual, 6);

        // Verify sorting functionality
        homePage.selectSortOption("za");
        String actual = homePage.getActiveSortOption();
        String expected = "Name (Z to A)";
        Assert.assertEquals(actual, expected);

        driver.quit();
    }
}
