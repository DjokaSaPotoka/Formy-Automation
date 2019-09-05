import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\Setup\\Selenium\\Selenium_Java\\ChrWebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton_1 = driver.findElement(By.id("radio-button-1"));
        radioButton_1.click();
        Thread.sleep(3000);
        WebElement radioButton_2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton_2.click();
        Thread.sleep(3000);

        WebElement radioButton_3 = driver.findElement(By.xpath("/html/body/div/div[3]/label"));
        radioButton_3.click();
        Thread.sleep(7000);
        radioButton_3.click();

       // WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        //Thread.sleep(5000);
        //radioButton1.click();
        //Thread.sleep(5000);
        //WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        //Thread.sleep(5000);
        //radioButton2.click();

        //Thread.sleep(5000);
        //WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        //radioButton3.click();
        //Thread.sleep(5000);
        driver.quit();
    }
}
