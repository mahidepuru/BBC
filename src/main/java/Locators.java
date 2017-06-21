import org.openqa.selenium.By;

/**
 * Created by mahidepuru on 18/06/2017.
 */
public class Locators {

 public static final String ArticleUrl = "http://www.bbc.co.uk/blogs/test/entries/f5f3031a-1a29-44ee-b2f8-86e78bfd57b0";

  public static final String RegitrsationURL = "https://account.bbc.com/register#comments"  ;

    public static final String LoginUrl = "https://account.bbc.com/signin#comments";


  public static final By CommentButton = By.xpath("//*[@id=\"blogs-main-content\"]/div/div[1]/div/div/div[2]/article/div[1]/div/div/a");

   public static final By RegisterButton = By.xpath("//p[@id='id4-cta-1']/span/a[2]");
   //class name not working , id not working ,so decided to use URL here




    public static final By Date = By.id("day-input");

    public static final By Month = By.id("month-input");

    public static final By Year = By.id("year-input");

    public static final By EmailInput = By.id("email-input");

    public static final By PasswordInput = By.id("password-input");

    public static final By Gender = By.id("gender-input");

    public static final By HomeTownInput = By.id("postcode-input");

    public static final By ContinueButton = By.cssSelector("#container > div > div > div > div.page__wrapper > div.page__grid-wrapper > div.page__content-wrapper > div > div:nth-child(2) > a");


    public static final By DisplayName = By.id("displayName-input");

    public static final By newsLetterButton = By.xpath("//*[@id=\"marketingOptIn\"]/div[1]/div[1]/label/div");


    public static final By SubmitButton = By.id("submit-button");


    public static final  By commentBox = By.xpath("//*[@id=\"submit_new_comment\"]/textarea");

    public static final By postcommentButton = By.xpath("//*[@id=\"submit_new_comment\"]/input[12]");





}


