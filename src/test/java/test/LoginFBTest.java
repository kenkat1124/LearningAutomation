package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginFbPage;

public class LoginFBTest {
    WebDriver driver;
    LoginFbPage loginFbPage ;
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void validLogin(){
        loginFbPage= new LoginFbPage(driver);
        loginFbPage.enterEmail();
        loginFbPage.enterPassword();
        loginFbPage.clickLoginButton();
    }
    @AfterTest public void teardown () {
        driver.quit();
    }
}
