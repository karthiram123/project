package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import objects.basepage;
import objects.homepagereg;

public class homepageregtest {
	homepagereg homePage;
	basepage bp;

	public homepageregtest() {
		homePage = new homepagereg();
		bp = new basepage();
	}

	@Test
	public void verifytabs() {
		Assert.assertTrue(homePage.elementFound(homePage.getwomen()), 
				"Failed:women tab not displayed");
		Assert.assertTrue(homePage.elementFound(homePage.getdresses()), 
				"Failed:dresses tab not displayed");
		Assert.assertTrue(homePage.elementFound(homePage.gettshirts()), 
				"Failed:tshirts tab not displayed");
	}

}
