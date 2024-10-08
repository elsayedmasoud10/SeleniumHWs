package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DDHWs {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

        WebElement fruits = driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        fruits.click();
        Thread.sleep(1000);
        //ul[@class='dropdown-menu single-dropdown-menu']/li/a
        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));
        for (WebElement Option : options) {
            String OP = Option.getText();
            Thread.sleep(1000);

            if (OP.equalsIgnoreCase("pear")) {
                Option.click();
            }

        }

        WebElement Hobby = driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        Hobby.click();
        Thread.sleep(2000);

        List<WebElement> Hobby1 = driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']"));
        for (WebElement Hobby2 : Hobby1) {
            String HO = Hobby2.getText();
            Thread.sleep(1000);

            if (HO.equalsIgnoreCase("Cooking")) {
                Hobby2.click();

            }
        }
    }
}