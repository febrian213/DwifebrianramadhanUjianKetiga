package com.juaracoding;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
public class SeleniumSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();


        //Maximize the browser
        driver.manage().window().maximize();

        String url = "https://shop.demoqa.com/";

        driver.get(url);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement addsearch = driver.findElement(By.xpath("//*[@class= 'noo-search']"));
        addsearch.click();

        WebElement userName = driver.findElement(By.xpath("//*[@class='form-control']"));
        userName.sendKeys("dress");
        System.out.println("input search");

        WebElement textbox = driver.findElement(By.className("form-control"));
        textbox.sendKeys(Keys.ENTER);

        WebElement wishlist1 = driver.findElement(By.xpath("//*[@data-original-product-id= '1473']"));
        wishlist1.click();

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        WebElement wishlist2 = driver.findElement(By.xpath("//*[@data-original-product-id= '1467']"));
        wishlist2.click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement adddismiss = driver.findElement(By.xpath("//*[@class= 'woocommerce-store-notice__dismiss-link']"));
        adddismiss.click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement clickwishlist = driver.findElement(By.linkText("My Wishlist"));
        clickwishlist.click();


    }

}
