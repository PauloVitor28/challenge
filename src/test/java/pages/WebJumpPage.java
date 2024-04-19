package pages;

import map.WebJumpPageMap;
import org.openqa.selenium.WebDriver;

public class WebJumpPage extends WebJumpPageMap {
    public WebJumpPage(WebDriver driver) {
        super(driver);
    }

    public void btnOneClick() {
        getBtnOne().click();

    }

    public void btnTwoClick(){
        getBtnTwo().click();
    }

    public void btnThreeClick() throws InterruptedException {
        getBtnThree().click();
        Thread.sleep(1500);

    }

    public void digitaEmCampoLogin(String text) {
        getCampoLogin().sendKeys(text);
    }

    public void digitaEmCampoSenha(String text) {
        getCampoSenha().sendKeys(text);
    }

    public void fillMidNameField(String text){
        getMidNameField().sendKeys(text);
    }

    public void fillLastNameField(String text){
        getLastNameField().sendKeys(text);
    }

    public void fillAgeField (String text) {
        getAgeField().sendKeys(text);
    }

    public void fillJobField (String text) {
        getJobField().sendKeys(text);
    }

    public void fillGenderField (String text) {
        getGenderField().sendKeys(text);
    }

    public void resetBtnClicks(){
        getResetFieldsBtn().click();
    }
}
