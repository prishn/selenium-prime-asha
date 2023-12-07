package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class ChromeBrowserTest {

    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://demo.nopcommerce.com/";
        // Launch the Chrome Browser
        WebDriver driver = new FirefoxDriver();
        // Open the URL into Browser
        driver.get(baseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();
        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Get the title of the Page.
        String title = driver.getTitle();
        System.out.println(title);

        // Get Current Url
        System.out.println("The current Url : " + driver.getCurrentUrl());

        // Get Page Source
        System.out.println(driver.getPageSource());

        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        driver.navigate().to(loginUrl);

        System.out.println(" Get Current Url " + driver.getCurrentUrl());


        driver.navigate().back();
        System.out.println(" Get Current Url " + driver.getCurrentUrl());

        driver.navigate().refresh();

        Thread.sleep(5000);
        driver.navigate().forward();
        System.out.println(" Get Current Url " + driver.getCurrentUrl());




        // Close the Browser
        driver.quit();

    }
}
