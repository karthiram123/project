package objects;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
public class homepagereg extends basepage {
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement women;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dresses;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement tshirts;
	@FindBy(xpath = "//*[@id='homfeatured']/li[1]/div")
	private WebElement firstpdt;
	@FindBys(@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul"))
	private List<WebElement> menu;



	public homepagereg() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getwomen() {
		return women;
	}
	public WebElement getdresses() {
		return dresses;
	}
	public WebElement gettshirts() {
		return tshirts;
	}
public void clickwomen(){
	women.click();
}
	public void clickdresses(){
		dresses.click();
	}
	public void clickfirstpdt(){
		firstpdt.click();
	}
	public void clicktshirts(){
		tshirts.click();
	}

	
	}	



