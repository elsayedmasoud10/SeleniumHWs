package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImplicitWaitHWs {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");

       WebElement clickMe1= driver.findElement(By.xpath("//button[@class='btn btn-default']"));
       clickMe1.click();
       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//input[@value='Option-1']")));
        WebElement option1 =driver.findElement(By.xpath("//input[@value='Option-1']"));
        option1.isSelected();

    }
}