package homework4;

import com.google.common.base.Verify;
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
Homework – 4
https://opensource-demo.orangehrmlive.com/
( Username : Admin | Password : admin123 )
Enter username
Enter password
Click login
Verify that the text “Welcome Paul”
After Paul one symbol there so click on symbol for logout.
Verify that the below text.
LOGIN Panel

 */
public class OrangeHRM {
    WebDriver driver;
 @Before
         public void openwebsite() {
     String baseurl = "https://opensource-demo.orangehrmlive.com/";
     System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get(baseurl);

 }
 @After
    public void closeallactivity(){
     driver.quit();
 }
 @Test
    public void testingloginprocess() {

     WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
     username.sendKeys("Admin");

     WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
     password.sendKeys("admin123");

     WebElement loginbutton = driver.findElement(By.xpath("//input[@name='Submit']"));
     loginbutton.click();

      WebElement welcome = driver.findElement(By.xpath("//a[@id='welcome']"));
         welcome.click();

         WebElement logout = driver.findElement(By.linkText("Logout"));
         logout.click();




    String expectedresult = ("LOGIN Panel");

     WebElement errormessage = driver.findElement(By.xpath("//div[@id='logInPanelHeading']"));

     String actualerroeresult = errormessage.getText();

     Assert.assertEquals("LOGIN Panel",expectedresult,actualerroeresult);

     }
 }

