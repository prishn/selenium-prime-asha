package junit;

import org.junit.*;

/**
 * Created by Jay Vaghani
 */
public class JUnitIntroduction {

    @BeforeClass
    public static void connectToDB() {
        System.out.println("DB connection");
    }

    @AfterClass
    public static void closeDBConnection() {
        System.out.println("Close DB connection");
    }


    @Before
    public void openBrowser() {
        System.out.println("Opening Browser");
    }

    @After
    public void closeBrowser() {
        System.out.println("Closing Browser");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        System.out.println("Navigate to Login Page..");
        Assert.assertEquals("User not navigate to Login page", "Jay1", "Jay");
    }

    @Test
    public void test() {
        System.out.println("Test Method");
        Assert.assertTrue(false);
    }

}
