package datepicker;

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
public class DatePicker extends Utility {
    String baseUrl = "https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void selectDate() {

        String year = "2030";
        String month = "May";
        String date = "25";

        clickOnElement(By.id("datepicker")); //open the calendar
        while (true) {
            String monthYear = getTextFromElement(By.xpath("//div[@class='ui-datepicker-title']"));
            System.out.println(monthYear);
            //split it month and year
            String[] a = monthYear.split(" ");
            String mon = a[0];
            String yer = a[1];
            //select year
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)){
                break;
            }else {
                clickOnElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
            }
        }
        //select date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));
        for (WebElement dt : allDates ) {
            if (dt.getText().equalsIgnoreCase(date)){
                dt.click();
                break;
            }
        }
    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
