package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo5 extends BaseTest {

    //String baseUrl = "https://money.rediff.com/gainers/bse/daily/groupa";
    //String baseUrl = "https://money.rediff.com/gainers/bse/weekly/groupall";
    String baseUrl = "https://money.rediff.com/gainers/bse/monthly/groupall";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest5() {
        //click on consent button
        driver.findElement(By.xpath("//p[text() ='Consent']")).click();

        // Self --- Select the current node //Return string type
        String text = driver.findElement(By.xpath("//a[contains(text(),'TCI Ltd.')]/self::a")).getText();
        System.out.println(text); //TCI Ltd.

        // Parent --- Select the parent of the current node (always one)
        text = driver.findElement(By.xpath("//a[normalize-space()='TCI Ltd.']/parent::td")).getText();
        System.out.println(text);//TCI Ltd

        //Child --- Select the children of current node (one or many)
        List<WebElement> children = driver.findElements(By.xpath("//a[normalize-space()='TCI Ltd.']/ancestor::tr/child::td"));
        System.out.println("Number of children : " + children.size());//5

        //Ancestor --- Select all ancestors (parent grandparent etc)
        text = driver.findElement(By.xpath("//a[normalize-space()='TCI Ltd.']/ancestor::tr")).getText();
        System.out.println(text); //TCI Ltd. A 851.80 852.45 + 0.08

        //Descendant -- Select all descendants (children, grand children etc)
        List<WebElement> grandChildren = driver.findElements(By.xpath("//a[normalize-space()='TCI Ltd.']/ancestor::tr/descendant::*"));
        System.out.println(grandChildren);

        // Following -- Select everything in document after the closing tag of the current node.
        List<WebElement> following = driver.findElements(By.xpath("//a[normalize-space()='TCI Ltd.']/ancestor::tr/following::tr"));
        System.out.println(following);

        // Following-Sibling  -- Select all siblings after the current node
        List<WebElement> followingSibling = driver.findElements(By.xpath(" //a[normalize-space()='TCI Ltd.']/ancestor::tr/following-sibling::tr"));
        System.out.println(followingSibling);

        // Preceding -- Select all nodes that appear before the current node in the document
        List<WebElement> preceding = driver.findElements(By.xpath("//a[normalize-space()='TCI Ltd.']/ancestor::tr/preceding::tr"));
        System.out.println(preceding);

        // Preceding-sibling -- Select all siblings before the current node
        List<WebElement> precedingSibling = driver.findElements(By.xpath("//a[normalize-space()='TCI Ltd.']/ancestor::tr/preceding-sibling::tr"));
        System.out.println(precedingSibling);
    }

    @After
    public void tearDown() {

        closeBrowser();
    }

}
