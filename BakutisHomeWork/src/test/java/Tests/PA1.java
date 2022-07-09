package Tests;

import org.testng.annotations.Test;
import Pages.HomePage;

public class PA1 extends TestsParameters{
	
	
	//pervadinau visus UMM i PA, nes toks buvo pvz paveiksliuke. Tai yra klaida einanti per visą dokumentaciją, nes ne UMM darom, o PA.
	
	@Test
	public void PA1PS1() throws Exception {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		
		HomePage hp = new HomePage(driver); //kvietimas paimti sukurtą metodus iš HomePage
		hp.CreateUser(); //norint sukurt ir negaut erroro, reikia pakeist duomenis
		hp.WebAlert();
	}
	
	@Test
	public void PA1AS1() throws Exception {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		HomePage hp = new HomePage(driver);
		hp.CloseSignUp();
	}
	
	@Test
	public void PA1AS2() throws Exception {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		HomePage hp = new HomePage(driver);
		hp.SignUpNoPsw();	
		hp.WebAlert();
	}
	
	@Test
	public void PA1AS3() throws Exception {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		HomePage hp = new HomePage(driver); 
		hp.ExistingUser();
		hp.WebAlert();
	}

}
