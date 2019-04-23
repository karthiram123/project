package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import objects.homepagereg;
import objects.navigation;

public class navigationtest {
	navigation nav;
	homepagereg homepage;
	
	public  navigationtest() {
		nav=new navigation();
		homepage=new homepagereg();
	}
	@Test
	public void verifynavigation(){
		homepage.clickwomen();
		Assert.assertTrue(nav.navtowomen());
		homepage.clickdresses();
		Assert.assertTrue(nav.navtodresses());
		homepage.clicktshirts();
		Assert.assertTrue(nav.navtotshirts());
		
	}

}
