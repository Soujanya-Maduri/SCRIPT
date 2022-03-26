package Testing.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\mindtreedec58\\AppData\\Local\\Packages\\Microsoft.MicrosoftEdge_8wekyb3d8bbwe\\TempState\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.getWindowHandle();
		Thread.sleep(3000L);
		System.out.println(driver.getTitle());	//driver.get("https://www.google.com");
		
		
	    driver.findElement(By.xpath("//*[@id=\'header\']/nav/div/div[2]/ul/li[2]/a")).click();
		//driver.findElement(By.xpath("//*[@id=\'Tabbed\']/a/button")).click();
		//.findElement(By.className("btn btn-info")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Soujanya");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Maduri");
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("soujanyamaduri@gmail.com");
	    driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9346610973");
	    driver.findElement(By.xpath("//input[@value='FeMale']")).click();
	    driver.findElement(By.xpath("//input[@value='Hockey']")).click();
	    driver.findElement(By.xpath("//option[@value='Analytics']")).click();
	   // driver.findElement(By.id("select2-country-container")).click();
	   Actions actions = new Actions(driver);
	   WebElement SwitchTo = driver.findElement(By.xpath("(//a[@href='SwitchTo.html'])[1]"));
	   actions.moveToElement(SwitchTo).perform();
	  Thread.sleep(5000L);
	  WebElement e=driver.findElement(By.xpath("//header[@id='header']/nav/div/div[2]/ul/li[4]/ul/li[1]/a"));

	  actions.moveToElement(e).click().perform();
	  driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();
	  Alert alert=driver.switchTo().alert();
	  Thread.sleep(5000L);
	  alert.accept();
	  
	  }
	

}
