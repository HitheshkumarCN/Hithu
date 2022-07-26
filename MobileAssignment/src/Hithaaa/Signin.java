package Hithaaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Signin {
	@Test
	public void quali() throws InterruptedException
	
	{
		
		
		System.setProperty("webdriver.chrome.driver", "./DDD/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
		driver.findElement(By.xpath("//a[@href='signup.html']")).click();
		driver.findElement(By.xpath("//input[@id='myName']")).sendKeys("Hithesh");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Hitha");
		driver.findElement(By.xpath("//input[@type='Email']")).sendKeys("hitheshnagaraju17@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Hithu@17");
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("17-12-1998");
		driver.findElement(By.xpath("//div[@class='col-md-2']/input[@type='radio']")).click();
		driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("9686910676");
		driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Hiii qualitest team");	
		driver.findElement(By.xpath("//button[@class='btn btn-info form-control']")).click();
		Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@type='Submit']")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("hithesh");
        driver.findElement(By.id("password")).sendKeys("hithesh@1998");
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();

        driver.quit();

}
}
//button[@class='btn btn-info form-control']