package Testing.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class script{

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindtreedec58\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.nobroker.in/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//div[@id='app']/div/div/div[1]/div[3]/div[1]")).click();
		 driver.findElement(By.xpath("//div[@id='searchCity']")).click();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//div[@class='css-1hwfws3 nb-select__value-container nb-select__value-container--has-value']")).click();
		 
		 Actions action = new Actions(driver);
		 for(int i=0;i<2;i++) {
			 action.sendKeys(Keys.DOWN).perform();
		 }
		 action.sendKeys(Keys.ENTER).perform();
			
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).click();
		 driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).sendKeys("K R puram Bustand");
		
		 
		 driver.findElement(By.cssSelector("div[class='autocomplete-dropdown-container']")).click();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		 driver.findElement(By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']")).click();
			
		 System.out.println(driver.findElement(By.xpath("//span[@class='overflow-hidden overflow-ellipsis whitespace-nowrap max-w-80pe po:max-w-full']")).getText());
				
		 
		}


	}

