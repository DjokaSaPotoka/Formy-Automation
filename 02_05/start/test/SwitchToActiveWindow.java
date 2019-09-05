import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Setup\\Selenium\\Selenium_Java\\ChrWebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement openNewTabButton = driver.findElement(By.id("new-tab-button"));
        Thread.sleep(2000);

        String originalWinHandleB = driver.getWindowHandle();
        System.out.println("originalWinHandle BEFORE click" + originalWinHandleB);
        openNewTabButton.click();
        Thread.sleep(2000);
        String originalWinHandle = driver.getWindowHandle();
        System.out.println("originalWinHandle AFTER click" + originalWinHandle);
        //>>>>
        String arr[]={"hi","hello","bye"};
        for (String str : arr) {
            System.out.println(str);
        }

        //>>>>

        int i = 1;
        for(String handles1: driver.getWindowHandles())
        {
            driver.switchTo().window(handles1);
            System.out.println("Iteration " + Integer.toString(i) + ", handles1 " + handles1);
            Thread.sleep(4000);
            i++;
        }

        driver.switchTo().window(originalWinHandle);
        System.out.println("It seems that we are back to the Original Win Handle " + originalWinHandle);
        Thread.sleep(2000);
        driver.quit();
    }
}
