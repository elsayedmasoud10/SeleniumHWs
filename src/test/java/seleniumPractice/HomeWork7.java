package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork7 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");

       WebElement text=driver.findElement(By.xpath("//div[@id='textattr']"));
       String text1 =text.getText();
       System.out.println("text:"+ text1);
        Thread.sleep(1000);


        WebElement radioB1=driver.findElement(By.xpath("(//label[@class='radio-inline'])[1]"));
       Boolean B1=radioB1.isEnabled();
        System.out.println(B1);
        radioB1.click();
        Thread.sleep(1000);


        WebElement disable=driver.findElement(By.xpath("//input[@value='tech_talk']"));
        Boolean TechTalk=disable.isDisplayed();
        if (TechTalk){
            System.out.println("it is "+TechTalk+ " and Disable ");
        }else {
            System.out.println("it is" + TechTalk + "and Enable");
        }
        Thread.sleep(1000);


        WebElement clickButton=driver.findElement(By.xpath("//button[@onClick='toggleHiddenRadio(event)']"));
        clickButton.click();
        Thread.sleep(1000);

       WebElement Art= driver.findElement(By.xpath("//input[@value='art_exhibition']"));
       Art.click();
        Thread.sleep(1000);

        // need attribute , i get text only but still working

        WebElement Text2=driver.findElement(By.xpath("//div[@id='hidden_message']"));
        String Text=Text2.getText();
        System.out.println(Text);


        // try to make if else with click . lol

       WebElement checkBox1 =driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
        Boolean Box1=checkBox1.isEnabled();
        if (checkBox1.isEnabled()){
            checkBox1.click();

        }else {
            System.out.println("is not Enable ");
        }

        WebElement checkBox2 =driver.findElement(By.xpath("//input[@name='disabledCheckbox']"));
        Boolean Box2=checkBox2.isEnabled();
        if (checkBox2.isEnabled()){
            checkBox2.click();

        }else {
            System.out.println("is not Enable it is Disable  ");
        }



















    }
}
