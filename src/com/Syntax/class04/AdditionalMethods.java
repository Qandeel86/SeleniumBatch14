package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //goto syntaxProject.com simple-form-demo
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        //find the webELement button
        WebElement btn = driver.findElement(By.cssSelector("button#buttoncheck"));
        //get the text from the btn webelement
        String text = btn.getText();
        //print it on console
        System.out.println(text);

        //get the value of the attribute "id" from this WebElement
        String idvalue=btn.getAttribute("id");
        System.out.println("the value of the attribute id is :"+idvalue);
    }
}

