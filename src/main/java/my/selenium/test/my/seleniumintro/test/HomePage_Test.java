package my.selenium.test.my.seleniumintro.test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage_Test {

    public static  ChromeDriver driver;

    public static boolean HamburgerMenuCall(){

        WebElement Hamburger = driver.findElement(By.xpath("//button[@aria-label = 'Guide']"));
        try {
            Hamburger.click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement sideMenuContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id = 'guide-wrapper'])")));
            if (sideMenuContainer.isDisplayed()) {
                System.out.println("Success");
                return true;
            } else {
                System.out.println("Unsuccessful");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static void HomeButtonCall(){

        WebElement Home = driver.findElement(By.xpath("(//*[@title = 'Home'])[2]"));
        Home.click();

        WebElement page = driver.findElement(By.xpath("(//*[text()='Your watch history is off'])"));
        String HomepageResponse =page.getText();
        if(HomepageResponse.equals("Try searching to get started")){
            System.out.println("Home Page loaded successful");
        }else {
            System.out.println("Home Page is failed to load");
        }
    }

    public static void ShortsButtonCall(){

        WebElement Shorts = driver.findElement(By.xpath("(//*[@title = 'Subscriptions'])[1]"));
        try{
            Shorts.click();
            WebDriverWait shortspagewait = new WebDriverWait(driver,Duration.ofSeconds(5));
            WebElement shortsvideo = shortspagewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//video[@class='video-stream html5-main-video']")));

            if(shortsvideo.isDisplayed()){
                System.out.println("Shorts page loaded successful");
            }else{
                System.out.println("Shorts failed to load");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        HamburgerMenuCall();
    }

    public static void SubscriptionsButtonCall(){
        WebElement Subscriptions = driver.findElement(By.xpath("(//a[@title = 'Subscriptions'])[1]"));
        Subscriptions.click();
        WebDriverWait Subscriptionswait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement SubscriptionsElement = Subscriptionswait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Don’t miss new videos'])"))
        );
        String SubscriptionspageResponse = SubscriptionsElement.getText();
        if(SubscriptionspageResponse.equals("Don’t miss new videos")){
            System.out.println("Subscriptions Page loaded successful");
        }else{
            System.out.println("Subscriptions Page is failed to load");
        }

    }

    public static void HistoryButtonCall(){

        WebElement History = driver.findElement(By.xpath("(//a[@title='History'])[1]"));
        History.click();
        WebDriverWait historywait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement page = historywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='message']")));
        String HistorypageResponse = page.getText();
        if(HistorypageResponse.equals("Keep track of what you watch")){
            System.out.println("History Page loaded successful");
        }else{
            System.out.println("History Page is failed to load");
        }
    }
    public static void YouButtonCall(){
        WebElement You = driver.findElement(By.xpath("(//a[@title='You'])[1]"));
        You.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement page = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='message']")));
        String HistorypageResponse = page.getText();
        if(HistorypageResponse.equals("Enjoy your favorite videos")){
            System.out.println("You Page loaded successful");
        }else{
            System.out.println("You Page is failed to load");
        }
        HamburgerMenuCall();
    }

    public static void ShoppingButtonCall(){
        WebElement Shopping = driver.findElement(By.xpath("//*[@title = 'Shopping']"));
        Shopping.click();
        WebDriverWait Shoppingwait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement Shoppingpage = Shoppingwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='dynamicTextViewModelH1']")));

        if(Shoppingpage.isDisplayed()){
            System.out.println("Shopping successful");
        }else{
            System.out.println("Shopping unsuccessful");
        }
        HamburgerMenuCall();
    }

    public static void MusicButtonCall(){
        HamburgerMenuCall();
        WebElement Music = driver.findElement(By.xpath("//*[@title = 'Music']"));
        Music.click();
        WebDriverWait Musicwait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement Musicpage = Musicwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='style-scope ytd-default-promo-panel-renderer grid grid-disabled']")));

        if(Musicpage.isDisplayed()){
            System.out.println("Music successful");
        }else{
            System.out.println("Music unsuccessful");
        }
        HamburgerMenuCall();
    }

    public static void MoviesButtonCall(){

        WebElement Movies = driver.findElement(By.xpath("//*[@title = 'Movies']"));
        Movies.click();
        WebDriverWait Movieswait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement Moviespage = Movieswait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='style-scope ytd-default-promo-panel-renderer grid grid-disabled']")));

        if(Moviespage.isDisplayed()){
            System.out.println("Movies successful");
        }else{
            System.out.println("Movies unsuccessful");
        }
        HamburgerMenuCall();
    }

    public static void LiveButtonCall(){

        WebElement Live = driver.findElement(By.xpath("//*[@title = 'Live']"));
        Live.click();
        WebDriverWait Livewait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement Livepage = Livewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='style-scope ytd-default-promo-panel-renderer grid grid-disabled']")));

        if(Livepage.isDisplayed()){
            System.out.println("Live successful");
        }else{
            System.out.println("Live unsuccessful");
        }
        HamburgerMenuCall();
    }

    public static void GamingButtonCall(){

        WebElement Gaming = driver.findElement(By.xpath("//*[@title = 'Gaming']"));
        Gaming.click();
        WebDriverWait Gamingwait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement Gamingpage = Gamingwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='style-scope ytd-default-promo-panel-renderer grid grid-disabled']")));

        if(Gamingpage.isDisplayed()){
            System.out.println("Gaming successful");
        }else{
            System.out.println("Gaming unsuccessful");
        }
        HamburgerMenuCall();
    }

    public static void SigninCall(){
        WebElement Signinbtn = driver.findElement(By.xpath("(//a[@aria-label= 'Sign in'])[1]"));
        Signinbtn.click();
        WebElement Signpage = driver.findElement(By.xpath("(//input[@id='identifierId'])"));
        if(Signpage!=null){
            System.out.println("Entered sign in page");
            WebElement signintextfield = driver.findElement(By.xpath("(//input[@id='identifierId'])"));
            signintextfield.sendKeys("dineshkumar.l2022ece@sece.ac.in");
            WebElement signin_next_button = driver.findElement(By.xpath("//*[@id='identifierNext']/div/button"));
            signin_next_button.click();
        }
        WebDriverWait passwoedpagewait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement passwordfield = passwoedpagewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//input[@type='password']")));

        if(passwordfield!=null){
            passwordfield.sendKeys("NeverTrustAnyone");
            WebElement nextbtn = driver.findElement(By.xpath("//*[@id='passwordNext']/div/button"));
            nextbtn.click();
        }
    }
    public static void VideoCall(){
        System.out.println("Signed in to YouTube");
        WebDriverWait videowait = new WebDriverWait(driver,Duration.ofSeconds(15));
        WebElement videocard = videowait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@id='video-title'])[1]")));
        videocard.click();
        System.out.println("Video clicked");
        WebElement subscribebtn = videowait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "(//button[@class='yt-spec-button-shape-next yt-spec-button-shape-next--filled yt-spec-button-shape-next--mono yt-spec-button-shape-next--size-m yt-spec-button-shape-next--enable-backdrop-filter-experiment'])[1]"
        )));
        subscribebtn.click();
        System.out.println("subscription clicked");

    }
    public static void SearchbarCall(){
        WebDriverWait homepageloadwait = new WebDriverWait(driver,Duration.ofSeconds(15));
        WebElement searchbar = homepageloadwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='ytSearchboxComponentInput yt-searchbox-input title']")));
        searchbar.sendKeys("Quality Assurance Engineering");
        System.out.println("text entered in search bar");
        WebElement searchbtn = driver.findElement(By.xpath("//*[@id='center']/yt-searchbox/button"));
        searchbtn.click();
        System.out.println("search button clicked");
    }

    public static void MicBtnCall(){
        WebDriverWait micwait = new WebDriverWait(driver,Duration.ofSeconds(5));
        micwait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[@aria-label='Search with your voice']")));
        WebElement micbtn = driver.findElement(By.xpath("//button[@aria-label='Search with your voice']"));
        micbtn.click();
        System.out.println("Mic Button clicked");
        WebElement cancel = micwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Cancel']")));
        cancel.click();
        System.out.println("Cancelled mic button");
    }

    public static void addComment(){
        WebDriverWait commentwait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement commentfield = commentwait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@id='contenteditable-root']")));
        commentfield.sendKeys("Very informative video great work");
        WebElement commentbtn = commentwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Comment']")));
        commentbtn.click();

    }

    public static void NotificationCall(){
        WebElement bell = driver.findElement(By.xpath("//button[@aria-label='Notifications']"));
        bell.click();
        System.out.println("Notification clicked");
//        WebDriverWait notifywait = new WebDriverWait(driver,Duration.ofSeconds(3));
//        WebElement notifybox = driver.findElement(By.xpath("(//div[@id='sections'])[2]"));
//        if(notifybox.isDisplayed()){
//            System.out.println("Notification clicked");
//        }
    }

    public static void HamburgerFunctions(){
        HamburgerMenuCall();

        ShoppingButtonCall();
        HistoryButtonCall();
        MusicButtonCall();
        MoviesButtonCall();
        LiveButtonCall();
        GamingButtonCall();
        SubscriptionsButtonCall();
    }

    public static void UserFlow(){
        SigninCall();
        SearchbarCall();
        VideoCall();
        MicBtnCall();
        NotificationCall();

    }
	public static void main(String[]args) {
        if(driver==null){
            driver = new ChromeDriver();
        }
        driver.get("https://www.youtube.com/");
        String title = driver.getTitle();
        if(!title.equals("YouTube")) {
            driver.quit();
        }
        else {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        }

        HamburgerFunctions();
        UserFlow();

	}
}
