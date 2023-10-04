package HomeWorks;
//Navigate to http://35.175.58.98/basic-radiobutton-demo.php.
//Check if the "Female" radio button is displayed.
//Click on the "Show Button".
//Check again if the "Female" radio button is displayed or not.
//Print the results of the checks to the console.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.management.MBeanAttributeInfo;

public class HW4 {
    public static void main(String[] args) {

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the page
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");

        // Check if the "Female" radio button is displayed
        WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='Female']"));
        boolean isDisplayedBeforeClick = femaleRadioButton.isDisplayed();

        // Click on the "Show Button"
        WebElement showButton = driver.findElement(By.id("buttoncheck"));
        showButton.click();

        // Check if the "Female" radio button is displayed again
        boolean isDisplayedAfterClick = femaleRadioButton.isDisplayed();

        // Print the results to the console
        System.out.println("Is 'Female' radio button displayed before click? " + isDisplayedBeforeClick);
        System.out.println("Is 'Female' radio button displayed after click? " + isDisplayedAfterClick);

        // Close the browser
        driver.quit();
    }
}



