package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginFbPage {
    WebDriver driver;


    @CacheLookup
    @FindBy(how = How.ID, using ="email")
    WebElement email;
    @CacheLookup
    @FindBy(how = How.ID, using ="pass")
    WebElement password;

    @CacheLookup
    @FindBy(how = How.NAME, using ="login")
    WebElement loginButton;

    public LoginFbPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterEmail(){
        email.sendKeys("abc@gmail.com");
    }
    public void enterPassword(){
        password.sendKeys("Password12345");
    }

    public void clickLoginButton(){
        loginButton.click();
    }

}
