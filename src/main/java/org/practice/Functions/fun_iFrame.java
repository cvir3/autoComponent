package org.practice.Functions;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.practice.Elements.webElements;
import org.practice.Utilities.baseClass;
import org.practice.Utilities.testBase;

import org.openqa.selenium.By;

import java.io.IOException;

public class fun_iFrame extends baseClass {
    WebDriver webDriver;

    webElements ele = new webElements();
    testBase tB = new testBase();

    public fun_iFrame(WebDriver remoteDriver) { webDriver = remoteDriver; }

    public void iFramePage() throws IOException, InterruptedException{
        webDriver.findElement(ele.clickOnPractice).click();
        tB.switchTab();
        WebElement elementDown = webDriver.findElement(ele.ifsrolldown);
        tB.scrollPage(elementDown);
        Thread.sleep(1000);
        webDriver.switchTo().frame("courses-iframe");
        webDriver.findElement(ele.clickOnInterview).click();
    }
}
