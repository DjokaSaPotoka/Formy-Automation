import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Setup\\Selenium\\Selenium_Java\\ChrWebDriver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement openModal = driver.findElement(By.id("modal-button") );
        //WebElement openModal2 = driver.findElement (By.id ("modal-button"));
        openModal.click();
        Thread.sleep(2000);
        WebElement closeButton = driver.findElement(By.id ("close-button"));
        // Use JavaScript Executor to close the modal dialog box, as a normal element identificaiton does not work (By.id, By.name, ...)
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", closeButton);
        Thread.sleep(2000);




        driver.quit();
    }
}
