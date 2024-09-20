package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork5 {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");

        WebElement favoriteBook3=driver.findElement(By.xpath("//input[@class='form-control']/following-sibling::input[2]"));
        favoriteBook3.sendKeys("Egypt history");

        WebElement favoriteBook2=driver.findElement(By.xpath("//input[@class='form-control']/following-sibling::input[1]"));
        favoriteBook2.sendKeys("Egyption and proud");

        WebElement favoriteBook=driver.findElement(By.xpath("//input[@class='form-control']"));
        favoriteBook.sendKeys("Egypt ");

        WebElement favouriteBook1=driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        favouriteBook1.sendKeys("habibty ");


        WebElement favouriteBook2=driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        favouriteBook2.sendKeys("Hayati ");

        WebElement favouriteBook3=driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        favouriteBook3.sendKeys("Omry ");

        //div[@id='familyTree']/child::input[1]

        WebElement grandparents=driver.findElement(By.xpath(" //div[@id='familyTree']/child::input[1]"));
        grandparents.sendKeys("grand parents ");


        WebElement parents=driver.findElement(By.xpath(" //div[@id='familyTree']/child::input[2]"));
        parents.sendKeys("parents ");

        WebElement child=driver.findElement(By.xpath(" //div[@id='familyTree']/child::input[3]"));
        child.sendKeys("child ");








    }
}
