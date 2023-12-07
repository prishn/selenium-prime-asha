package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class LoginTest{

    static String baseUrl = "https://demo.nopcommerce.com/";


    public static void main(String[] args) {
        // 1. Setup Browser
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open the URL into Browser
        driver.get(baseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();
        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Find Login link element and click on it.
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // Find Email Field Element and Type the Email
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("prime123@gmail.com");

        // Find Password Field Element and Type Password
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Prime123");

    }
}
