import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Setup\\Selenium\\Selenium_Java\\ChrWebDriver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");
        // Fina edit field for a Surname
        WebElement full_name = driver.findElement(By.id("name"));
                // Enter the family name
        full_name.sendKeys("Sivitic");
        try {
            //full_name.wait();
            full_name.wait(1);
        } catch (InterruptedException e) {

           e.printStackTrace();
        }
        //Find the Submit button
        WebElement submit_button = driver.findElement(By.id("button"));
        // Click the button
        submit_button.click();

        //Quit the Web driver
        driver.quit();
    }
}
