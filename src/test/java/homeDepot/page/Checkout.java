package homeDepot.page;

import homeDepot.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout extends BrowserUtils {

    public Checkout(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//span[contains(text(),'Proceed to checkout')])[2]")
    private WebElement proceedCheckout;

    public void setProceedCheckout(){
        clickWithJS(proceedCheckout);
    }


}
