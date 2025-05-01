package com.example.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class com {
    @Test
    public void testifcheckboxisSelected() {

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

        // Use explicit wait for the menu icon
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".oxd-icon.oxd-main-menu-item--icon"))).click();

        // Use explicit wait for the checkbox element
        boolean isEnabled = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector(".oxd-switch-input.oxd-switch-input--active.--label-right"))).isEnabled();

        Assert.assertFalse(isEnabled);
    }

}
