package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultiBrowserTest {
    static String browser = "FireFox";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;
    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Wrong browser name");
        }
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
