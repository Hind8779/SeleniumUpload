package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.management.MBeanAttributeInfo;

public class HW5 {
    public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();
            // go to the webpage
            driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
            // maximize the window
            driver.manage().window().maximize();

            // find the dream destination dropdown
            WebElement dropdown = driver.findElement(By.xpath("//div[@class='btn btn-primary dropdown-toggle']"));

            dropdown.click();

            // select "Iceland" from the dropdown

        WebElement Iceland=driver.findElement(By.linkText("Iceland"));
        Iceland.click();


        }
    }
