package Hithaaa;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Contactus {
	@Test
	public void hiiii() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./DDD/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		 Set<String> windows = driver.getWindowHandles();
		    Iterator<String> it = windows.iterator();
		    String parentId = it.next();
		    String childId = it.next();
		    driver.switchTo().window(childId);
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Hithesh CN");
		    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("hitheshnagaraju17@gmail.com");
		    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9686910676");
		    driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Helloo qualitest"); 
		    driver.findElement(By.xpath("//input[@class='btn']")).click();
		    driver.quit();
	
	}
}
