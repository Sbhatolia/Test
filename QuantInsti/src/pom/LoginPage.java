package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	@FindBy(xpath = "//input[contains(@type,'email')]")
	private WebElement emailIdtextbox;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pswdTextbox;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;
	
public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		}


public void loginToApplication(WebDriver driver ,String username, String pswd) throws InterruptedException{
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(emailIdtextbox)).click();
	emailIdtextbox.sendKeys(username);
	pswdTextbox.sendKeys(pswd);
	loginButton.click();
	Thread.sleep(10000);
	}



}