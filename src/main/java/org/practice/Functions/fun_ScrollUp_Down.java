package org.practice.Functions;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.practice.Elements.ele_HomePage;
import org.practice.Utilities.baseClass;
import org.practice.Utilities.testBase;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;

public class fun_ScrollUp_Down extends baseClass {

    WebDriver webDriver;
    ele_HomePage ele = new ele_HomePage();
    testBase tB = new testBase();

    public fun_ScrollUp_Down(WebDriver remoteDriver) {
        webDriver = remoteDriver;
    }

    public void scrollUp_Down() throws IOException, InterruptedException {
        /*-- Static Code --*/
        //Thread.sleep(2000);
        //JavascriptExecutor jsDown = (JavascriptExecutor) webDriver;
        //jsDown.executeScript("window.scrollBy(0,2000)", "");
        //Thread.sleep(2000);
        //JavascriptExecutor jsUp = (JavascriptExecutor) webDriver;
        //jsUp.executeScript("window.scrollBy(0,-2000)", "");

        /*-- Dynamic Code --*/
        WebElement elementDown = webDriver.findElement(ele.scrollDown);
        tB.scrollPage(elementDown);
        Thread.sleep(2000);
        WebElement elementUp = webDriver.findElement(ele.scrollUp);
        tB.scrollPage(elementUp);
        Thread.sleep(2000);
    }
}
