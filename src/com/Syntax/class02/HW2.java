package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        /*navigate to fb.com
         *click on create new account
         *fill up all the textboxes
         *close the pop up
         *close the browser */

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Qandeel");
        driver.findElement(By.name("lastname")).sendKeys("Wasim");
        driver.findElement(By.name("reg_email__")).sendKeys("123456789");
        driver.findElement(By.name("reg_passwd__")).sendKeys("abcdefg");
        driver.findElement(By.name("birthday_month")).sendKeys("Jan");
        driver.findElement(By.name("birthday_day")).sendKeys("1");
        driver.findElement(By.name("birthday_year")).sendKeys("2022");
        driver.close();


    }
}
