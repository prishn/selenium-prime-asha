package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestMouseHover extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void mouseHoverExample() throws InterruptedException {
        //Computer ----> software and click


        mouseHoverToElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
        Thread.sleep(2000);
        mouseHoverToElementAndClick(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Software']"));
        Thread.sleep(2000);
//        WebElement computer = driver.findElement
//                (By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
//        WebElement software = driver.findElement
//                (By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Software']"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(computer).build().perform();
//        actions.moveToElement(software).click().build().perform();
       // actions.moveToElement(computer).moveToElement(software).click().build().perform();
    }

    @After
    public void tearDown() {
        // closeBrowser();
    }
}
