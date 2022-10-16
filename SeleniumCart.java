package com.juaracoding;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SeleniumCart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();


        //Maximize the browser
        driver.manage().window().maximize();

        String url = "https://shop.demoqa.com/product/black-cross-back-maxi-dress";

        driver.get(url);


        JavascriptExecutor js = (JavascriptExecutor) driver;

        Select color = new Select(driver.findElement(By.id("pa_color")));
        color.selectByIndex(1);

        Select size = new Select(driver.findElement(By.id("pa_size")));
        size.selectByIndex(1);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement addCart = driver.findElement(By.xpath("//*[@type= 'submit']"));
        addCart.click();

    }
}
