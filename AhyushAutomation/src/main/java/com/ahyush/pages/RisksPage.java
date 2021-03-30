package com.ahyush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ahyush.testbase.TestBase;

public class RisksPage extends TestBase {

	@FindBy(id="Over weight / Obesity")
	WebElement overWeightText;
	
	@FindBy(id="memberGoals")
	WebElement memberGoals;
	
	public RisksPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean overWeightText() {
		return overWeightText.isDisplayed();
	}
	
	public GoalsPage navigateMemberGoalspage() {
		memberGoals.click();
		return new GoalsPage();
	}
}
