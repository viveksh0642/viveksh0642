package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Sample {

    WebDriver driver;

    @BeforeMethod
    public void setup() throws InterruptedException {
       // WebDriver driver = new ChromeDriver() ;// Automatically manages driver
       driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
        Thread.sleep(5000);
        // Replace with the actual login URL
    }

    @Test
    public void firstTest() {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("LogiSampleTestn attempted"); // Helpful console output
    }

@Test
public void firstTest1() {
    driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.name("password")).sendKeys("test123");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    System.out.println("Login attempted"); // Helpful console output
}

@AfterMethod
public void tearDown() {
    if (driver != null) {
        driver.quit();
    }
}
}
