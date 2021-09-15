import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/BrowserDrivers/chromedriver.exe/");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        Thread.sleep(1000);
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("286,AshurtDrive,Ilford,UK");
        WebElement autocompleteResult = driver.findElement(By.className("col-sm-8 col-sm-offset-2"));
        autocompleteResult.click();


    }
}
