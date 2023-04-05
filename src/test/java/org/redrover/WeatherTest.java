package org.redrover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WeatherTest {
    @Test
    public void testM() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://openweathermap.org/");
        Thread.sleep(10000);

        WebElement button = driver.findElement(By.xpath("//*[@id=\"desktop-menu\"]/ul/li[1]/a"));
        button.click();

        String title = driver.getTitle();
        assertEquals("OpenWeatherMap API guide - OpenWeatherMap", title);
        driver.quit();

    }
    @Test
    public void testF() throws  InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://openweathermap.org/");
        Thread.sleep(10000);
        WebElement button = driver.findElement(By.xpath("//*[@id=\"stick-footer-panel\"]/div/div/div/div/p/text()"));
        Assert.assertEquals(button.getText(),"We use cookies which are essential for the site to work. We also" +
                " use non-essential cookies to help us improve our services. Any data collected is anonymised." +
                " You can allow all cookies or manage them individually.");
 //       WebElement temperatura = driver.findElement(By.xpath("//*[@id=\"weather-widget\"]/div[2]/div[1]/div[1]/div[2]/div[1]/span"));
//        assertEquals("51°F",temperatura);
        driver.quit();
    }
}
