package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.WebJumpPage;

public class AccessPageStep extends BaseClass {
    private final WebJumpPage wj = new WebJumpPage(driver);


    @Given("User access page")
    public void userAccessPage() {
        logger.info("Accessing search page");
    }

    @And("User waits for cookie consent")
    public void userWaitsCookieConsent(){
        logger.info("User waits for cookie consent");

    }


    @When("user clicks on button one")
    public void userClicksOnBtnOne() {
        logger.info("Filling out the form");
        wj.btnOneClick();

    }

    @When("user clicks on button two")
    public void userClicksOnBtnTwo(){
        wj.btnTwoClick();
    }

    @When("user clicks on button three")
    public void userClicksOnBtnThree() throws InterruptedException {
        wj.btnThreeClick();
    }

    @Given("user fill out the mid name field {string}")
    public void user_fill_out_the_mid_name_field(String s) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("user fill out the username field {string}")
    public void userFillOutTheUsernameField(String text) {
        wj.digitaEmCampoLogin(text);
    }

    @And("user fill out the password field {string}")
    public void userFillOutThePasswordField(String text){
        wj.digitaEmCampoSenha(text);
    }

    @And("user fill out the mid name field {string}")
        public void userFillOutTheMidNameField(String text){
            wj.fillMidNameField(text);
        }
    
    @And("user fill out the last name field {string}")
        public void userFillOutTheLastNameField(String text){
            wj.fillLastNameField(text);  
        }  
     
    @And("user fill out the age field {string}")
    public void userFillOutTheAgeField(String text){
        wj.fillAgeField(text);
    }   

    @And("user fill out the job field {string}")
    public void userFillOutTheJobField(String text){
        wj.fillJobField(text);
    }  

    @And("user fill out the gender field {string}")
    public void userFillOutTheGenderField(String text){
        wj.fillGenderField(text);
    }

    @And("user clicks on reset button")
    public void userClicksOnResetBtn(){
        wj.resetBtnClicks();
    }
}
//    @When("I fill in the login form with the data email {string} and password {string}")
//    public void iFillInTheLoginFormWithTheDataEmailAndPassword(String email, String password) {
//        logger.info("Filling out the form");
//        lp.btnOneClick(email, password);
//    }

