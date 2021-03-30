package com.ahyush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ahyush.testbase.TestBase;

public class ActivitiesPage extends TestBase {

	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[8]/a")
	WebElement reports;
	
	@FindBy(xpath="//button[contains(text(),'Recommended Activities')]")
	WebElement recommendedActivitiesbtn;
	
	public ActivitiesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean recommendedActivitiesButton() {
		return recommendedActivitiesbtn.isDisplayed();
	}
	
	public ReportsPage navigateReportspage() {
		reports.click();
		return new ReportsPage();
	}
}
