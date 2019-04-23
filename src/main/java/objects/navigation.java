package objects;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class navigation extends basepage {
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement navwomen;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement navdresses;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement navtshirts;
	public navigation() {
		PageFactory.initElements(driver, this);
	}
		public boolean navtowomen(){
			return elementFound(navwomen);
		}
		public boolean navtodresses(){
			return elementFound(navdresses);
		}
		public boolean navtotshirts(){
			return elementFound(navtshirts);
		}
	
}
