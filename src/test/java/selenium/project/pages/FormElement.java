package selenium.project.pages;

import org.openqa.selenium.By;
import selenium.framework.elements.AbstractElement;

public class FormElement extends AbstractElement {
    public FormElement (By locator, String name) {
        super(locator, name);
    }
}
