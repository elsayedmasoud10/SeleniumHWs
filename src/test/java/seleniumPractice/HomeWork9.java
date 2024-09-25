package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork9 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        WebElement newsLetter= driver.findElement(By.xpath("//input[@id='newsletter']"));
        if(newsLetter.isEnabled()){
            newsLetter.click();
        }

        List<WebElement> hobbies=driver.findElements(By.xpath("//input[@class='cb-element']"));
        for (WebElement hobbies1:hobbies) {
            if (hobbies1.getAttribute("id").equalsIgnoreCase("reading") || hobbies1.getAttribute("id").equalsIgnoreCase("cooking")) {
                hobbies1.click();
            }
        }
            WebElement SupportCb=driver.findElement(By.xpath("//input[@value='Support']"));
            WebElement MusicCb=driver.findElement(By.xpath("//input[@value='Music']"));
            if (!SupportCb.isDisplayed() && !MusicCb.isDisplayed())
            {
                WebElement Button1=driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
                Button1.click();
                Thread.sleep(2000);
                MusicCb.click();
            }
          WebElement RNCb=driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
            if(!RNCb.isEnabled()) {
                WebElement EnableCb = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
                EnableCb.click();
                RNCb.click();
            }

    }
}
