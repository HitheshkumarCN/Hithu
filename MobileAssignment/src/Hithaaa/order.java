package Hithaaa;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class order {
	

	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./DDD/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
	    driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Hithesh");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Hithu@1997"); 
	    driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
	    driver.findElement(By.xpath("//a[.='All Mobiles']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//tbody[@id='myTable']/tr[1]/td[5]/a")).click();
	    Set<String> windows = driver.getWindowHandles();
	    Iterator<String> it = windows.iterator();
	    String parentId = it.next();
	    String childId = it.next();
	    driver.switchTo().window(childId);
	    driver.findElement(By.xpath("//div[@class='container']/div[1]/div[2]/form[1]/div[1]/div[1]/input")).sendKeys("hithesh");
	    driver.findElement(By.xpath("//div[@class='container']/div[1]/div[2]/form[1]/div[1]/div[2]/input")).sendKeys("hithu");
	    Thread.sleep(3000);
	    driver.findElement(By.id("inputEmail")).sendKeys("hitheshhithu161997@gmail.com");   
	    driver.findElement(By.id("inputPassword")).sendKeys("7899717");  
	    driver.findElement(By.id("flexRadioDefault1")).click();
	    driver.findElement(By.xpath("//input[@min='0']")).sendKeys("9686910676");
	    driver.findElement(By.xpath("//input[@id=' address1']")).sendKeys("Manyatha Embassy h2 building");
	    driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(" near ganesha temple backside sira");
	    driver.findElement(By.xpath("//input[@id='inputCity']")).sendKeys("Tumkur");
	    WebElement State=driver.findElement(By.xpath("//select[@id='inputState']"));
	    Select S=new Select (State);
	    S.selectByIndex(2);
	    driver.findElement(By.xpath("//input[@id='inputZip']")).sendKeys("572125");
	    driver.findElement(By.xpath("//input[@rel='apple']")).click();
	    driver.findElement(By.xpath("//input[@rel='samsung']")).click();
	    driver.findElement(By.xpath("//div[@class='apple']//option[2]")).click();
	    driver.findElement(By.xpath("//input[@placeholder='no of mobiles']")).sendKeys("2");
	    WebElement marvell = driver.findElement(By.id("bought"));
	    Select s3 = new Select(marvell);
	    s3.selectByIndex(1);
	    Thread.sleep(2000);
	    List<WebElement> a= driver.findElements(By.id("gridCheck1"));
	    a.get(0).click();
	    a.get(1).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
	
	}

}