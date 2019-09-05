// Description: Selecting check boxes, using the Radiobutton class
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class Radiobuttons {
    public static void main(String[] args) throws Exception{

        System.setProperty("webdriver.chrome.driver", "C:\\Setup\\Selenium\\Selenium_Java\\ChrWebDriver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
        for (int i = 0;i < 4; i++) {
            checkBox1.click();
            System.out.println(checkBox1.isSelected());
            Thread.sleep(4000);
        }

        WebElement checkBox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']") );
        for (int i = 0;i < 4; i++) {
            checkBox2.click();
            System.out.println(checkBox2.isSelected());
            Thread.sleep(4000);
        }

        WebElement checkBox3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]")  );
        for (int i = 0;i < 4; i++) {
            checkBox3.click();
            System.out.println(checkBox3.isSelected());
            Thread.sleep(4000);
        }
        driver.quit();
    }
}
