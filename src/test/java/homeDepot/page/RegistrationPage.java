package homeDepot.page;


import homeDepot.utils.BrowserUtils;
import homeDepot.utils.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.Map;

public class RegistrationPage extends BrowserUtils {

    public RegistrationPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[id='customer_firstname']")
    private WebElement customerFirsName;

    @FindBy(css = "[id='customer_lastname']")
    private WebElement customerLastName;

    @FindBy(css = "[id='email']")
    private WebElement email;

    @FindBy(css = "[id='passwd']")
    private WebElement password;

    @FindBy(css = "[id='firstname']")
    private WebElement firstName;

    @FindBy(css = "[id='lastname']")
    private WebElement lastName;

    @FindBy(css = "[id='company']")
    private WebElement company;

    @FindBy(css = "[id='address1']")
    private WebElement address1;

    @FindBy(css = "[id='city']")
    private WebElement city;

    @FindBy(css = "[id='id_state']")
    private WebElement state;

    @FindBy(css = "[id='postcode']")
    private WebElement postCode;

    @FindBy(css = "[id='id_country']")
    private WebElement country;

    @FindBy(css = "[id='phone_mobile']")
    private WebElement mobilePhone;

    @FindBy(css = "[id='alias']")
    private WebElement assignAndAddressAliasForFutureRef;

    @FindBy(id = "submitAccount")
    private WebElement register;

    @FindBy(id = "email_create")
    private WebElement accountEmail;

    @FindBy(id = "SubmitCreate")
    private WebElement createAccount;

    @FindBy(xpath = "(//span[contains(text(),'Proceed to checkout')])[2]")
    private WebElement processAddress;

    @FindBy(id = "cgv")
    private WebElement termsAndConditions;

    @FindBy(xpath = "//button[@name='processCarrier']")
    private WebElement processCarrier;

    @FindBy(xpath = "//tr[contains(@id,'product_5_19_0_')]//a[contains(text(),'Printed')]")
    private WebElement verifyDress;

    public void setCustomerFirsName(String customerFirsNameValue) {
        enterText(customerFirsName, customerFirsNameValue);
    }

    public void setCustomerLastName(String lastNameValue) {
        enterText(customerLastName, lastNameValue);
    }

    public void setEmail(String emailValue) {
        enterText(email, emailValue);
    }

    public void setPassword(String passwordValue) {
        enterText(password, passwordValue);
    }

    public void setFirstName(String firstNameValue) {
        enterText(firstName, firstNameValue );
    }

    public void setLastName(String lastNameValue) {
        enterText(lastName, lastNameValue);
    }

    public void setAddress1(String address1Value) {
        enterText(address1, address1Value);
    }

    public void setCity(String customerFirsNameValue) {
        enterText(city, customerFirsNameValue);
    }

    public void setState(String stateValue) {
        Select dropState = new Select(state);
        dropState.selectByVisibleText(stateValue);
    }

    public void setPostCode(String customerFirsNameValue) {
        enterText(postCode, customerFirsNameValue);
    }

    public void setCountry(String countryValue) {
        Select dropState = new Select(country);
        dropState.selectByVisibleText(countryValue);
    }

    public void setMobilePhone(String  mobilePhoneValue){
        enterText(mobilePhone, mobilePhoneValue);
    }

    public void setAssignAndAddressAliasForFutureRef(String assignAndAddressAliasForFutureRefValue){
        Assert.assertEquals(assignAndAddressAliasForFutureRef, assignAndAddressAliasForFutureRefValue);
    }

    public void clickRegister(){
        clickWithJS(register);
    }

    public void registration(List<Map<String, String >> info){
        setCustomerFirsName(info.get(0).get("CName"));
        setCustomerLastName(info.get(0).get("CLastName"));
        setEmail(ConfigurationReader.getProperty("email"));
        setPassword(info.get(0).get("Password"));
        setFirstName(info.get(0).get("CName"));
        setLastName(info.get(0).get("CLastName"));
        setAddress1(info.get(0).get("Address"));
        setCity(info.get(0).get("City"));
        setState(info.get(0).get("State"));
        setPostCode(info.get(0).get("PostCode"));
        setCountry(info.get(0).get("Country"));
        setMobilePhone(info.get(0).get("MobilePhone"));
        clickRegister();

    }

    public void enterEmailForRegistration(){
        enterText(accountEmail, ConfigurationReader.getProperty("email"));
        clickWithJS(createAccount);
    }

    public void clickProcessAddress(){
        clickWithJS(processAddress);
    }

    public void clickTermsAndConditions(){
        clickWithJS(termsAndConditions);
    }

    public void clickProcessCarrier(){
        clickWithJS(processCarrier);
    }

    public void verifyOrder(String dress, String size){
        wait(2);
        Assert.assertEquals(verifyDress.getText().trim(),dress);

    }



}
