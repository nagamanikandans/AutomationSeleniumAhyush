package com.ahyush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ahyush.testbase.TestBase;

public class WellnestPage extends TestBase {

	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement wellnestlogo;
	
	public WellnestPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean wellNestPageLogo() {
		return wellnestlogo.isDisplayed();
	}
}
