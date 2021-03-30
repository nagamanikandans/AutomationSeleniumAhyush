package com.ahyush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ahyush.testbase.TestBase;

public class EventsPage extends TestBase {

	@FindBy(xpath="//button[contains(text(),'Ongoing')]")
	WebElement ongoingbtn;
	
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[10]/a")
	WebElement challenges;
	
	public EventsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean ongoingButton() {
		return ongoingbtn.isDisplayed();
	}
	
	public ChallengesPage navigateChallengespage() {
		challenges.click();
		return new ChallengesPage();
	}
}
