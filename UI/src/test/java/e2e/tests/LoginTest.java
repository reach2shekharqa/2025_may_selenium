package e2e.tests;

import org.testng.annotations.Test;

public final class LoginTest extends BaseTest {

    private LoginTest() {

    }

    @Test
    public void loginTest() {

        pageManager.getLoginPage()
                .enterUsername("standard_user")
                .enterPassword("secret_sauce")
                .clickLoginButton();

    }

}
