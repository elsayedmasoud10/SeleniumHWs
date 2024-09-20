package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork4 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");

       WebElement hobbies=driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
       hobbies.sendKeys("Computer Science");


       WebElement favoriteMovies=driver.findElement(By.xpath("//input[@id='favoriteMoviesId']"));
       favoriteMovies.sendKeys("Fast & Furious");

      WebElement button=driver.findElement(By.xpath("//button[text()='Click Here']"));
      button.click();

      WebElement text=driver.findElement(By.xpath("//label[contains (text(),'amet consectetur adipisicing ')]"));
      String text1=text.getText();
        System.out.println(text1);

        WebElement city=driver.findElement(By.xpath("//input[@id='yourCity']"));
        city.sendKeys("VA, Fairfax");

        WebElement email=driver.findElement(By.xpath("//input[@id='PersonalEmailID']"));
        email.sendKeys("Elsayedmasoud10@gmail.com");

        WebElement clientName=driver.findElement(By.xpath("//input[@name='clientName' and @id='clientName']"));
        clientName.sendKeys("Elsayed Masoud");

       WebElement clientId=driver.findElement(By.xpath("//input[@name='clientId' and @data-detail='two']"));
       clientId.sendKeys("112233445566");

       WebElement streetName=driver.findElement(By.xpath("//input[@name='StreetNo']"));
       streetName.sendKeys("lake gken Rd");


        WebElement House=driver.findElement(By.xpath("//input[@name='HouseNo']"));
        House.sendKeys("12345");





    }
}
