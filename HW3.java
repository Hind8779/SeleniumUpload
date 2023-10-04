package HomeWorks;
//Navigate to http://35.175.58.98/basic-checkbox-demo.php.
//Check the if Checkbox1 is enabled
//If Checkbox1 is disabled:
//Click on the "enable checkboxes" button.
//Verify that Checkbox1 is now enabled.
//Click on Checkbox1.
//Confirm that Checkbox1 is selected.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Navigate to the page
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        // Check if Checkbox1 is enabled
        WebElement checkbox1 = driver.findElement(By.id("isAgeSelected"));
        if (!checkbox1.isEnabled()) {
            // If Checkbox1 is disabled, click on the "Enable Checkboxes" button
            WebElement enableButton = driver.findElement(By.id("check1"));
            enableButton.click();
        }

        // Verify that Checkbox1 is now enabled
        if (checkbox1.isEnabled()) {
            // Click on Checkbox1
            checkbox1.click();

            // Confirm that Checkbox1 is selected
            if (checkbox1.isSelected()) {
                System.out.println("Checkbox1 is selected.");
            } else {
                System.out.println("Checkbox1 is not selected.");
            }
        }

    }
}


