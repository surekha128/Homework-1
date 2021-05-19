package homework3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

/*
Homework - 3
Open url : http://automationpractice.com/index.php
Click on Sign In
Enter correct Email in Email field
Enter wrong Password in Password field
Click on Sign In button.
Expected Result:
Error Message “There is 1 error”

 */
public class yourlogo {
    WebDriver driver;

    @Before

    public void logintowebsite() {
        String baseurl = "http://automationpractice.com/index.php";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);
    }
@After
public void closebrowser(){
    driver.quit();
}
    @Test
    public void runloginpage(){

        WebElement signup = driver.findElement(By.xpath("//a[@class='login']"));
        signup.click();

        WebElement emailid = driver.findElement(By.xpath("//input[@id='email']"));
        emailid.sendKeys("abc12@yahoo.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
        password.sendKeys("ab");

        WebElement signin = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
        signin.click();


      String expectedresult = ("There is 1 error");

      WebElement errormessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']/p"));

      String actualerroeresult = errormessage.getText();

        Assert.assertEquals("Error not display",expectedresult,actualerroeresult);
    }

}