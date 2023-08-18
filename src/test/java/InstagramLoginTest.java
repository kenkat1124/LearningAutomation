import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InstagramLoginTest
{
    @Test
    public void login () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com/");

        Thread.sleep(2000);
        WebElement password= driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("abctest");




    }

}
