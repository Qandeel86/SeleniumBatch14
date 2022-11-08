package com.Syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        /*Navigate to http://syntaxprojects.com/
         *Click on start practicing
         *click on simple form demo
         *enter any text on first text box
         *click on show message
         *quit the browser
         */

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        //tagname[@attribute='attribute value']
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='list-group-item']")).click();
        driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Hello world");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@onclick='showInput();']")).click();
        driver.quit();
    }

}
