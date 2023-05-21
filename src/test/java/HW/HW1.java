package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();


        WebElement createAccount= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createAccount.click();

        Thread.sleep(2000);

         driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Farah");
         driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mahyoub");
         driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("emai1@email.com");
         driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("emai1@email.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("qwert@123");

        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("January");
        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("1");
        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1990");

        driver.findElement(By.xpath("//label[@class='_58mt']")).click();

        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        driver.quit();

    }
}
