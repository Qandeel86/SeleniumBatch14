package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HW1 {
    public static void main(String[] args) {
        //Window Handles
        /*1.go to http://accounts.google.com/signup
          2.click on help and privacy btn
          3.click on community btn
          4.go to gmail.com page and enter your username in form
          ***hint:can save the window handle in variables for later use
         */

        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        // goto google account page
        driver.get("http://accounts.google.com/signup");
        // maximize
        driver.manage().window().maximize();
        //click on help btn
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        //click on privacy btn
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();
        //click on community btn(it is on Google Acct Help tab)
        //get all the window handles
        Set<String> allHandles = driver.getWindowHandles();

        for(String handle:allHandles){
            //switching the focus to the current handle from list
            driver.switchTo().window(handle);
            //get the title of the window to which the driver has switched
            String title = driver.getTitle();

            //compare if the title is of the help
            if(title.equalsIgnoreCase("Google Account Help")){

                System.out.println("the current page under focus is :"+title);
                break;
            }

        }
        //find the community button and click on it
        WebElement communityBtn=driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();

        for(String handle:allHandles){
            //switching the focus to the current handle from list
            driver.switchTo().window(handle);
            //get the title of the window to which the driver has switched
            String title = driver.getTitle();
            //compare if the title is of the help
            if(title.equalsIgnoreCase("Create your Google Account")){

                System.out.println("the current page under focus is :"+title);
                break;
            }

        }
                WebElement userName=driver.findElement(By.xpath("//input[@type='email']"));
                userName.sendKeys("Qandeel");

    }
}
