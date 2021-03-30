package com.ahyush.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ahyush.pages.ActivitiesPage;
import com.ahyush.pages.AhyushHomePage;
import com.ahyush.pages.ChallengesPage;
import com.ahyush.pages.EventsPage;
import com.ahyush.pages.GoalsPage;
import com.ahyush.pages.LoginPage;
import com.ahyush.pages.OtherAssesmentPage;
import com.ahyush.pages.ReportsPage;
import com.ahyush.pages.RewardsPage;
import com.ahyush.pages.RisksPage;
import com.ahyush.pages.WellnestPage;
import com.ahyush.testbase.TestBase;

public class AhyushTest extends TestBase {

	LoginPage loginPage;
	AhyushHomePage homePage;
	OtherAssesmentPage otherAssestmentPage;
	RisksPage risksPage;
	GoalsPage goalsPage;
	ActivitiesPage activitiesPage;
	EventsPage eventsPage;
	ReportsPage reportsPage;
	ChallengesPage challengesPage;
	RewardsPage rewardsPage;
	WellnestPage wellnestPage;
	
	public AhyushTest() {
		super();
	}
	
	@BeforeSuite
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	//@Test(priority=1)
	@Test
	public void AhyushNavigateAllPages() throws InterruptedException {
		String LoginPageTitle = loginPage.LoginInPageTitle();
		Assert.assertEquals(LoginPageTitle, "Ahyush | Login");
		boolean logo = loginPage.validateAhyushImage();
		Assert.assertTrue(logo);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		waitUntilpageLoads();
		boolean discoverAhyushNumber = homePage.discoverAhyushNumber();
		Assert.assertTrue(discoverAhyushNumber);
		waitForfewSeconds();
		otherAssestmentPage = homePage.navigateOtherAssestmentsPage();
		waitUntilpageLoads();
		Assert.assertTrue(otherAssestmentPage.otherproofsButton());
		waitForfewSeconds();
		risksPage = otherAssestmentPage.navigateRiskspage();
		waitUntilpageLoads();
		Assert.assertTrue(risksPage.overWeightText());
		waitForfewSeconds();
		goalsPage = risksPage.navigateMemberGoalspage();
		waitUntilpageLoads();
		Assert.assertTrue(goalsPage.activitiesButtonOnGoalsPage());
		waitForfewSeconds();
		activitiesPage = goalsPage.navigateActivitiesGoalspage();
		waitUntilpageLoads();
		Assert.assertTrue(activitiesPage.recommendedActivitiesButton());
		waitForfewSeconds();
		reportsPage = activitiesPage.navigateReportspage();
		waitUntilpageLoads();
		Assert.assertTrue(reportsPage.searchTextbox());
		waitForfewSeconds();
		eventsPage = reportsPage.navigateEventspage();
		waitUntilpageLoads();
		Assert.assertTrue(eventsPage.ongoingButton());
		waitForfewSeconds();
		challengesPage = eventsPage.navigateChallengespage();
		waitUntilpageLoads();
		Assert.assertTrue(challengesPage.deviceConnectivityLogo());
		waitForfewSeconds();
		rewardsPage = challengesPage.navigateRewardspage();
		waitUntilpageLoads();
		Assert.assertTrue(rewardsPage.ahyushBazzarButton());
		waitForfewSeconds();
		wellnestPage = rewardsPage.navigateWellnestpage();
		waitUntilpageLoads();
		Assert.assertTrue(wellnestPage.wellNestPageLogo());
		waitForfewSeconds();
	}

	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}
