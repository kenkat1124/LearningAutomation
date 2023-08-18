import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestFb
{WebDriver driver;
    @BeforeTest
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();


    }
    @Test(description = "login with valid credentials")
    public void validLogin(){
        driver.get("https://www.facebook.com/");
        //WebElement email= driver.findElement(By.xpath("//*[@id='email']"));
        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("abc@gmail.com");
        WebElement password=driver.findElement(By.id("pass"));
        password.sendKeys("test123");
        WebElement loginButton=driver.findElement(By.name("login"));
        loginButton.click();


    }

    @Test(description = "login with invalid credentials")
    public void invalidLogin() {
        driver.get("https://www.facebook.com/");
        //WebElement email= driver.findElement(By.xpath("//*[@id='email']"));
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("abc@gmail.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("test123");
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='_9ay7']"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }
    @AfterTest public void teardown (){
        driver.quit();
    }
}
