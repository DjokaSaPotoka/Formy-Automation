import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import static java.lang.System.*;

public class Dropdown {
    public static void main(String[] args) throws Exception{

        setProperty("webdriver.chrome.driver", "C:\\Setup\\Selenium\\Selenium_Java\\ChrWebDriver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"  )  );
        dropDown.click();
        Thread.sleep(5000);
        WebElement autoComplete = driver.findElement(By.id("autocomplete") );
        Thread.sleep(5000);
        autoComplete.click();
        Thread.sleep(5000);
        //System.out.println("Autocomplete selected? " + Boolean.toString(autoComplete.isSelected()));
        //out.println(autoComplete.isSelected());
        driver.quit();
    }
}
