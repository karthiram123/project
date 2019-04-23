package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import objects.newsletter;

public class newslettertest {
	newsletter news;
	public newslettertest(){
		news=new newsletter();
	}
@Test
public void verifynewsletter(){
	news.setvalue();
	Assert.assertTrue(news.getalert());
}
}
