package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\spbac\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");

        WebDriver obj = new FirefoxDriver();
        obj.get("https://www.google.com");
        WebElement element = obj.findElement(By.name("q"));
        element.sendKeys("Pears");
        element.submit();
        Thread.sleep(10000);
        //current URL is this.url

        String curUrl= obj.getCurrentUrl();
        System.out.println(curUrl);
        Assert.assertTrue(curUrl.contains("Pears"));


    }
}
