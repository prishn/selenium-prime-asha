package selectexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class TestDropDownList extends Utility {

    String baseUrl = "https://www.redbus.in/Cancellation";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    //When we do not have select tag for dropdown then we use this method
    @Test
    public void dropDownExampleWithList() {
        clickOnElement(By.xpath("//div[@class='manageHeaderLbl']"));
        List<WebElement> manageBookingList = driver.findElements(By.xpath("//div[@id='manageHeaderdd']//ul/li/span"));

        for (WebElement element : manageBookingList) {
            if (element.getText().equalsIgnoreCase("Change Travel Date")) {
                element.click();
                break;
            }
        }
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
