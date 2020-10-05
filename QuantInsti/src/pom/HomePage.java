package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	@FindBy(xpath = "//span[@class='content'][contains(.,'Login')]")
	private WebElement loginButton;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		}
	public void clickOnLoginbutton(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(loginButton)).click();
		
	}
	 

}
