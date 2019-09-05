import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Setup\\Selenium\\Selenium_Java\\ChrWebDriver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        //Open the alert dialog
        WebElement alertButtonHeHe = driver.findElement(By.id("alert-button"));
        alertButtonHeHe.click();

        Alert alert = driver.switchTo().alert();
        alert.accept(); //close the alert dialog
        //Use the JavaScriptExecutor




        driver.quit();
    }
}
