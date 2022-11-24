package com.Syntax.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HW1 {
    public static void main(String[] args) {
        /*goto https://demo.guru99.com/test/simple_context_menu.html
        right click on the button, select edit and handle the alert
        double click on the button and handle the alert
         */
        //set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //maximize
        driver.manage().window().maximize();
        //goto website
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        //right click on the button
        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action=new Actions(driver);
        action.contextClick(rightClickBtn).perform();
        //select edit
        WebElement editBtn = driver.findElement(By.xpath("//span[text()='Edit']"));
        editBtn.click();
        //handle the alert
        Alert alert=driver.switchTo().alert();
        alert.accept();
        //find double-click button and perform double click action
        WebElement doubleBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        action.doubleClick(doubleBtn).perform();
        //switch to alert & handle
        driver.switchTo().alert();
        alert.accept();



    }
}
