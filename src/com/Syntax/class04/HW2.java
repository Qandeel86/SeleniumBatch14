package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) {
    /*HRMS Application Negative Login:
    Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
    Enter valid username
    Leave password field empty
    Click on login button
    Verify error message with text "Password cannot be empty" is displayed */

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("");
        driver.findElement(By.cssSelector("input[id='btnLogin']")).click();
        WebElement errorMessage=driver.findElement(By.cssSelector("span#spanMessage"));

        if(errorMessage.isDisplayed()){
            System.out.println("Password cannot be empty");
        }else{
            System.out.println("Password field is not empty");
        }

    }
}
