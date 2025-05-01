package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class assertiondemo {

    @Test
    public void loginOrangeHRM() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Use explicit wait for the username field
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
 
        // Use explicit wait for the password field
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("admin123");

        // Use explicit wait for the login button
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

        System.out.println("Login attempted");

      // Use explicit wait for the element with class name "oxd-topbar-header-breadcrumb"
      boolean isdisplayedStatus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-topbar-header-breadcrumb"))).isDisplayed();

        // Use explicit wait for the element with partial link text "upgrade-to-advanced"
        // Increase timeout duration and verify the locator
       
        // Assert the URL

        //String actualUrl = driver.getCurrentUrl();
       // String loginPageURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        // Assert.assertEquals(actualUrl, expectedUrl); //"The actual URL does not match
        // the expected URL.");
        // Assert.assertNotEquals(actualUrl, loginPageURL); // "The actual URL matches
        // the expected URL.");
        // driver.quit(); // Close the browser after the test
        Assert.assertTrue(isdisplayedStatus);// "The link is not displayed on the page.");

    }
}