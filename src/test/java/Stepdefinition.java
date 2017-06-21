
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Stepdefinition {

    WebDriver driver;

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "/Users/mahidepuru/IdeaProjects/BBC/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.manage().window().maximize();

}

//@After
  //  public void closebrowser(){
    //    driver.quit();

    //}


    @Given("^User Navigated to BBC NewsArticlePage$")
    public void i_am_in_Registration_page() throws Throwable {
    driver.get(Locators.ArticleUrl);

    }
    @When("^User clicks on CommentButton$")
    public void User_clicks_on_CommentButtonS() throws Throwable {
        driver.findElement(Locators.CommentButton).click();
    }

    @Then("^User clicks on Registration Button$")

        public void userclicksonRegistrationButton() throws Throwable {
            //driver.findElement(Locators.RegisterButton).click();
            driver.get(Locators.RegitrsationURL);

            }

    @And("^User completes registration$")
    public void completeRegistration(){

        Registration_Page account = new Registration_Page(driver);

        account.completeRegistration();

    }
    @When("^User login as existing user$")
    public void user_login_as_existing_user_to_comment() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        Registration_Page login = new Registration_Page(driver);
        login.logindetails("rdepuru@gmail.com", "MAHIreddy123");
    }

    @Then("^User comments on Test Article$")

        public void  ThenUsercommentson_Test_Article(){
        Registration_Page comment = new Registration_Page(driver);
        comment.commentinArtcile();

        }
}
