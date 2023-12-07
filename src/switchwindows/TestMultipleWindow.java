package switchwindows;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

import java.util.Set;

/**
 * Created by Jay Vaghani
 */
public class TestMultipleWindow extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void switchMultipleWindowExample() {

//        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[1]"));
//        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[2]"));
//        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[3]"));
//        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[4]"));

        //Get the parent window id
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent Handle: " + parentHandle);
        //Click on open window tab
        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[1]"));
        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[2]"));
        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[3]"));
        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[4]"));
        //Get all handles
        Set<String> handles = driver.getWindowHandles();
        System.out.println("All Handles: " + handles);
        for (String handle : handles) {
            if (!handle.equals(parentHandle)) {
                //switch to window whose window handle is not equal to parent
                driver.switchTo().window(handle);
                //Click on sign in link inside the window
                clickOnElement(By.xpath("//div[@class='form__action']"));
                driver.close();
                break;
            }
            //Switch the focus of driver to parent window
            driver.switchTo().window(parentHandle);
            sendTextToElement(By.id("name"), "Test Successful");
        }
        //Convert Set into List

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
