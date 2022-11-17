package com.Syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW1 {
    public static <remove> void main(String[] args) {
        /* go to https://the-internet.herokuapp.com/dynamic_controls
        click on checkbox and click on remove verify the text click on enable verify the textbox is
        enabled enter text and click disable verify the textbox is disabled */

        //set the path to the driver to link it with our class on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //maximize
        driver.manage().window().maximize();
        //go to the website
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //click on checkbox
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        //click on remove
        WebElement remove = driver.findElement(By.xpath("//button[text()='Remove']"));
        remove.click();

        //verify the text
        WebElement message = driver.findElement(By.xpath("//p[@id='message']"));
        String text= message.getText();

        if (message.isDisplayed()){
            System.out.println("The text is verified : "+text);
        }else{
            System.out.println("The text is not verified");
        }

        //click on enable
        WebElement enable = driver.findElement(By.xpath("//button[text()='Enable']"));
        enable.click();

        //introduce explicit wait
        WebDriverWait enableWait=new WebDriverWait(driver,20);
        enableWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        //verify textbox is enabled
        WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));

        WebElement enableMessage = driver.findElement(By.xpath("//p[@id='message']"));
        String enableText = enableMessage.getText();

        if(enableText.equalsIgnoreCase("It's enabled!")){
            System.out.println("The textbox is enabled");
        }else{
            System.out.println("the textbox is not enabled");
        }

        //enter text in textbox
        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        textBox.sendKeys("Hello!");

        //click disabled
        WebElement disableBtn = driver.findElement(By.xpath("//button[text()='Disable']"));
        disableBtn.click();

        //verify it's disabled
        WebElement disableMessage = driver.findElement(By.xpath("//p[@id='message']"));
        String disableText = disableMessage.getText();

        if(disableText.equalsIgnoreCase("It's disabled!")){
            System.out.println("The textbox is disabled");
        }else{
            System.out.println("the textbox is not disabled");
        }




    }
}
