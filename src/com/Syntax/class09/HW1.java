package com.Syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW1 {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //maximize
        driver.manage().window().maximize();
        //go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //enter the username in the text box
        WebElement userTxtBox = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userTxtBox.sendKeys("admin");
        //enter the password
        WebElement passTxtBox = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passTxtBox.sendKeys("Hum@nhrm123");
        //click on login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        //click on PIM
        driver.findElement(By.xpath("//b[text()='PIM']")).click();
        //click on employee list
        driver.findElement(By.xpath("//a[text()='Employee List']")).click();
        //Choose one ID on first page, and check the checkbox for that ID
        List<WebElement> column = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        for(int i=0; i<column.size();i++){
            //i=0
            String columnNum = column.get(i).getText();
            //check for the desired value
            if(columnNum.equalsIgnoreCase("45022A")){
                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" +(i + 1)+"]/td[1]"));
                checkBox.click();
            }




}
    }

    }
