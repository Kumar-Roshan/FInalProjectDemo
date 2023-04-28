package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    public static FirefoxDriver driver;

    @BeforeSuite
    public void setUp() {
        // Set up FireFoxDriver
        driver = new FirefoxDriver();
    }
/*
    @AfterSuite
    public void tearDown() {
         Close the FirefoxDriver();
        driver.quit();
    }

 */

}
