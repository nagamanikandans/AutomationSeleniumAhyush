package com.ahyush.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.ahyush.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	@FindBy(xpath="//img[contains(@class,'mx-auto d-block')]")
	WebElement ahyushlogo;
	
	@FindBy(xpath="//div[contains(@class, 'forDHnumberCircle') and text()='1']")
	WebElement discoverAhyushNumber;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\nagamanikandans\\Automation\\AhyushAutomation\\src\\main\\java\\com\\ahyush\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String BrowserName = prop.getProperty("browser");
		
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\Chromedriver\\Chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitWait, TimeUnit.SECONDS); 
		driver.get(prop.getProperty("url"));
	}
	
	public static void navigateWellNest() {
			driver.get(prop.getProperty("wellnest_url"));
	}
	public static void waitUntilpageLoads() {
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitWait, TimeUnit.SECONDS);
	}
	
	public static void waitForfewSeconds() throws InterruptedException {
		Thread.sleep(3000);
	}
}
