package google;
/*
Navigate to google https://www.google.com/
In Goole search type "nopCommerce demo store" and click search
Click on the link "nopCommerce demo store"
Click on Electronics and Verify that the user successfully navigated to Electronics page.
Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.

 */
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class runsecondtime {

        WebDriver driver;

        @Before
        public void openagaingoogle() {
            String baseurl = "https://www.google.com/";
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
            driver.get(baseurl);
        }
    @After
    public void closebrowser(){
        driver.quit();

    }
        //Click on Electronics and Verify that the user successfully navigated to Electronics page.
//Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.
        @Test
        public void opennopcommerce() {
            String baseurl = "https://demo.nopcommerce.com/";
            driver.get(baseurl);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[2]")).click();


        }
        //Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.
        @Test
    public void Apparel(){
            String baseurl="https://demo.nopcommerce.com/";
            driver.get(baseurl);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[3]")).click();
        }
        @Test
    public void Digitaldownloads(){
            String baseurl="https://demo.nopcommerce.com/";
            driver.get(baseurl);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[4]")).click();
        }

        @Test
    public void Books(){
            String baseurl="https://demo.nopcommerce.com/";
            driver.get(baseurl);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[4]")).click();
        }

        @Test
    public void Jewelry(){
            String baseurl="https://demo.nopcommerce.com/";
            driver.get(baseurl);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[4]")).click();
        }
@Test
        public void Giftcards(){
            String baseurl="https://demo.nopcommerce.com/";
            driver.get(baseurl);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[5]")).click();
        }


}

