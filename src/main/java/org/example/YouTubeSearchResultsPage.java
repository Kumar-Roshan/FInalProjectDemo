package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class YouTubeSearchResultsPage {

    private FirefoxDriver driver;

    // Constructor
    public YouTubeSearchResultsPage(FirefoxDriver driver) {
        this.driver = driver;
    }

    // Page elements
    private By searchInput = By.id("search");
    private By searchButton = By.id("search-icon-legacy");
    private By firstVideo = By.xpath("//*[@id=\"video-title\"]/yt-formatted-string");

    // Page methods
    public void enterSearchQuery(String query) {
        driver.findElement(searchInput).sendKeys(query);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public void clickFirstVideo() {
        WebElement video = driver.findElement(firstVideo);
        Actions actions = new Actions(driver);
        actions.moveToElement(video).click().perform();
    }
}

