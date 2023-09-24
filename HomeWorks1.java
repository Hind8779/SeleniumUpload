package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWorks1 {

            public static void main(String[] args) throws InterruptedException {
                WebDriver driver = new FirefoxDriver();
                driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
                driver.manage().window().maximize();
                WebElement userName = driver.findElement(By.name("username"));
                userName.sendKeys("abc");
                Thread.sleep(3000);
                userName.clear();
                userName.sendKeys("Admin");
                WebElement password = driver.findElement(By.name("password"));
                password.sendKeys("admin123");
                WebElement login = driver.findElement(By.tagName("button"));
                System.out.println("The login button text is"+login.getText());
                login.click();

            }}



