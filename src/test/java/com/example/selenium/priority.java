package com.example.selenium;

import org.testng.annotations.Test;

public class priority {

    @Test(priority = 1)
    public void a() {
        System.out.println("Test a executed");
    }

    @Test(priority = 3)
    public void c() {
        System.out.println("Test c executed");
    }

    @Test(priority = 2)
    public void b() {
        System.out.println("Test b executed");
    }
}