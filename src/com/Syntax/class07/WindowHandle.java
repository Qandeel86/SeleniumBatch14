package com.Syntax.class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        // goto gmail sign up page
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        // maximize
        driver.manage().window().maximize();
        //get the window handle for the current page
        String gmailHandle=driver.getWindowHandle();
        //print
        System.out.println("The handle of the current page is :"+gmailHandle);
    }
}
