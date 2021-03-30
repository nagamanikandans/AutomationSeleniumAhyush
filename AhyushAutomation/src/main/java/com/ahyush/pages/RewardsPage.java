package com.ahyush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ahyush.testbase.TestBase;

public class RewardsPage extends TestBase {

	@FindBy(xpath="//button[contains(text(),'Ahyush Bazaar')]")
	WebElement ahyushBazzarbtn;
	
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[12]/a")
	WebElement wellnest;
	
	public RewardsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean ahyushBazzarButton() {
		return ahyushBazzarbtn.isDisplayed();
	}
	
	public WellnestPage navigateWellnestpage() {
		wellnest.click();
		navigateWellNest();
		return new WellnestPage();
	}
}
