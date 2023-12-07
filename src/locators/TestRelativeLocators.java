package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

/**
 * Created by Jay Vaghani
 */
public class TestRelativeLocators extends BaseTest {

    String baseUrl = "http://way2automation.com/way2auto_jquery/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void relativeLocators() throws InterruptedException {
        // above
        WebElement above = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
        above.sendKeys("Prime Testing");

        // below
        WebElement below = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select")));
        below.sendKeys("London");

        // near
//        WebElement near = driver.findElement(RelativeLocator.with(By.partialLinkText("THE")).near(By.linkText("Signin")));
//        near.click();

        // toRightOf
//        WebElement toRightOf = driver.findElement
//                (RelativeLocator.with(By.xpath("//input[@name='password']")).toRightOf(By.tagName("label")));
//        toRightOf.sendKeys("Prime123");
//        Thread.sleep(2000);

        // toLeftOf
//        WebElement toLeftOf = driver.findElement(RelativeLocator.with(By.linkText("Signin")).toLeftOf(By.xpath("(//input[@value='Submit'])[2]")));
//        toLeftOf.click();


        // Chaining the Relative Locators
        driver.findElement(RelativeLocator.with(By.tagName("input"))
                        .above(By.linkText("Signin"))
                        .below(By.xpath("//*[@id='load_form']/fieldset[6]/input")))
                .sendKeys("PrimeTesting");



        // Example using above and below locator
        driver.findElements(RelativeLocator.with(By.tagName("label")
        ).below(By.xpath("//*[@id=\"load_form\"]/h3")));

    }

    @After
    public void tearDown() {

        closeBrowser();
    }
}