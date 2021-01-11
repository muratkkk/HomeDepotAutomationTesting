package homeDepot.page;

import homeDepot.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummerDressPage extends BrowserUtils {

    public SummerDressPage(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//span[@title='Continue shopping']")
    private WebElement continueShopping;

    public void clickFirstDress(){
        WebElement element = driver.findElement(By.xpath("//img[@src='http://automationpractice.com/img/p/1/2/12-home_default.jpg']"));
        moveToElem(element);
        wait(2);
        WebElement quickView = driver.findElement(By.xpath("(//span[contains(text(),'Quick view')])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(quickView).perform();
        actions.click().build().perform();
    }

    public void selectSize(){
        System.out.println("Size is default small");

    }

    public void setAddToCart(){
     String iFrame  = "//*[contains(@id,'fancybox-frame')]";

        switchFrame(iFrame);
        wait(1);
        WebElement addToCart = driver.findElement(By.xpath("//p[@id='add_to_cart']//button"));
        addToCart.click();
        wait(1);
        driver.switchTo().parentFrame();
    }

    public void setContinueShopping(){
      //  wait(1);
      //  continueShopping.click();
        clickWithJS(continueShopping);
    }

    public void viewCart(){
        WebElement viewCart = driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
        moveToElem(viewCart);
        wait(2);
    }

    public void checkout(){
        WebElement quickView = driver.findElement(By.xpath("//span[contains(text(),'Check out')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(quickView).perform();
        actions.click().build().perform();
        wait(2);
    }



}
