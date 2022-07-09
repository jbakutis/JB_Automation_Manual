package Tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestsParameters {

	protected static WebDriver driver;
	
	@BeforeTest
	public static void SetUp() {
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public static void TearDown() {
		driver.manage().deleteAllCookies();
		driver.close();
	}
	
	public static ArrayList<String> getTestDataArray(String myFile) throws NumberFormatException, IOException {
			// for reading the file
			  // reading text file into ArrayList in Java 6
			  ArrayList<String> listOfLines = new ArrayList<String>();
			  String line;
			  
			FileReader FR = new FileReader(myFile);
			 BufferedReader BR = new BufferedReader(FR);
			 line = BR.readLine();
		  
		    
		    while (line != null) {
		      listOfLines.add(line);
		      line = BR.readLine();
		    }

		    BR.close();
		    System.out.println("Content of ArrayLiList:");
		    System.out.println(listOfLines);

			return listOfLines;	
		}
	
}
