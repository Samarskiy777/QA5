import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.Config;

import java.util.concurrent.TimeUnit;

/**
 * Created by eugen on 11/22/2016.
 */
public class BaseTest {
    public final String url = Config.getProperty("baseUrl");
    public final String browser = Config.getProperty("driver");
    public final String timeout = Config.getProperty("timeout");
    WebDriver driver;

    public WebDriver getDriver () {
        if (browser.equals("firefox")) return new FirefoxDriver();
        if (browser.equals("chrome")) return new ChromeDriver();
        return new ChromeDriver();
    }

    @Before
    public void preConfig () {
        System.setProperty("webdriver.gecko.driver", "/Users/Samarik/Documents/geckodriver");
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver.exe");
        driver = getDriver();
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(timeout), TimeUnit.SECONDS);
        driver.get(url);
    }

    @After
    public void tearDown () {
        driver.quit();
    }
}
