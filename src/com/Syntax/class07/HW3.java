package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW3 {
    public static void main(String[] args) {
        /*1.Goto https://syntaxprojects.com/dynamic-elements-loading.php
          2.Click on start button
          3. get the text Welcome Syntax technologies and print on console
          -the text will be Empty
          -write down whatever the reason you understand  of text being empty after exploring DOM   */

        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //go to https://syntaxprojects.com/dynamic-elements-loading.php
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        // maximize
        driver.manage().window().maximize();
        //click on the start button
        WebElement startBtn =driver.findElement(By.id("startButton"));
        startBtn.click();
        //find the text
        WebElement welcomeText=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text= welcomeText.getText();
        System.out.println("the text is :"+text);

        //Text is empty after exploring DOM, because the element is already found before it can load onto the page.
    }
}
