package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    private WebDriver driver;

    // Locators
    private By inventoryButtons = By.cssSelector(".btn.btn_primary.btn_small.btn_inventory");
    private By productSortDropdown = By.xpath("//select[@class='product_sort_container']");
    private By activeOption = By.xpath("//span[@class='active_option']");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public int getInventoryButtonCount() {
        return driver.findElements(inventoryButtons).size();
    }

    public void selectSortOption(String value) {
        WebElement dropdown = driver.findElement(productSortDropdown);
        Select select = new Select(dropdown);
        select.selectByValue(value);
    }

    public String getActiveSortOption() {
        return driver.findElement(activeOption).getText().trim();
    }
}
