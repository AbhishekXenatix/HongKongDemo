package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {


    public void setup() {

        System.setProperty("webdriver.chrome.driver", "/Users/abhishekgupta/Downloads/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("www.google.com");


    }

}
