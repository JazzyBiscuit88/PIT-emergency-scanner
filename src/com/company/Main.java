package com.company;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/macbookpro/projects/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.broadcastify.com/listen/feed/21738");
        System.out.println("Launching...");

        // click on play button
        driver.findElement(By.className("button-play")).click();

        // navigate to pop-up window
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        // click on pop-up play button
        driver.findElement(By.id("statebutton-21738")).click();

        // slide volume bar down
    }

}