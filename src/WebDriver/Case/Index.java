package WebDriver.Case;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import org.openqa.selenium.firefox.FirefoxDriver;

import WebDriver.Brower.*;;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
//		Brower.setup("C:\\Demo1\\index.html","FF");
		driver.get("C:\\Demo2\\index.html");
		driver.findElement(By.xpath(".//*[@id='mn-menu1']/li[1]/div")).click();
		driver.findElement(By.xpath(".//*[@id='mn-menu1']/li[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='mn-menu1']/li[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='mn-menu1']/li[1]/ul/li[3]/a")).click();
		String currentUser=driver.findElement(By.xpath(".//*[@id='lay-header']/div/div[2]/div[1]/a")).getText();
		System.out.println(currentUser);
		String logOut=driver.findElement(By.xpath(".//*[@id='lay-header']/div/div[2]/div[2]/a")).getText();
		System.out.println(logOut);
		String help=driver.findElement(By.xpath(".//*[@id='lay-header']/div/div[2]/div[3]/a")).getText();
		System.out.println(help);	
		
		driver.findElement(By.xpath(".//*[@id='mn-menu1']/li[1]/ul/li[1]/a")).click();
        

	}

}
