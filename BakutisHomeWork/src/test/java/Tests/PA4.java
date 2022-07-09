package Tests;

import org.testng.annotations.Test;
import Pages.HomePage;

public class PA4 extends TestsParameters {
	
	@Test
	public void PA4_AM1PS1() throws Exception {
		driver.navigate().to("https://www.demoblaze.com/index.html");
	}
	
	@Test
	public void PA4_AM1PS2() throws Exception {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		HomePage hp = new HomePage(driver); //kvietimas paimti sukurtą metodus iš HomePage
		hp.GoHome();	
	}

}
