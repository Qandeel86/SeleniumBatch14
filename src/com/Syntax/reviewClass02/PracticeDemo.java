package com.Syntax.reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo {
    public static void main(String[] args) {
        //setting up the webDriver
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //create an instance
        WebDriver driver = new ChromeDriver();
        //open the syntax
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //maximize the window
        driver.manage().window().maximize();
        //       When user sends in the username Admin
        WebElement userName = driver.findElement(By.id("txtUsername"));
//        send the user name
        userName.sendKeys("Admin");

//        Then user sends in the wrong password
        WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("abracadabra");

//        Then user clicks on login Button
        WebElement btn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        btn.click();
        //        Then VERIFY THAT THE ERROR "Invalid credentials"

//get the error message from the DOM
        WebElement errorMSG = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String error = errorMSG.getText();

//        verification

        if(error.equalsIgnoreCase("Invalid credentials")){
            System.out.println("the correct Error message is there --->verified");
        }
        else{

            System.out.println("the correct Error message is not there ");
        }
    }
}
