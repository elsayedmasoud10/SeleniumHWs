package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css1 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");



       WebElement userId=driver.findElement(By.cssSelector("input[id=UserID]"));
       userId.sendKeys("Elsayed");

        WebElement A=driver.findElement(By.cssSelector(" input[id=UserName]"));
        A.sendKeys("Masoud ");


        WebElement b=driver.findElement(By.cssSelector("input[name*='LectureIntro'] "));
        b.sendKeys("abcdefg");

        WebElement c=driver.findElement(By.cssSelector("input[id*='FeedbackFromRay'] "));
        c.sendKeys("abcdefg");

        WebElement d=driver.findElement(By.cssSelector(" input[id*='FeedbackfromDucky']"));
        d.sendKeys("123456");

        WebElement clientID=driver.findElement(By.cssSelector(" input[name*='ClientID']"));
        clientID.sendKeys("Elsayed1234");

        WebElement clientEmail=driver.findElement(By.cssSelector(" input[name*='email']"));
        clientEmail.sendKeys("elsayedmasoud10@gmail.com");

        WebElement g=driver.findElement(By.cssSelector("input[name*='CourseTopic'] "));
        g.sendKeys("Syntax");





            }
}
