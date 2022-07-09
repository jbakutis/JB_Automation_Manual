package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageParameters {
	
	protected WebDriver driver;
	
	//super konstruktorius leidžia puslapiams bendrauti tarpusavy.
	public void PageParameters(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
