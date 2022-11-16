package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        /*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
         *fill out the form
         *click on register
         *close the browser
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.name("customer.firstName")).sendKeys("Qandeel");
        driver.findElement(By.name("customer.lastName")).sendKeys("Wasim");
        driver.findElement(By.name("customer.address.street")).sendKeys("1234 Fall Drive");
        driver.findElement(By.name("customer.address.city")).sendKeys("Springfield");
        driver.findElement(By.name("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("22152");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("123-456-7890");
        driver.findElement(By.name("customer.ssn")).sendKeys("111-11-1111");
        driver.findElement(By.name("customer.username")).sendKeys("abc");
        driver.findElement(By.name("customer.password")).sendKeys("abcdefg");
        driver.findElement(By.name("repeatedPassword")).sendKeys("abcdefg");

        Thread.sleep(3000);
        driver.findElement(By.className("button")).click();

        driver.close();


    }

}
