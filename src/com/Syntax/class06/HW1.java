package com.Syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
    public static void main(String[] args) {
        /*goto: https://chercher.tech/practice/frames
            1.Check the checkBox
            2.Select BabyCat from drop down
            3.Send text in the text box "DONE"
         */
        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        // goto chercher /frames
        driver.get("https://chercher.tech/practice/frames");
        // maximize
        driver.manage().window().maximize();

        //switch to the frame containing the subframe which has checkbox
        driver.switchTo().frame("frame1");
        WebElement inputTxt = driver.findElement(By.xpath("//input"));
        //finding the frame through xpath and switching using BY Webelement method
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        //find the checkbox
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

        //switch focus to the main page
        driver.switchTo().defaultContent();
        //switch to the frame using by index
        driver.switchTo().frame(1);
        //find the WebElement dropDown by looking for select tag
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='animals']"));
        //use Select class
        Select select=new Select(dropDown);
        //select an option by index
        select.selectByIndex(1);

        //switch focus to the main page
        driver.switchTo().defaultContent();
        //switch to the frame containing text box
        driver.switchTo().frame("frame1");
        WebElement textBox = driver.findElement(By.xpath("//input"));
        inputTxt.sendKeys("DONE");

    }
}
