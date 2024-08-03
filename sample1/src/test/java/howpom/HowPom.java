package howpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HowPom {

    WebDriver driver;

    public HowPom(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(how = How.CSS,using = "input[name='username']")
    public WebElement getuserName;
    @FindBy(how = How.CSS, using="#password")
    public WebElement getPassword;
    @FindBy(how=How.XPATH,using = "(//label/span[@class='checkmark'])[2]")
    public WebElement getUserTypeRadioBtn;
    @FindBy(how=How.CSS, using = "#okayBtn" )
    public WebElement getPopUpBtn;
    @FindBy(how=How.CSS,using = ".form-group select")
    public WebElement getDropDown;
    @FindBy(how=How.CSS,using = "#terms")
    public WebElement getTermsAndConditions;
    @FindBy(how = How.CSS,using = "#signInBtn")
    public WebElement getSingInBtn;



    @FindBys({
            @FindBy(how = How.CSS,using = ".list-group a")
    })
    public List<WebElement> getShopesNames;

}
