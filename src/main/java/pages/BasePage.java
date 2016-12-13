package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by eugen on 11/22/2016.
 */
public class BasePage {
    private WebDriver driver;

    public BasePage (WebDriver driver) {
//        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getMenuElement (String text) {
        String xpath = "//div[@id='nav-xshop']/a[contains(@class, 'nav-a') and text()='" + text + "']";
        return driver.findElement(By.xpath(xpath));
    }
}
