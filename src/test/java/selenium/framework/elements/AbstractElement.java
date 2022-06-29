package selenium.framework.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.framework.browser.Browser;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public abstract class AbstractElement {

    private String name;
    private By locator;
    private WebDriverWait wait;
    private WebDriver driver;

    public AbstractElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
        this.driver = Browser.BROWSER.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    }

    public WebElement findElement() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        return driver.findElement(locator);
    }

    public void click() {
        WebElement element = findElement();
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }


    public String getText() {
        return findElement().getText();
    }

}
