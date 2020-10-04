package AutoITTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import AutoITProvider.AutoITFunctions;

public class AutoITTests {

	@Test
	public static void AutoIT_UploadFile()
	{
		//setup the chromedriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
 
        //Create driver object for Chrome
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
        
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //Navigate to a URL
        driver.get("http://demo.guru99.com/test/upload/");
        
        // Upload
        driver.findElement(By.id("filelist")).click();
        
        AutoITFunctions autoIT = new AutoITFunctions();
        autoIT.FileUpload("C:\\Users\\sande\\OneDrive\\Desktop\\Screenshot_20200827-222010_Chrome.jpg");
 
        
        driver.quit();
	}
	
	@Test
	public static void AutoIT_DownloadFile() throws InterruptedException
	{
		//setup the chromedriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
 
        //Create driver object for Chrome
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
        
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //Navigate to a URL
        driver.get("https://www.sogeti.com/globalassets/global/downloads/testing/test-automation-brochure_2014-11-05_v07.pdf");
        
        AutoITFunctions autoIT = new AutoITFunctions();
        autoIT.ClickDownload();
        autoIT.FileSaveAs();
        
        driver.quit();
	}
}
