package org.practice.Functions;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.practice.Elements.webElements;
import org.practice.Utilities.baseClass;
import org.practice.Utilities.testBase;

import org.openqa.selenium.By;

import java.io.IOException;

public class fun_PracticePage extends baseClass {

    WebDriver webDriver;
    webElements ele = new webElements();
    testBase tB = new testBase();


    public fun_PracticePage(WebDriver remoteDriver) {
        webDriver = remoteDriver;
    }

    public void practicepage() throws IOException, InterruptedException {
        webDriver.findElement(ele.clickOnPractice).click();
        tB.switchTab();
        /*-- Radio Button --*/
        By bmwRadioBtn = By.id("bmwradio");
        tB.waitForElementAndClick(bmwRadioBtn);
        WebElement bmwRadio = webDriver.findElement(bmwRadioBtn);
        System.out.println("BMW radio button is selected " + bmwRadio.isSelected());
        /*-- ChcekBox --*/
        By bmwCheckBox = By.id("bmwcheck");
        tB.waitForElementAndClick(bmwCheckBox);
        WebElement bmwCheckbox = webDriver.findElement(bmwCheckBox);
        System.out.println("BMW checkbox is selected " + bmwCheckbox.isSelected());
        Thread.sleep(1000);
        /*-- Dropdown --*/
        Select carDropdown = new Select(webDriver.findElement(ele.selectDropDown));
        carDropdown.selectByValue("honda");
        WebElement selectedOption = carDropdown.getFirstSelectedOption();
        System.out.println("Selected Car is " + selectedOption.getText());
        /*-- MultiSelect --*/
        webDriver.findElement(ele.selectApple).click();
        webDriver.findElement(ele.selectPeach).click();
        webDriver.findElement(ele.selectOrange).click();

        webDriver.findElement(ele.inputName).sendKeys("QAOPS");
        webDriver.findElement(ele.btnAlert).click();
        Alert alert = webDriver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();
        webDriver.findElement(ele.btnConfirmed).click();
        Alert confirm = webDriver.switchTo().alert();
        Thread.sleep(1000);
        confirm.dismiss();


    }
}
