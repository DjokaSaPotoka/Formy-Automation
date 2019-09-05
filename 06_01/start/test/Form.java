import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\Setup\\Selenium\\Selenium_Java\\ChrWebDriver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.findElement(By.id("first-name")).sendKeys("Joe");
        driver.findElement(By.id("last-name")).sendKeys("Peric");
        driver.findElement(By.id("job-title")).sendKeys("SiomigaDjura") ;
        driver.findElement(By.id("radio-button-2")).click(); // college
        Thread.sleep(4000);
        driver.findElement(By.id("checkbox-1") ).click(); // male
        Thread.sleep(4000);
        //driver.findElement(By.cssSelector("input[value='checkbox-1']")).click(); // year of experiene
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("option [value='1']") ).click();
        Thread.sleep(4000);
        driver.findElement(By.id("datepicker" )).sendKeys("04/22/1960");
        driver.findElement(By.id("datepicker" )).sendKeys (Keys.RETURN );


        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated( By.className(".btn.btn-lg.btn-primary"))  );
       Thread.sleep(4000);

        // submit the form
        driver.findElement(By.className(".btn .btn-lg .btn-primary" )  ).click();



        driver.quit();
    }
}
