package homeDepot.steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import homeDepot.page.Checkout;
import homeDepot.page.HomePage;
import homeDepot.page.RegistrationPage;
import homeDepot.page.SummerDressPage;

import java.util.List;
import java.util.Map;

public class StepDefinitions {
    HomePage homePage = new HomePage();
    SummerDressPage summerDressPage = new SummerDressPage();
    Checkout checkout =new Checkout();
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("^Client wants to go \"([^\"]*)\"$")
    public void client_wants_to_go(String arg1) {
       System.out.println("==============");
    }

    @When("^Client wants to see \"([^\"]*)\" category$")
    public void client_wants_to_see_category(String arg1)  {
        homePage.navigateSummerDress();
    }

    @When("^Client wants to see \"([^\"]*)\"$")
    public void client_wants_to_see(String arg1)  {
        summerDressPage.clickFirstDress();
    }

    @When("^Client wants to quick view first \"([^\"]*)\"$")
    public void client_wants_to_quick_view_first(String arg1)  {

    }

    @Then("^Client wants to select size \"([^\"]*)\"$")
    public void client_wants_to_select_size(String arg1)  {
         summerDressPage.selectSize();
    }

    @Then("^Client wants to Add to cart$")
    public void client_wants_to_Add_to_cart()   {
        summerDressPage.setAddToCart();
    }

    @Then("^Client wants to Continue shopping$")
    public void client_wants_to_Continue_shopping() {
       summerDressPage.setContinueShopping();
    }

    @Then("^Clint wants to see cart$")
    public void clint_wants_to_see_cart()   {
        summerDressPage.viewCart();
    }

    @Then("^Clint wants to checkout$")
    public void clint_wants_to_checkout() throws Throwable {
        summerDressPage.checkout();
    }

    @Then("^Clint wants to proceed to checkout$")
    public void clint_wants_to_proceed_to_checkout()  {
        checkout.setProceedCheckout();
    }

    @Then("^Client wants to create an new account$")
    public void createAccount()  {
        registrationPage.enterEmailForRegistration();
    }
    @Then("^Client wants to fill mandatory fields$")
    public void client_wants_to_fill_mandatory_fields(List<Map<String, String >> info)   {
        registrationPage.registration(info);
    }

    @Then("^Client wants to register$")
    public void client_wants_to_register()  {
        System.out.println("===========");
    }

    @Then("^Client wants to proceed$")
    public void client_wants_to_proceed() {
        registrationPage.clickProcessAddress();
    }

    @Then("^client wants to accept Terms and conditions$")
    public void client_wants_to_accept_Terms_and_conditions()  {
        registrationPage.clickTermsAndConditions();
        registrationPage.clickProcessCarrier();
    }

    @Then("^Client wants to verify order \"([^\"]*)\" with \"([^\"]*)\" size$")
    public void client_wants_to_verify_order_with_size(String dress, String size)  {
        registrationPage.verifyOrder(dress, size);
    }
}
