package com.ahyush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ahyush.testbase.TestBase;

public class ChallengesPage extends TestBase {

	@FindBy(xpath="//img[contains(@class,'float-right device')]")
	WebElement deviceConnectivityLogo;
	
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[11]/a")
	WebElement rewards;
	
	public ChallengesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean deviceConnectivityLogo() {
		return deviceConnectivityLogo.isDisplayed();
	}
	
	public RewardsPage navigateRewardspage() {
		rewards.click();
		return new RewardsPage();
	}
	
}
