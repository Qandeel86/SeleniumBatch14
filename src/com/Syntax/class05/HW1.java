package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        /*1.Go to facebook
          2.click on create New Account
          3.Fill out the whole form
          4.Take screenshot of filled out form manually and share in HW channel along with code*/

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Qandeel");
        driver.findElement(By.name("lastname")).sendKeys("Wasim");
        driver.findElement(By.name("reg_email__")).sendKeys("123456789");
        driver.findElement(By.name("reg_passwd__")).sendKeys("abcdefg");
        WebElement dropDownMonth=driver.findElement(By.xpath("//select[@id='month']"));
        Select select1=new Select(dropDownMonth);
        select1.selectByIndex(5);
        WebElement dropDownDay=driver.findElement(By.xpath("//select[@id='day']"));
        Select select2=new Select(dropDownDay);
        select2.selectByIndex(10);
        WebElement dropDownYear=driver.findElement(By.xpath("//select[@id='year']"));
        Select select3=new Select(dropDownYear);
        select3.selectByIndex(20);
        WebElement femaleRadioBtn=driver.findElement(By.xpath("//input[@value='1']"));
        femaleRadioBtn.click();



    }
}
