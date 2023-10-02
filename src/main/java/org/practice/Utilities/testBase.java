package org.practice.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class testBase extends baseClass {

    private WebDriverWait wait;

    public testBase() {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
    }

    public void waitForElementAndClick(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();
    }

    public void switchTab() throws InterruptedException, IOException {
        Set<String> w = webDriver.getWindowHandles();
        // window handles iterate
        Iterator<String> t = w.iterator();
        String hp = t.next();
        String pp = t.next();
        // switching parent window
        //webDriver.switchTo().window(hp);
        // switching child window
        webDriver.switchTo().window(pp);
    }

    public void scrollPage(WebElement element) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
