package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2 {
    public static void main(String[] args) {
    /*1.Go to ebay.com
      2.Get all the categories and print them in the console(in search bar you will see categories mentioned as dropdown)
      3.Select Computers/Tables & Networking
      4.Click on search
      5.Verify the title*/

        //set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        //go to ebay.com
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        WebElement allCategories=driver.findElement(By.xpath("//select[@name='_sacat']"));
        Select select=new Select(allCategories);
        List<WebElement> options=select.getOptions();

        for(int i=0;i< options.size();i++) {
            WebElement option = options.get(i);
            String text = option.getText();
            System.out.println(text);
        }

        select.selectByIndex(11);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        String title = driver.getTitle();
        System.out.println(title);



    }
}
