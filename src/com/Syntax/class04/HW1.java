package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
        /*Open chrome browser
        Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
        Enter valid username and password (username - Admin, password - Hum@nhrm123)
        Click on login button
        Then verify the message "Welcome Admin " is there on the top right corner */

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input[id='btnLogin']")).click();
        WebElement welcomeAdmin=driver.findElement(By.cssSelector("a#welcome"));
        boolean statusDisplayed=welcomeAdmin.isDisplayed();
        System.out.println("The 'Welcome Admin' message is displayed :"+statusDisplayed);




    }
}
