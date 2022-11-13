package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {
    public static void main(String[] args) {
        /**Implicit wait**
         1. goto https://syntaxprojects.com/dynamic-data-loading-demo.php
         2. click on get New User
         3. get the firstname  of user and print it on console
         */
        // set the path to the driver to link it with our class on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //go to syntax projects
        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");
        //maximize window
        driver.manage().window().maximize();
        //click on get New User
        WebElement newUserbtn = driver.findElement(By.xpath("//button[@type='button']"));
        newUserbtn.click();
        //get firstname of user and print on console
        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        String name=firstName.getText();
        System.out.println(name);
    }
}
