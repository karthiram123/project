package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Enter;



public class newsletter extends basepage {
	@FindBy(id="newsletter-input")
	private WebElement textbox;
	@FindBy(name="submitNewsletter")
	private WebElement submit;
	@FindBy(xpath="//*[@class='alert alert-success']")
	private WebElement sucess;
	public newsletter() {
		PageFactory.initElements(driver, this);
	}
public void setvalue(){
	setText(textbox, "test"+Math.round(Math.floor(Math.random()*1000))+"@gmail.com");
	System.out.println(textbox.getAttribute("value"));
	submit.click();
}
public boolean getalert(){
	return isElementVisible(sucess);
}


}

