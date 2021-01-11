package homeDepot.page;

import homeDepot.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BrowserUtils {


    public void navigateSummerDress(){

        WebElement element = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category'])[1]"));
        moveToElem(element);
        wait(1);
        WebElement element2 = driver.findElement(By.xpath(" (//a[@href='http://automationpractice.com/index.php?id_category=11&controller=category'])[1]"));
        element2.click();

    }





}
