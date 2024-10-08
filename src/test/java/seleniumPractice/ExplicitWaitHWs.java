package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class ExplicitWaitHWs {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");


      WebElement click1= driver.findElement(By.xpath("//button[@id='changetext_button']"));
      click1.click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));
       WebElement text1=driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(text1.getText());



        WebElement click2= driver.findElement(By.xpath("//button[@id='enable_button']"));
        click2.click();

         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-default'])[3])")));
        WebElement t2=driver.findElement(By.xpath("(//button[@class='btn btn-default'])[3]"));
        t2.click();


        WebElement click3= driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        click3.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkbox']")));
        WebElement t3=driver.findElement(By.xpath("//input[@id='checkbox']"));
        t3.isSelected();

        }
    }







    //wait not working !!!