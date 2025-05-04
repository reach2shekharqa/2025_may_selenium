package factory;

import org.openqa.selenium.WebDriver;

import pages.LoginPage;

public class PageManager {

    

    private WebDriver ldriver;

    private LoginPage loginPage;
    // private DashboardPage dashboardPage;

    public PageManager(WebDriver driver) {
        this.ldriver = driver;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(ldriver);
        }
        return loginPage;
    }

}
