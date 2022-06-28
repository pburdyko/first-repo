package selenium.project.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import selenium.framework.browser.Browser;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private Browser browser = Browser.BROWSER;

    @BeforeMethod
    public void setUp() {
        Browser.BROWSER.maximize();

    }

    @AfterMethod
    public void tearDown() {
        if (browser != null) {
            browser.close();
        }
    }
}
