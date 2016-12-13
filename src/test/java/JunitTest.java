import org.junit.Test;
import pages.AmazonMain;

/**
 * Created by eugen on 11/22/2016.
 */
public class JunitTest extends BaseTest {
    @Test
    public void test1 () {
        AmazonMain amazonMain = new AmazonMain(driver);
        amazonMain.searchGood("Google Nexus");
    }

    @Test
    public void test2 () {
        AmazonMain amazonMain = new AmazonMain(driver);
        amazonMain.getMenuElement("Sell").click();
    }
}
