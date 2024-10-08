package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MutliSelectDD {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");


        WebElement Fav= driver.findElement(By.xpath("//select[@class='form-control']"));
        Fav.click();
        Select sel=new Select(Fav);
        sel.selectByIndex(2);
        Fav.click();

        WebElement FavHob=driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select SelectMultiple=new Select(FavHob);
        SelectMultiple.selectByIndex(1);
        SelectMultiple.selectByValue("Cooking");
        SelectMultiple.selectByVisibleText("Gardening");

       List<WebElement> Hobbies= driver.findElements(By.xpath("//select[@id='select_multi_hobbies']"));
       for (WebElement HOB:Hobbies){
           System.out.println(HOB.getText());
       }


    }
            }

