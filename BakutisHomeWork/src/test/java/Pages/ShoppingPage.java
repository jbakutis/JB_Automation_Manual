package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingPage extends PageParameters {

	//1. Lokatoriai
	
	By buttonSamsung = By.xpath("//a[normalize-space()='Samsung galaxy s6']");
	By buttonAddToCart = By.xpath("//a[normalize-space()='Add to cart']");
	By buttonCart = By.xpath("//a[normalize-space()='Cart']");
	By buttonDeleteProduct = By.xpath("//a[normalize-space()='Delete']");
	By buttonPlaceOrder = By.xpath("//button[normalize-space()='Place Order']");
	By inputName = By.xpath("(//input[@type='text'])[4]");
	By inputCountry = By.xpath("(//input[@type='text'])[5]");
	By inputCity = By.xpath("(//input[@type='text'])[6]");
	By inputCredit = By.xpath("(//input[@type='text'])[7]");
	By inputMonth = By.xpath("(//input[@type='text'])[8]");
	By inputYear = By.xpath("(//input[@type='text'])[9]");
	By buttonPurchase = By.xpath("(//button[normalize-space()='Purchase'])[1]");
	By buttonOk = By.xpath("(//button[normalize-space()='OK'])[1]");
	By buttonClosePurchase = By.xpath("(//button[@type='button'][normalize-space()='Close'])[3]");
	
	
	
	//2. Konstruktorius
	
	public ShoppingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//3. Metodai
	
	public void OpenProduct () {
		driver.findElement(buttonSamsung).click();
	}
	
	
	public void AddToCart () throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(buttonAddToCart).click();
		Thread.sleep(2000);

	}
	
	public void OpenCart () {
		driver.findElement(buttonCart).click();
	}
	
	public void DeleteProduct () throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(buttonDeleteProduct).click();
	}
	
	public void PlaceOrder () throws InterruptedException {
		driver.findElement(buttonPlaceOrder).click();
		Thread.sleep(2000);
		driver.findElement(inputName).sendKeys("Justin");
		driver.findElement(inputCountry).sendKeys("Ltu");
		driver.findElement(inputCity).sendKeys("vln");
		driver.findElement(inputCredit).sendKeys("123456");
		driver.findElement(inputMonth).sendKeys("Vasaris");
		driver.findElement(inputYear).sendKeys("1998");	
		Thread.sleep(2000);
		driver.findElement(buttonPurchase).click();
		Thread.sleep(2000);
		driver.findElement(buttonOk).click();
	}
	
	public void PlaceOrderError () throws InterruptedException {
		driver.findElement(buttonPlaceOrder).click();
		Thread.sleep(2000);
		driver.findElement(inputName).sendKeys("Justin");
		driver.findElement(inputCountry).sendKeys("Ltu");
		driver.findElement(inputCity).sendKeys("vln");
		driver.findElement(inputCredit).sendKeys("");
		driver.findElement(inputMonth).sendKeys("Vasaris");
		driver.findElement(inputYear).sendKeys("1998");	
		Thread.sleep(2000);
		driver.findElement(buttonPurchase).click();
	}
	
	public void ClosePurchase () throws InterruptedException {
		driver.findElement(buttonPlaceOrder).click();
		Thread.sleep(2000);
		driver.findElement(inputName).sendKeys("Justin");
		driver.findElement(inputCountry).sendKeys("Ltu");
		driver.findElement(inputCity).sendKeys("vln");
		driver.findElement(inputCredit).sendKeys("123456");
		driver.findElement(inputMonth).sendKeys("Vasaris");
		driver.findElement(inputYear).sendKeys("1998");	
		Thread.sleep(2000);
		driver.findElement(buttonClosePurchase).click();	
	}
}
