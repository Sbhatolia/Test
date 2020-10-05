package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {
	@FindBy(xpath = "(//span[contains(@class,'cart-count')])[1]")
	private WebElement cartCount;
	
	public HeaderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public int getCartCount() {
		int numberOfcartItem=Integer.parseInt(cartCount.getText());
		return numberOfcartItem;
	}

}
