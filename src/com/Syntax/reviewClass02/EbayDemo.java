package com.Syntax.reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayDemo {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        //go to ebay.com
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        //        select from the drop down
        WebElement dropDwn = driver.findElement(By.xpath("//select[@id='gh-cat']"));

        Select sel= new Select(dropDwn);

        sel.selectByValue("58058");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

//        verify the title


        String title = driver.getTitle();

        if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
            System.out.println("the title is verified");
        }
        else{
            System.out.println("the title is incorrect");
        }

    }
}
