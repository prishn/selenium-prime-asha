package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo1 {

    static String baseUrl = "https://demo.nopcommerce.com/";

    public static void main(String[] args) {
        // 1. Setup Browser
        // Launch the Chrome Browser
        WebDriver driver = new FirefoxDriver();
        // Open the URL into Browser
        driver.get(baseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();
        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Find the Elements
        // ID and Name Locators

        WebElement search = driver.findElement(By.id("small-searchterms"));

        // Name Locators
        driver.findElement(By.name("q")).sendKeys("Mobile");
        driver.findElements(By.id("small-searchterms"));

        // 3. Action on Element
//        search.sendKeys("Mobile");


    }

}
