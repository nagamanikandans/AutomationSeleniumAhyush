package com.ahyush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ahyush.testbase.TestBase;

public class GoalsPage extends TestBase {

	@FindBy(id="memberActivities")
	WebElement activities;
	
	@FindBy(xpath="//button[contains(text(),'Activities')]")
	WebElement activiesBtn;
	
	public GoalsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean activitiesButtonOnGoalsPage() {
		return activiesBtn.isDisplayed();
	}
	
	public ActivitiesPage navigateActivitiesGoalspage() {
		activities.click();
		return new ActivitiesPage();
	}
	
}
