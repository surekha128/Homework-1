package homework2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*
Homework – 2
Navigate to website "https://demo.nopcommerce.com/"
Click on register link.
Fill the all fields.
Click on register button.
Verify that the user register successfully.

 */
public class NopRegister {
    WebDriver driver;

    @Before

    public void setup() {
        String baseurl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.get(baseurl);
    }

    @Test
    public void verifyregisterpageonnopcommerce() {
       /* String baseurl = "https://demo.nopcommerce.com/";
        driver.get(baseurl);*/
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // driver.findElement(By.xpath("//div[@id='gender']/span/input[@id='gender-male']")).click();
      //  WebElement gender = driver.findElement(By.xpath("//div[@id='gender']/span[@class='female']/input[@id='gender-female']"));
     //   gender.sendKeys("female");

        WebElement firstname = driver.findElement(By.xpath("//div[@class='inputs']/input[@id='FirstName']"));
       // WebElement firstname = driver.findElement(By.xpath("//input[contains(@name,'FirstName')]"));
        firstname.sendKeys("lopp");


        WebElement lastname = driver.findElement(By.xpath("//input[contains(@name,'LastName')]"));
        lastname.sendKeys("cru");

        WebElement dateofbirth = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        dateofbirth.sendKeys("26");

        WebElement dateofmonth = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        dateofmonth.sendKeys("March");


        WebElement dateofbirthyear = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        dateofbirthyear.sendKeys("1995");

        WebElement email = driver.findElement(By.xpath("//input[@name='Email']"));
        email.sendKeys("wot@gmail.com");


        WebElement companyname = driver.findElement(By.xpath("//input[@name='Company']"));
        companyname.sendKeys("hit");

        WebElement newsletter = driver.findElement(By.xpath("//input[@name='Newsletter']"));
        newsletter.sendKeys("Newsletter");

        WebElement password = driver.findElement(By.xpath("//input[@name='Password']"));
        password.sendKeys("cartoon");

        WebElement confirmpassword = driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
        confirmpassword.sendKeys("cartoon");

        WebElement registerbtn = driver.findElement(By.xpath(" //button[@name='register-button']"));
        registerbtn.click();

       String expectedMessage = "Your registration completed";

        WebElement errorMessage = driver.findElement(By.xpath("//div[text()='Your registration completed']"));String actualMessage = errorMessage.getText();

       Assert.assertEquals("User is not Register Successfully..",expectedMessage,actualMessage);
    }

    }
