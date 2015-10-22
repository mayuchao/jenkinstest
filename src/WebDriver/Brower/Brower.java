package WebDriver.Brower;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Brower {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		WebDriver driver=new FirefoxDriver();
////		WebDriver IEdriver=new InternetExplorerDriver();
//		
//	}
	
	public static void setup (String url,String type) {
		    WebDriver driver;
//		    if(type=="FF"){
//		    	driver=new FirefoxDriver();
//		    }else
//		    	driver=new InternetExplorerDriver();
		    System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		    driver=new InternetExplorerDriver();
//		    driver=new ChromeDriver();
			
			driver.get(url);
		
	}

}
