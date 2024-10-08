package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalendarWithNavigation {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");
        driver.manage().window().maximize();

        WebElement calander1 = driver.findElement(By.xpath("//input[@id='from_date']"));
        calander1.click();

        boolean isfound=false;
        while (!isfound) {
            WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            WebElement year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
            String currentMonth = month.getText();
            String currentYear = year.getText();
            if (currentMonth.equals("January") && currentYear.equals("2025")) {
                //select the date
                List<WebElement> allDates = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
                for(WebElement date:allDates){
                    if(date.getText().equals("4")){
                        date.click();
                        isfound=true;
                        break;
                    }
                }
            } else {
                //click on next button
                WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nextBtn.click();
            }
        }

    }
}
