package Tests;

import org.testng.annotations.Test;
import java.util.ArrayList;

import Pages.HomePage;

public class PA3 extends TestsParameters {
	
	@Test
	public void PA3PS1() throws Exception {
	driver.navigate().to("https://www.demoblaze.com/index.html");
	
	//imam duomenis is data.txt failo
	
	ArrayList<String> data = getTestDataArray("src/test/resources/data.txt");
	int a = data.size();
	for(int i=0; i < a-1 ; i++); {
	int i = 0;
	String[] value= data.get(i).split(",",2);
	HomePage hp = new HomePage(driver);
	
	hp.LogIn(value[0],value[1]);
	hp.LogOut();
	}
}

}

