import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Setup\\Selenium\\Selenium_Java\\ChrWebDriver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        fillForm (driver);

        //Synchronization :)
        waitForBanner(driver);

        // Use assertion to verify that the Welcome page is found
        String thanksText = driver.findElement(By.className("alert")).getText();

        assertEquals("The form was successfully submitted!", thanksText);
        System.out.println(thanksText);


        //
        assertEquals("Thanks for submitting your form", confirmBanner(driver));
        System.out.println(confirmBanner(driver));
        //System.out.println(thanksText);

        driver.quit();
    }

    public static void fillForm (WebDriver driver)
    {
        driver.findElement(By.id("first-name")).sendKeys("John");

        driver.findElement(By.id("last-name")).sendKeys("Doe");

        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("05/28/2019");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

    }

    public static void waitForBanner(WebDriver driver)
    {
        //Synchronization :)
        WebDriverWait waitForBanner = new WebDriverWait (driver, 20);
        waitForBanner.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")  ));

    }
    public static String confirmBanner (WebDriver driver)
    {
        WebDriverWait waitForThanks = new WebDriverWait(driver, 10);

        //WebElement navBar = waitForThanks.until(ExpectedConditions.visibilityOfElementLocated(By.className("navbar"))  );
        WebElement navBar = waitForThanks.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/h1")   )  );

        //String thanksForSubmittingForm = navBar.getText();
        return navBar.getText();

    }
}
