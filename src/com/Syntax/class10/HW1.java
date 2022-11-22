package com.Syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW1 {
    public static void main(String[] args) {
        /*Go to syntax hrms .
          Go-to the recruitment tab.
          From the calendar  just select a date
          8 August 2023 */
        //set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //maximize
        driver.manage().window().maximize();
        //go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //fill out username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //go to recruitment tab
        driver.findElement(By.xpath("//b[text()='Recruitment']")).click();
        //click drop down calendar
        driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']")).click();
        //select month(Aug)
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select = new Select(month);
        select.selectByValue("7");
        //select year(2023)
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1 = new Select(year);
        select1.selectByValue("2023");
        //select date from table(8)
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement date : dates) {
            String currentDate = date.getText();
            if (currentDate.equalsIgnoreCase("8")) {
                date.click();

            }
        }
    }
}
