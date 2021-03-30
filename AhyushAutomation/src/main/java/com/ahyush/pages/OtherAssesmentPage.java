package com.ahyush.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ahyush.testbase.TestBase;

public class OtherAssesmentPage extends TestBase {

	@FindBy(xpath="//button[contains(text(),'Other Proofs')]")
	WebElement otherproofsbtn;
	
	@FindBy(id="memberRisk")
	WebElement risks;
	
	public OtherAssesmentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean otherproofsButton() {
		return otherproofsbtn.isDisplayed();
	}
	
	public RisksPage navigateRiskspage() {
		risks.click();
		return new RisksPage();
	}
}
