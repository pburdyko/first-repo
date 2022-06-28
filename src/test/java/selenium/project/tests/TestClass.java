package selenium.project.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.project.pages.HomePage;

public class TestClass extends BaseTest {
    private WebDriver driver;


    @Test
    public void test() {
        HomePage homePage= new HomePage();
        homePage.open();
        Assert.assertEquals(homePage.getText(), "{\n" +
                "  \"authenticated\": true, \n" +
                "  \"user\": \"user\"\n" +
                "}");


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

