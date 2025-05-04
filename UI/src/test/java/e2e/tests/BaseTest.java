package e2e.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import factory.Drivermanager;
import factory.PageManager;

public  class BaseTest {

    protected PageManager pageManager;

    @BeforeMethod

    public void start() {

        Drivermanager.initDriver("chrome");

        pageManager = new PageManager(Drivermanager.getDriver());

        
    }

    @AfterMethod

    public void end() {

        Drivermanager.quitDriver();
    }

}
