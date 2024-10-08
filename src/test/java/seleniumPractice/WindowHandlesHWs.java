package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandlesHWs {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");


       WebElement Button1= driver.findElement(By.xpath("//a[@target='_blank']"));
       Button1.click();
        System.out.println("page 1 is open");

        WebElement Button2= driver.findElement(By.xpath("(//a[@target='_blank' or class='btn btn-primary'])[2]"));
        Button2.click();
        System.out.println("page 2 is open");

        String Win1=driver.getWindowHandle();
        System.out.println(Win1);

        Set<String> allWin=driver.getWindowHandles();
        for (String all:allWin){
            driver.switchTo().window(all);
            if (driver.getCurrentUrl().equalsIgnoreCase("https://syntaxprojects.com/b2-page.php"));
            break;

        }
        System.out.println(driver.getCurrentUrl());

        WebElement text=driver.findElement(By.xpath("//h2"));
        System.out.println(text.getText());


    }
}














//didn't get the text from p2
