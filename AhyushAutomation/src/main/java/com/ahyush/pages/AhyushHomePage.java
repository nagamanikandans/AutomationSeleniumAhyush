package com.ahyush.pages;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.ahyush.testbase.TestBase;

public class AhyushHomePage extends TestBase {

	@FindBy(xpath="//div[contains(@class, 'forDHnumberCircle') and text()='1']")
	WebElement discoverAhyushNumber;
	
	@FindBy(id="clinical-data")
	WebElement otherAssetments;
		
	@FindBy(xpath="//button[contains(text(),'View Details')]")
	WebElement viewDetailsbtn;
	
	@FindBy(css="body > app-root > app-my-ahyush-dashboard > div.container-fluid.panel > div:nth-child(2) > app-ahyush-flow > div > div > div:nth-child(1) > div > div.col-10 > div > span > a")
	WebElement discoverAhyushText;
	
	public AhyushHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String HomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean discoverAhyushTextinHomePage() {
		return discoverAhyushText.isDisplayed();
	}

	public boolean discoverAhyushNumber() {
		return discoverAhyushNumber.isDisplayed();
	}
	public OtherAssesmentPage navigateOtherAssestmentsPage(){
		otherAssetments.click();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return new OtherAssesmentPage();
	}

}
