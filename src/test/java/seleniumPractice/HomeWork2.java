package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork2 {
    public static void main(String[] args) {

        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com");
        String url=driver.getCurrentUrl();
        System.out.println("url: "+url);
        String title=driver.getTitle();
        System.out.println("title: "+title);
        driver.quit();
    }
}
