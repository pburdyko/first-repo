package selenium.project.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.framework.cookies.ManagerCookie;
import selenium.project.pages.HomePage;

public class TestClass extends BaseTest {
    private WebDriver driver;


    @Test
    public void test() {
        HomePage homePage= new HomePage();
        homePage.open();

        ManagerCookie.addCookie("example_key_1", "example_value_1");
        ManagerCookie.addCookie("example_key_2", "example_value_2");
        ManagerCookie.addCookie("example_key_3", "example_value_3");

        Assert.assertEquals(ManagerCookie.getNumberCookies(), 3,"number of cookies is incorrect");

        ManagerCookie.deleteCookieByName("example_key_1");

        Assert.assertEquals(ManagerCookie.getNumberCookies(), 2, "number of cookies is incorrect");



//        WebElement login1 = driver.findElement(By.xpath("//input[@name='login']"));
//
//        login1.sendKeys("palinaburdyka");
//        WebElement secondLogin = driver.findElement(By.id("passp:sign-in"));
//        secondLogin.click();
//        WebElement password = driver.findElement(By.xpath("//*[@id=\"passp-field-passwd\"]"));
//        password.sendKeys("chipka123");
//
//
//        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"catalogPopup\"]/div/div/div/div/div/div/div[1]/div/ul/li[10]"));
//        Assert.assertEquals(elements.size(), "26", "");
//        int random = (int) (Math.random() * elements.size());
    }


}

