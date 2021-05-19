package google;

/*
Navigate to google https://www.google.com/
In Goole search type "nopCommerce demo store" and click search
Click on the link "nopCommerce demo store"
Click on Computers and Verify that the user successfully navigated to Computers page.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleNopCommerce{
    WebDriver driver;
    @Before
    public void setup(){
        String baseurl = "https://www.google.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseurl);
    }
    @After
    public void closebrowser(){
        driver.quit();
    }
//In Goole search type "nopCommerce demo store" and click search
//Click on the link "nopCommerce demo store"
@Test
    public void nopcommercewebsiteopeningooglesearch() {

    // WebElement url = driver.findElement(By.tagName("input"));
    // url.sendKeys("https://demo.nopcommerce.com/");
    //  url.submit();
    String baseurl = "https://demo.nopcommerce.com/";
    driver.get(baseurl);
    driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[1]")).click();

}
}

