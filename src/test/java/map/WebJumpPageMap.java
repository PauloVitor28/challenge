package map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.WebJumpPage;

public class WebJumpPageMap extends BasePage {
    public WebJumpPageMap(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "btn_one")
    WebElement btnOne;

    @FindBy(id = "btn_two")
    WebElement btnTwo;

    @FindBy(id = "btn_three")
    WebElement btnThree;

    @FindBy(id = "reset_fields")
    WebElement resetBtn;

    @FindBy(id = "[name='first_name']")
    WebElement campoLogin;

    @FindBy(css = "[name='passaword']")
    WebElement campoSenha;

    @FindBy (id = "mid_name")
    WebElement midNameField;

    @FindBy (id = "last_name")
    WebElement lastNameField;

    @FindBy (id = "age")
    WebElement ageField;

    @FindBy (id = "job")
    WebElement jobField;

    @FindBy (id = "gender")
    WebElement genderField;

    public WebElement getBtnOne() {
        return btnOne;
    }

    public WebElement getBtnTwo() {
        return btnTwo;
    }

    public WebElement getBtnThree() {
        return btnThree;
    }

    public WebElement getResetFieldsBtn(){
        return resetBtn;
    }

    public WebElement getCampoLogin() {
        return campoLogin;
    }

    public WebElement getCampoSenha() {
        return campoSenha;
    }

    public WebElement getMidNameField(){
        return midNameField;
    }

    public WebElement getLastNameField(){
        return lastNameField;
    }

    public WebElement getAgeField(){
        return ageField;
    }

    public WebElement getJobField(){
        return jobField;
    }

    public WebElement getGenderField(){
        return genderField;
    }

//    public void clickBtnSignIn() {
//        clickJS(btnSignIn);
    }

