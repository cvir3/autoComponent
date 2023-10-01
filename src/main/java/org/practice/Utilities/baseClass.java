package org.practice.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class baseClass {
    public static WebDriver webDriver;

    @BeforeClass
    public void setup() throws IOException {
//        propertiesRead propertiesRead = new propertiesRead();
//        String url = propertiesRead.readProperties("URL");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();
        webDriver.get("https://www.letskodeit.com");
        System.out.println("Page title is " + webDriver.getTitle());
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
//    public static void main (String[] args){
//        WebDriver driver = WebDriverManager.chromedriver().create();
//        driver.get("https://www.letskodeit.com/practice");
//    }



    public void teraDown(){
        webDriver.quit();
    }

}

