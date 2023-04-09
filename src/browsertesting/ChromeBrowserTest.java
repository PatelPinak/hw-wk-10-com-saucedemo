package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // Open the given URL in Chrome browser
        String baseUrl = "https://www.saucedemo.com/";
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        // Get the title of the page
        System.out.println(driver.getTitle());
        // Get the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        // Get page source
        System.out.println("Page source: " + driver.getPageSource());
        // Find the email field element
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // Type the password in the element
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        // Close the browser
        driver.close();
    }
}
