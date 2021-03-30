package com.ahyush.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ahyush.testbase.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'LOGIN')]")
	WebElement loginbutton;
	
	@FindBy(xpath="//img[contains(@class,'mx-auto d-block')]")
	WebElement ahyushlogo;
	

	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String LoginInPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateAhyushImage() {
		return ahyushlogo.isDisplayed();
	}
	

		
	public AhyushHomePage login(String usrname, String pwd) {
		username.sendKeys(usrname);
		password.sendKeys(pwd);
		loginbutton.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return new AhyushHomePage();
	}
}
