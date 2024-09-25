package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");
        WebElement username =driver.findElement(By.id("fullName"));
        username.sendKeys("Elsayed Masoud");
        Thread.sleep(2000);

        WebElement email=driver.findElement(By.name("yourEmail"));
        email.sendKeys("ElsayedMasoud10");
        Thread.sleep(2000);


        WebElement client=driver.findElement(By.id("clientNameId"));
        client.sendKeys("Saif Elmasry");
        Thread.sleep(2000);


        WebElement clientId=driver.findElement(By.id("ClientId"));
        clientId.sendKeys("1234567890");
        Thread.sleep(2000);


        WebElement feedback=driver.findElement(By.id("ClientfeedbackId"));
        feedback.sendKeys("great feedback");
        Thread.sleep(2000);


        WebElement projectNameId=driver.findElement(By.id("ProjectNameId"));
        projectNameId.sendKeys("Syntax Tec");
        Thread.sleep(2000);


        WebElement ProjectTimeId=driver.findElement(By.id("ProjectTimeId"));
        ProjectTimeId.sendKeys("10 hours");
        Thread.sleep(2000);


        WebElement CurrentAddress=driver.findElement(By.name("CurrentAddress"));
        CurrentAddress.sendKeys("FairFax,VA");
        Thread.sleep(2000);


        WebElement PermanentAddress=driver.findElement(By.name("PermanentAddress"));
        PermanentAddress.sendKeys("United States");
        Thread.sleep(2000);

        WebElement submit=driver.findElement(By.id("btn-submit"));
        submit.click();
        Thread.sleep(2000);


        WebElement email1=driver.findElement(By.name("yourEmail"));
        email1.sendKeys("@gmail.com");
        Thread.sleep(2000);

        WebElement submit1=driver.findElement(By.id("btn-submit"));
        submit1.click();
        Thread.sleep(2000);

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)","");
        Thread.sleep(2000);


        WebElement here=driver.findElement(By.linkText("Click Here."));
        here.click();














    }
}
