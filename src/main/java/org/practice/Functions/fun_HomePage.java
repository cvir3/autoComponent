package org.practice.Functions;


import org.practice.Utilities.baseClass;
import org.practice.Elements.webElements;
import org.openqa.selenium.WebDriver;


import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class fun_HomePage extends baseClass {
    WebDriver webDriver;
    webElements ele = new webElements();

    public fun_HomePage(WebDriver remoteDriver) {
        webDriver = remoteDriver;
    }

    public void homePage() throws IOException, InterruptedException {
        webDriver.findElement(ele.clickOnPractice).click();
        Thread.sleep(3000);
        Set<String> w = webDriver.getWindowHandles();
        // window handles iterate
        Iterator<String> t = w.iterator();
        String hp = t.next();
        String pp = t.next();
        // switching parent window
        webDriver.switchTo().window(hp);
        Thread.sleep(3000);
        // switching child window
        webDriver.switchTo().window(pp);
        Thread.sleep(3000);
    }
}
