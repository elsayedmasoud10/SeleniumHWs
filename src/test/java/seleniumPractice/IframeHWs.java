package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class IframeHWs {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");

        //iframe[@name='dropdown-iframe']
        WebElement frame1=driver.findElement(By.xpath("//iframe[@id='textfieldIframe']"));
        driver.switchTo().frame(0);
        WebElement username=driver.findElement(By.xpath("//input[@name='Username']"));
        username.sendKeys("Elsayed Masoud");
        driver.switchTo().defaultContent();


       WebElement frame2=driver.findElement(By.xpath("//iframe[@id='dropdownIframe']"));
       driver.switchTo().frame(1);
       WebElement city=driver.findElement(By.xpath("//select[@id='cities']"));
        Select sel=new Select(city);
        sel.selectByIndex(2);
        driver.switchTo().defaultContent();


        WebElement frame3=driver.findElement(By.xpath("///iframe[@id='dropdownIframe']"));
        driver.switchTo().frame(1);
        WebElement age=driver.findElement(By.xpath("//iframe[@name='checkbox-iframe']"));
        driver.switchTo().frame(0);
        age.click();





    }
    }
