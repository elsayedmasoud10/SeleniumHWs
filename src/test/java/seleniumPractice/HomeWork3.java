package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(2000);

        driver.get("https://www.syntaxprojects.com");
        String title=driver.getTitle();
        System.out.println(title);
        Thread.sleep(2000);

        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.quit();




    }
}
