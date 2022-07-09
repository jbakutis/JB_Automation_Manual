package Tests;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.ArrayList;

import Pages.HomePage;
import Pages.ShoppingPage;

public class PA5 extends TestsParameters {

	@Test
	public void PA5_AM2PS1() throws InterruptedException, Exception, IOException {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		
		//imam duomenis is data.txt failo
		
		ArrayList<String> data = getTestDataArray("src/test/resources/data.txt");
		int a = data.size();
		for(int i=0; i < a-1 ; i++); {
		int i = 0;
		String[] value= data.get(i).split(",",2);
		HomePage hp = new HomePage(driver);
		ShoppingPage sp = new ShoppingPage(driver);

		
		hp.LogIn(value[0],value[1]);
		Thread.sleep(1000);
		sp.OpenProduct();
		}
	}
	
	@Test
	public void PA5_AM3PS1() throws Exception {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		
		//imam duomenis is data.txt failo
		
		ArrayList<String> data = getTestDataArray("src/test/resources/data.txt");
		int a = data.size();
		for(int i=0; i < a-1 ; i++); {
		int i = 0;
		String[] value= data.get(i).split(",",2);
		HomePage hp = new HomePage(driver);
		ShoppingPage sp = new ShoppingPage(driver);

				
		hp.LogIn(value[0],value[1]);
		Thread.sleep(2000);
		sp.OpenProduct();
		Thread.sleep(2000);
		sp.AddToCart();
		Thread.sleep(2000);
		hp.WebAlert();	
		}
	}
	
	@Test
	public void PA5_AM5PS1() throws Exception {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		
		//imam duomenis is data.txt failo
		
		ArrayList<String> data = getTestDataArray("src/test/resources/data.txt");
		int a = data.size();
		for(int i=0; i < a-1 ; i++); {
		int i = 0;
		String[] value= data.get(i).split(",",2);
		HomePage hp = new HomePage(driver);
		ShoppingPage sp = new ShoppingPage(driver);
				
		hp.LogIn(value[0],value[1]);
		Thread.sleep(2000);
		sp.OpenCart();
		}
	}
	
	@Test
	public void PA5_AM4PS1 () throws Exception {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		//imam duomenis is data.txt failo
		
		ArrayList<String> data = getTestDataArray("src/test/resources/data.txt");
		int a = data.size();
		for(int i=0; i < a-1 ; i++); {
		int i = 0;
		String[] value= data.get(i).split(",",2);
		HomePage hp = new HomePage(driver);
		ShoppingPage sp = new ShoppingPage(driver);

				
		hp.LogIn(value[0],value[1]);
		Thread.sleep(1000);
		sp.OpenCart();
		Thread.sleep(1000);
		sp.DeleteProduct();		
		}
	}
	
	
	@Test
	public void PA5_AM6PS1 () throws Exception {
		
		driver.navigate().to("https://www.demoblaze.com/index.html");
		
		//imam duomenis is data.txt failo
		
		ArrayList<String> data = getTestDataArray("src/test/resources/data.txt");
		int a = data.size();
		for(int i=0; i < a-1 ; i++); {
		int i = 0;
		String[] value= data.get(i).split(",",2);
		HomePage hp = new HomePage(driver);
		ShoppingPage sp = new ShoppingPage(driver);
		
		//Thread.sleep(2000);
		hp.LogIn(value[0],value[1]);	
		//Thread.sleep(2000);
		sp.OpenProduct();
	//	Thread.sleep(2000);
		sp.AddToCart();
	//	Thread.sleep(1000);
		hp.WebAlert();
	//	Thread.sleep(2000);
		sp.OpenCart();
	//	Thread.sleep(1000);
		sp.PlaceOrder();	
		}
	}
	

	@Test
	public void PA5_AM6AS1 () throws Exception {
		driver.navigate().to("https://www.demoblaze.com/index.html");
	
		//imam duomenis is data.txt failo
		
		ArrayList<String> data = getTestDataArray("src/test/resources/data.txt");
		int a = data.size();
		for(int i=0; i < a-1 ; i++); {
		int i = 0;
		String[] value= data.get(i).split(",",2);
		HomePage hp = new HomePage(driver);
		ShoppingPage sp = new ShoppingPage(driver);
		
		//Thread.sleep(2000);
		hp.LogIn(value[0],value[1]);	
		//Thread.sleep(2000);
		sp.OpenProduct();
		Thread.sleep(2000);
		sp.AddToCart();
		//Thread.sleep(1000);
		hp.WebAlert();
		//Thread.sleep(1000);
		sp.OpenCart();
		//Thread.sleep(1000);
		sp.PlaceOrderError();
		//Thread.sleep(2000);
		hp.WebAlert();			
		}
	}
	
	@Test
	public void PA5_AM6AS2 () throws Exception {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		//imam duomenis is data.txt failo
		
		ArrayList<String> data = getTestDataArray("src/test/resources/data.txt");
		int a = data.size();
		for(int i=0; i < a-1 ; i++); {
		int i = 0;
		String[] value= data.get(i).split(",",2);
		HomePage hp = new HomePage(driver);
		ShoppingPage sp = new ShoppingPage(driver);

				
		hp.LogIn(value[0],value[1]);
		Thread.sleep(2000);
		sp.OpenProduct();
		Thread.sleep(2000);
		sp.AddToCart();
		Thread.sleep(1000);
		hp.WebAlert();
		Thread.sleep(1000);
		sp.OpenCart();
		sp.ClosePurchase();	
		}
	}
}