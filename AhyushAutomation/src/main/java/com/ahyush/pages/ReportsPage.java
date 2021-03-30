package com.ahyush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ahyush.testbase.TestBase;

public class ReportsPage extends TestBase {
	
	@FindBy(name="query")
	WebElement searchBox;
	
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[9]/a")
	WebElement events;
	
	public ReportsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean searchTextbox() {
		return searchBox.isDisplayed();
	}
	
	public EventsPage navigateEventspage() {
		events.click();
		return new EventsPage();
	}
}
