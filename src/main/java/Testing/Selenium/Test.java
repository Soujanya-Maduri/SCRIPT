package Testing.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\mindtreedec58\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
		//Maximizing Window
		driver.manage().window().maximize();

		driver.get("https://www.indiabookstore.net/");
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		
		WebElement search = driver.findElement(By.id("searchBox"));
		search.sendKeys("Selenium");
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//img[@title='Selenium testing tools Cookbook | By: Roy De Kleijn']")).click();
		Thread.sleep(3000L);
		
		//Indian_Book_Store ISBN
		WebElement first = driver.findElement(By.xpath("//div[@class='isbnContainer']"));
		String isbn = first.getText();
		System.out.println(isbn);
		driver.findElement(By.xpath("//a[contains(@href,'amazon')]")).click();
		
		//Switching to Amazon Window
		driver.getWindowHandle();
		for(String firstwindow : driver.getWindowHandles()){
		    driver.switchTo().window(firstwindow);
		}
		
		//Amazon ISBN
		List<WebElement> Rows = driver.findElements(By.xpath("//div[@id='detailBullets_feature_div']/ul/li/span/span"));
		for(int i=0;i<Rows.size();i++) {
			if(Rows.get(i).getText().equalsIgnoreCase("9781849515740")) {
				System.out.println(Rows.get(i).getText());
				break;
			}
		}
		
		
		//ISBN Verification
				if(Rows.indexOf(isbn)!=1) {
					System.out.println("ISBN Matched");
				}else {
					System.out.println("ISBN Not Matched");
				}
		//Checking Book is In Stock
		String stock = driver.findElement(By.xpath("//span[contains(text(),'in stock')]")).getText();		
		System.out.println(stock);		
		
		//Book Price Printing
		String price = driver.findElement(By.xpath("//span[@id='price']")).getText();		
		System.out.println(price);
		
		Thread.sleep(3000L);
		driver.quit();
		}

}

