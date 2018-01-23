package day1;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifymobilelist {

	  public static int scc = 0;
	@Test
	public void mobilelistpage() throws InterruptedException {
	
				
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium IDE\\chromedriver_win32\\chromedriver.exe");
        	
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://live.guru99.com");
		
		String home_title = driver.getTitle();
		
		System.out.println("The Title of the Page___"+home_title);
		
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		
		String mobile_title = driver.getTitle();
		
		System.out.println("The Title of Mobile Page__"+mobile_title);
		
		Thread.sleep(5000);

	    new Select(driver.findElement(By.cssSelector("select[title=\"Sort By\"]"))).selectByVisibleText("Name");		
		String after_Sort = driver.getTitle();
	
			Assert.assertEquals(mobile_title, after_Sort);
			{
				System.out.println("All 3 Products are sorted");
				
			}
		
	//	scc = (scc+1);
		//TakesScreenshot src =(TakesScreenshot) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String png = ("C:\\Guru99 eCommerce Live Project\\Day01_TestCase1\\Mobile Products are sorted" + scc + ".png");
		//FileUtils.copyFile(src, png);

	//}

}
}
