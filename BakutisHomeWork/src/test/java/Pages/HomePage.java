package Pages;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageParameters {
	
	//1. Lokatoriai
	
	By selectionSignUp = By.cssSelector("#signin2");
	By inputUserName = By.xpath("//input[@id='sign-username']");
	By inputPsw = By.xpath("//input[@id='sign-password']");
	By buttonSignUp = By.xpath("//button[normalize-space()='Sign up']");
	By buttonClose = By.xpath("//div[@id='signInModal']//button[@type='button'][normalize-space()='Close']");
	//By selectionLogIn = By.xpath("//a[normalize-space()='Log in']");
	//By selectionLogIn = By.id("login2");
	By selectionLogIn = By.cssSelector("#login2");
	By inputLoginUserName = By.id("loginusername");
	//By inputLoginPsw = By.xpath("//div[@class='modal fade show']//input[@type='password']");
	By inputLoginPsw = By.id("loginpassword");
	//By buttonLogIn = By.xpath("//button[normalize-space()='Log in']");
	By buttonLogIn = By.cssSelector("button[onclick='logIn()']");
	//By closeLogin = By.xpath("//div[@class='modal fade show']//button[@type='button'][normalize-space()='Close']");
	
	By closeLogin = By.cssSelector("div[id='logInModal'] div[class='modal-footer'] button:nth-child(1)");
	
	By buttonLogout = By.xpath("//a[normalize-space()='Log out']");
	By buttonHome = By.xpath("//li[@class='nav-item active']//a[@class='nav-link']");
	
	

	//2. Konstruktorius
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	//3. Metodai

	// Sukurti naudotojo paskyrą
	
	public void CreateUser() throws InterruptedException {
		driver.findElement(selectionSignUp).click();
		Thread.sleep(2000);
		driver.findElement(inputUserName).sendKeys("labadiena123456789999");
		driver.findElement(inputPsw).sendKeys("labadiena1234567899");
		Thread.sleep(2000);
		driver.findElement(buttonSignUp).click();
	}
	
	// Kurti naudotoja, bet pasirkti close 
	
	public void CloseSignUp() throws InterruptedException {
		driver.findElement(selectionSignUp).click();
		Thread.sleep(2000);
		driver.findElement(inputUserName).sendKeys("labadiena123456789999");
		driver.findElement(inputPsw).sendKeys("labadiena1234567899");
		Thread.sleep(2000);
		driver.findElement(buttonClose).click();		
	}
	
	public void SignUpNoPsw() throws InterruptedException {
		driver.findElement(selectionSignUp).click();
		Thread.sleep(2000);
		driver.findElement(inputUserName).sendKeys("labadiena123456789999");
		driver.findElement(buttonSignUp).click();
	}
	
	public void ExistingUser() throws InterruptedException {
		driver.findElement(selectionSignUp).click();
		Thread.sleep(2000);
		driver.findElement(inputUserName).sendKeys("labadiena123456789999");
		driver.findElement(inputPsw).sendKeys("labadiena1234567899");
		Thread.sleep(2000);
		driver.findElement(buttonSignUp).click();
	}
	
	public void LogIn(String username,String password) throws InterruptedException {
		driver.findElement(selectionLogIn).click();
		Thread.sleep(2000);
		driver.findElement(inputLoginUserName).clear();
		driver.findElement(inputLoginUserName).sendKeys(username);
		driver.findElement(inputLoginPsw).clear();
		driver.findElement(inputLoginPsw).sendKeys(password);
		driver.findElement(buttonLogIn).click();
		Thread.sleep(2000);
		String actualMessage = driver.findElement(By.cssSelector ("#nameofuser")).getText();
		System.out.println(actualMessage);
		Thread.sleep(2000);
		String expectedMessage = "Welcome labadiena123";
		assertEquals(expectedMessage,actualMessage);
		System.out.println("Prisijungimo tekstas yra: " +actualMessage);
	}
	
	public void CloseLogin() throws InterruptedException {
		driver.findElement(selectionLogIn).click();
		Thread.sleep(2000);
		driver.findElement(inputLoginUserName).clear();
		driver.findElement(inputLoginUserName).sendKeys("labadiena123");
		driver.findElement(inputLoginPsw).clear();
		driver.findElement(inputLoginPsw).sendKeys("labadiena123");
		Thread.sleep(2000);
		driver.findElement(closeLogin).click();		
	}
	
	public void LoginNoPsw() throws InterruptedException {
		driver.findElement(selectionLogIn).click();
		Thread.sleep(2000);
		driver.findElement(inputLoginUserName).clear();
		driver.findElement(inputLoginUserName).sendKeys("labadiena123");
		Thread.sleep(2000);
		driver.findElement(buttonLogIn).click();
	}
	
	public void LoginIncorrect() throws InterruptedException {
		driver.findElement(selectionLogIn).click();
		Thread.sleep(2000);
		driver.findElement(inputLoginUserName).clear();
		driver.findElement(inputLoginUserName).sendKeys("labadiena123");
		driver.findElement(inputLoginPsw).clear();
		driver.findElement(inputLoginPsw).sendKeys("labadiena");
		Thread.sleep(2000);
		driver.findElement(buttonLogIn).click();
	}
	
	public void LogOut() {
		driver.findElement(buttonLogout).click();
	}
	
	public void GoHome() {
		driver.findElement(buttonHome).click();
	}
	
	
	
	// Persijungti į alertą ir spausti ok
	
	public void WebAlert() throws Exception, AWTException {
				 
		      Thread.sleep(5000);
		             Alert alert = driver.switchTo().alert();
		             System.out.println(alert.getText());
		             alert.accept();          
	}
	
}	 
