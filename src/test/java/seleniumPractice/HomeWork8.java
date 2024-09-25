package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork8 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");
        Thread.sleep(2000);


        WebElement drink = driver.findElement(By.xpath("//input[@value='Juice']"));
        drink.click();
        Thread.sleep(2000);


       /*
        List<WebElement> Work =driver.findElements(By.xpath("//input[@name='working_enviroment']"));
        for (WebElement W:Work)
        {if
        Work.click();
        Thread.sleep(2000);
        */

        WebElement work = driver.findElement(By.xpath("//input[@value='hybrid']"));
        work.click();
        Thread.sleep(2000);


        WebElement Spring= driver.findElement(By.xpath("//input[@value='spring']"));
        WebElement winter= driver.findElement(By.xpath("//input[@value='winter']"));



        WebElement Button1 = driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
        Button1.click();
        Thread.sleep(2000);
        if (Button1.isEnabled()){
            Spring.click();
        }


        WebElement Button2 = driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        Button2.click();
        Thread.sleep(2000);
        if (Button2.isEnabled()){
            winter.click();
        }

       WebElement Lunch= driver.findElement(By.xpath("//input[@value='lunch']"));
        Lunch.click();





        }
    }






