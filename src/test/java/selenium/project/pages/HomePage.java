package selenium.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.framework.browser.Browser;

public class HomePage extends BasePage {
    private FormElement responseAuth = new FormElement (By.xpath("/html/body/pre"), "responseAuth");

    public void open () {
        Browser.BROWSER.open();
    }
    public String getText () {
        return responseAuth.getText();
    }

}
