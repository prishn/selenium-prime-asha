package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class LoginPageTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {

        // Find the login link and click on login link
        clickOnElement(By.linkText("Log in"));
        /*WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();*/
        String expectedText = "Welcome, Please Sign In!";
        // Find the actual text element and get the text from element
       /* WebElement actualTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = actualTextElement.getText();*/
        String actualText = getTextFromElement(By.xpath("//h1"));
        //Verify expected and actual text
        Assert.assertEquals("Not redirected to Login page", expectedText, actualText);
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        // Find the login link and click on login link
       /* WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();*/
        clickOnElement(By.linkText("Log in"));

        // Find the Email Field Type the Email address to email field
      /*  WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("jay123@gmail.com");*/
        sendTextToElement(By.id("Email"), "jay123@gmail.com");


        // Find the password field and Type the password to password field
        //driver.findElement(By.name("Password")).sendKeys("Prime123");
        sendTextToElement(By.name("Password"), "Prime123");

        // Find the login btn element and click
        //driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
        clickOnElement(By.xpath("//button[contains(text(), 'Log in')]"));

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found1";
        // Find the errorMessage element and get the text
        //String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        String actualErrorMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));

        Assert.assertEquals("Error message not displayed", expectedErrorMessage, actualErrorMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
