package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHWs {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");

       WebElement birthday= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
       birthday.click();
       Thread.sleep(1000);
        Alert alert= driver.switchTo().alert();
        alert.accept();


        WebElement confirm= driver.findElement(By.xpath("//button[@style='background:yellow;']"));
        confirm.click();
        Thread.sleep(1000);
        Alert alert2= driver.switchTo().alert();
        alert2.dismiss();

        WebElement name= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        name.click();
        Thread.sleep(1000);
        Alert alert3= driver.switchTo().alert();
        alert3.sendKeys("Elsayed Masoud");
        alert3.accept();



    }
}
