package org.practice.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ele_HomePage {
    WebDriver webDriver;

    public By clickOnPractice = By.xpath ("//a[normalize-space()='PRACTICE']");
    public By clickOnBMW = By.id("bmwradio");
    public By clickOnBMWcheckBox = By.id("bmwcheck");
    public By selectDropDown = By.xpath("//select[@id='carselect']");
    public By selectApple = By.xpath("//option[@value='apple']");
    public By selectOrange = By.xpath("//option[@value='orange']");
    public By selectPeach = By.xpath("//option[@value='peach']");
    public By inputName = By.id("name");
    public By btnAlert = By.id("alertbtn");
    public By btnConfirmed = By.id("confirmbtn");
    public By scrollDown = By.xpath("(//div[@class='overly'])[4]");
    public By scrollUp = By.xpath("//nav[@class='navbar sbpro-navbar-left-right']");


}
