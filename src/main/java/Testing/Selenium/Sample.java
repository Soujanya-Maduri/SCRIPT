package Testing.Selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mindtreedec58\\AppData\\Local\\Packages\\Microsoft.MicrosoftEdge_8wekyb3d8bbwe\\TempState\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.getTitle();
        driver.getCurrentUrl();
        WebElement searchbar = driver.findElement(By.xpath("//input[@name='field-keywords']"));
        searchbar.sendKeys("refrigerator");
        searchbar.sendKeys(Keys.ENTER);
       
        driver.findElement(By.linkText("LG 190 L 4 Star Inverter Direct-Cool Single Door Refrigerator (GL-B201ASPY, Scarlet Plumeria, Moist 'N' Fresh)")).click();
        driver.getWindowHandle();
        WebElement old=driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[4]"));
        String olddata=old.getText();
        System.out.println(olddata);
        for(String window1: driver.getWindowHandles()) {
        	driver.switchTo().window(window1);
        }
       // List<WebElement> title =driver.findElements(By.xpath("//table[@id='productDetails_techSpec_section_1']/tbody/tr/th"));
        //List<WebElement> value =driver.findElements(By.xpath("//table[@id='productDetails_techSpec_section_1']/tbody/tr/td"));
       
        List<WebElement> title =driver.findElements(By.xpath("//th[@class='a-color-secondary a-size-base prodDetSectionEntry']"));
        List<WebElement> value =driver.findElements(By.xpath("//table[@id='productDetails_techSpec_section_1']/tbody/tr/td"));
      
        for(int i=0;i<title.size();i++) {
        	if(title.get(i).getText().equalsIgnoreCase("Voltage"))
        	{
        		System.out.println(value.get(i).getText());
        	}
        }
        
        WebElement New=driver.findElement(By.id("acrCustomerReviewText"));
        String Newdata=New.getText();
        System.out.println(Newdata);
        if(Newdata.indexOf(olddata)!=-1) {
        	System.out.println("matched");
        }
        else {
        	System.out.println("not matched");
        }
        driver.findElement(By.linkText("LG 190 L 5 Star Inverter Direct-Cool Single Door Refrigerator (GL-D201APZZ, Shiny S...")).click();
        driver.getWindowHandle();
        for(String window2: driver.getWindowHandles()) {
        	driver.switchTo().window(window2);
        }
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
      
    
      
        WebElement search=driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
        Actions actions=new Actions(driver);  
	    actions.moveToElement(search).perform();
	    Thread.sleep(3000L);
	   // WebElement language=driver.findElement(By.xpath("//span[@class='nav-flyout-icp']"));
	    WebElement language=driver.findElement(By.xpath(" //*[@id=\'nav-flyout-icp\']//a[contains(@href,'te')]"));
	    Actions lng=new Actions(driver);
	    lng.moveToElement(language).perform();
	   // Thread.sleep(100);
	    language.click();
	    
	  //*[@id="nav-flyout-icp"]/div[2]/a[3]/span/i
	  
	 
    
	    

    }
}
