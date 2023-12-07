package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo4 extends BaseTest {

   String baseUrl = "https://demo.nopcommerce.com/";
   // String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";


    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest4() {
        //CSS selector

        //ID
        // driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Mobile");

        //Tag and ID
       //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mobile");

        //class
        //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Mobile");

        //Tag and Class
        //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mobile");


        //attributes
        //driver.findElement(By.cssSelector("[type=text]")).sendKeys("Mobile");

        //tag nad attributes
        // driver.findElement(By.cssSelector("input[type=text]")).sendKeys("Mobile");

        //tag, class and attributes
        //driver.findElement(By.cssSelector("input.search-box-text[autocomplete=off]")).sendKeys("Mobile");
        //driver.findElement(By.cssSelector("input.search-box-text[id = small-searchterms]")).sendKeys("Mobile");

        //driver.findElement(By.cssSelector("#Email"));
        //driver.findElement(By.cssSelector(".email")).sendKeys("abc@gmail.com");

        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Mobile");
    }

    @After
    public void tearDown() {
        //closeBrowser();
    }
}
