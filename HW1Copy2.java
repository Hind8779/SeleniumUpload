package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1Copy2 {
    public static void main(String[] args) throws InterruptedException {
        // Create a new Firefox WebDriver instance.
        WebDriver driver = new ChromeDriver();
        // Navigate to the OrangeHRM login page.
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        // Enter the username "abc".
        WebElement username = driver.findElement(By.name("username"));
        // username.sendKeys("abc");
        username.sendKeys(Keys.CONTROL+"a");
        username.sendKeys(Keys.DELETE);
        // Clear the username field.
        Thread.sleep(2000);
        username.clear();
        Thread.sleep(2000);
        // Enter the username "Admin".
        username.sendKeys("Admin");
        // Enter the password "admin123".
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        // Get the text from the login button web element.
        WebElement loginButton = driver.findElement(By.tagName("button"));
        // Print the login button text on the console.
        System.out.println("The login button text is: " + loginButton.getText());
        // Click on the login button.
        loginButton.click();


    }
}


