package Testing.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NOBROKER {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\mindtreedec58\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

			driver.get("https://nobroker.in");
			
		   
	driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9346610973");
    Thread.sleep(3000L);
	driver.findElement(By.xpath("//input[@value='password']")).click();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("souj1579");
	driver.findElement(By.id("signUpSubmit")).click();
		//driver.findElement(By.xpath("//div[@class='nb_3PfsOV']")).click();
			//driver.findElement(By.className("nb_3PfsOV")).click();
	}

}