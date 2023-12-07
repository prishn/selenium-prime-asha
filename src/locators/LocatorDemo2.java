package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo2 extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo2() {
        // Class name Locator ---> To find multiple elements
        List<WebElement> sliderElementList = driver.findElements(By.className("nivo-imageLink"));
        System.out.println("Total slides are : " + sliderElementList.size());

        //Tag name locator  ---> To find multiple elements
        List<WebElement> linksElements = driver.findElements(By.tagName("a"));
        System.out.println("Number of links = " + linksElements.size());

        for ( WebElement link : linksElements ) {
            System.out.println(link.getAttribute("href"));
            System.out.println(link.getText());
        }

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
