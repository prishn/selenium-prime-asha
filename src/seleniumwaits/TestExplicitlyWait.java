package seleniumwaits;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Utility;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class TestExplicitlyWait extends Utility {
    String baseUrl = "https://www.hyrtutorials.com/p/waits-demo.html";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void explicitlyWaitExample(){
        //click on consent button
        clickOnElement(By.xpath("//button[@aria-label='Consent']"));

        //Click on AddTextBox1 button
        //clickOnElement(By.id("btn1"));

        //Send text to TextBox1 field
      // sendTextToElement(By.id("txt1"), "Prime");

       clickOnElement(By.id("btn2"));
        //sendTextToElement(By.id("txt2"), "Prime Testing");

        //Use explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textBox2Field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
        textBox2Field.sendKeys("Prime");
    }


    @After
    public void tearDown() {
//        closeBrowser();
    }

}
