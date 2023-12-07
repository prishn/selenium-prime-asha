package alertexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestAlertExample extends Utility {
    String baseUrl = "https://www.hyrtutorials.com/p/alertsdemo.html";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    // Simple Alert
    @Test
    public void simpleAlertExample() throws InterruptedException {
        clickOnElement(By.xpath("//p[text() = 'Consent']")); //click on consent form
        clickOnElement(By.id("alertBox")); //Click on click me button
        Alert alert = driver.switchTo().alert(); //Creating alert object reference and switch to alert
        System.out.println(alert.getText()); //Getting text from alert
        Thread.sleep(2);
        alert.accept();//Accepting the alert (clicking on ok button)

    }

    // Confirmation Alert
    @Test
    public void conformationAlertExample() throws InterruptedException {
        clickOnElement(By.xpath("//p[text() = 'Consent']")); //click on consent form
        clickOnElement(By.id("confirmBox")); //Click on click me button
        Alert alert = driver.switchTo().alert(); //Creating alert object reference and switch to alert
        System.out.println(alert.getText()); //Getting text from alert
        Thread.sleep(2);
        alert.dismiss(); //Dismiss the alert
        Thread.sleep(2);
        System.out.println(getTextFromElement(By.id("output")));
    }

    // Prompt Alert
    @Test
    public void promptAlertExample() throws InterruptedException {
        clickOnElement(By.xpath("//p[text() = 'Consent']")); //click on consent form
        clickOnElement(By.id("promptBox")); //Click on click me button

        sendTextToAlert("Asha");

//        Alert alert = driver.switchTo().alert(); //Creating alert object reference and switch to alert
//        System.out.println(alert.getText()); //Getting text from alert
//        Thread.sleep(2);
//        alert.sendKeys("Prime"); //Sending text to alert
        acceptAlert();
        // alert.accept(); //Accept the alert
        Thread.sleep(2);
        System.out.println(getTextFromElement(By.id("output")));
    }

    @After
    public void tearDown() {
        // closeBrowser();
    }

}
