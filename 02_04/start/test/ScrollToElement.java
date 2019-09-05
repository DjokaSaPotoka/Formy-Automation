import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Setup\\Selenium\\Selenium_Java\\ChrWebDriver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        Thread.sleep(2000);
        WebElement fullName = driver.findElement(By.id("name"));
        Thread.sleep(2000);
        // scroll down to the bottom of the page where the Full Name enter field is located
        Actions actions = new Actions(driver);
        actions.moveToElement(fullName);
        //WebElement fullName = driver.findElement(By.name("name"));

        Thread.sleep(2000);
        //WebElement fullName = driver.findElement(By.name("name"));
        // Now enter a full name, because  the Full Name enter filed is visible
        fullName.sendKeys("Djoka Sa Potoka");

        //Find a date element and enter any date
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("22/4/1963");


        driver.quit();
    }
}
