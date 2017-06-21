
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by mahidepuru on 20/06/2017.
 */
public class Registration_Page {
    WebDriver driver;

    public Registration_Page(WebDriver driver){
        this.driver = driver;
    }


        public void completeRegistration() {

            driver.findElement(Locators.Date).sendKeys("21");
            driver.findElement(Locators.Month).sendKeys("june");
            driver.findElement(Locators.Year).sendKeys("1999");
            driver.findElement(Locators.SubmitButton).click();
            GenerateData genData = new GenerateData();
            driver.findElement(Locators.EmailInput).sendKeys(genData.generateRandomAlphaNumeric(10)+"@mailinator.com");
            driver.findElement(Locators.PasswordInput).sendKeys("MAHIREDDY987!0-98");
            driver.findElement(Locators.HomeTownInput).sendKeys("E62DZ");
            new Select(driver.findElement(Locators.Gender)).selectByVisibleText("Female");
            driver.findElement(Locators.newsLetterButton).click();
            driver.findElement(Locators.SubmitButton).click();
            driver.findElement(Locators.ContinueButton).click();
            driver.findElement(By.id("idcta-link")).click();
            driver.findElement(By.xpath("//*[@id=\"orb-modules\"]/div[1]/div/div/div[1]/div[1]/div/div/div/div/nav/ul/li[3]/a/span")).click();

        }


    public void logindetails(String username, String  password){

        driver.get(Locators.LoginUrl);

        driver.findElement(By.id("username-input")).sendKeys(username);

        driver.findElement(By.id("password-input")).sendKeys(password);

        driver.findElement(By.id("submit-button")).click();


    }

    public void commentinArtcile(){

        driver.get(Locators.ArticleUrl);

        //driver.findElement(Locators.commentBox).click();

        driver.findElement(Locators.commentBox).sendKeys("As a Tester I want to check comment box input working as expected");
        driver.findElement(Locators.commentBox).clear();
        driver.findElement(Locators.commentBox).click();
        driver.findElement(Locators.commentBox).sendKeys("Lorem ipsum dolor sit amet, et cetero nusquam sea, vivendum atomorum aliquando nam ne. Vis ubique euismod senserit no, maiorum persecuti qui eu, qui cu atqui ancillae. Primis eruditi honestatis sit in, offendit reprimique cotidieque his an, dolore discere eloquentiam te est. Te solet incorrupte duo, cu graece inermis principes eam, et sit enim sint prompta.");
        driver.findElement(Locators.postcommentButton).click();


        Assert.assertEquals("Thanks, your comment has been posted.", driver.findElement(By.cssSelector(".cmts-message-success")).getText());
        try {
            Assert.assertEquals("Upload complete",driver.findElement(By.cssSelector(".cmts-message-success")).getText());
        } catch (Error e) {
            //verificationErrors.append(e.toString());
        }
    }






}


