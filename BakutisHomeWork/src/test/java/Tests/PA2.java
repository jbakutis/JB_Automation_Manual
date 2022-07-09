package Tests;

import org.testng.annotations.Test;
import java.util.ArrayList;

import Pages.HomePage;

public class PA2 extends TestsParameters{


	@Test
	public void PA2PS1() throws Exception {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		
		//imam duomenis is data.txt failo
		ArrayList<String> data = getTestDataArray("src/test/resources/data.txt");
		int a = data.size();
		for(int i=0; i < a-1 ; i++); {
		int i = 0;
		String[] value= data.get(i).split(",",2);
		HomePage hp = new HomePage(driver);
				
		hp.LogIn(value[0],value[1]);
		}
	}
	
	@Test
	public void PA2AS1() throws Exception {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		HomePage hp = new HomePage(driver);
		hp.CloseLogin();	
	}
	
	@Test
	public void PA2AS2() throws Exception {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		HomePage hp = new HomePage(driver);
		hp.LoginNoPsw();
		hp.WebAlert();
	}
	
	@Test
	public void PA2AS3() throws Exception {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		HomePage hp = new HomePage(driver);
		hp.LoginIncorrect();
		hp.WebAlert();
	}	
}
