package com.juaracoding;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLogin {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();


        //Maximize the browser
        driver.manage().window().maximize();

        String url= "https://shop.demoqa.com/my-account";

        driver.get(url);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement userName =
                driver.findElement(By.xpath("//*[@id='username']"));
        userName.sendKeys("Dwi Febrian Ramadhan");
        System.out.println("input user name");

        driver.findElement(By.id("password")).sendKeys("qwerty123*");
        System.out.println("input password");

        WebElement checkbox1 = driver.findElement(By.id("rememberme"));
        checkbox1.click();



        if (checkbox1.isSelected()) {
            System.out.println("Checkbox is Toggled On");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement buttonLogin = driver.findElement(By.xpath("//*[@class ='woocommerce-button button woocommerce-form-login__submit']"));
        buttonLogin.click();

    }
}