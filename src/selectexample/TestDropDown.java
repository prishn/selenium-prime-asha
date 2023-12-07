package selectexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestDropDown extends Utility {

    String baseUrl = "http://way2automation.com/way2auto_jquery/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void dropDownExample() {

        WebElement dropDown = driver.findElement(By.name("country"));
        //Create the object of select class
        Select select = new Select(dropDown);

        //Select by visible text method
        select.selectByVisibleText("Australia");

        //Select by value method
        select.selectByValue("Gambia");
        //selectByValueFromDropDown(By.name("country"), "Gambia");

        //Select by Index method
        select.selectByIndex(5);

        //Get all the options
        selectByAllOptionsFromDropDown(By.name("country"));
        System.out.println(select.getOptions().size());
        System.out.println(select.getAllSelectedOptions());

//        List<WebElement> allOptions = select.getOptions();
//        System.out.println(allOptions.size());
//
//        for(WebElement option : allOptions){
//            System.out.println(option.getText());
//        }
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
