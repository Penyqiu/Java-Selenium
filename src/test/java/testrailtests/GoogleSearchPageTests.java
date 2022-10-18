package testrailtests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import configuration.Initialization;
import pages.GoogleSearchPage;
import testrail.TestRail;

public class GoogleSearchPageTests extends Initialization{
    
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    Thread thread = new Thread();
    public GoogleSearchPageTests(){
        super();
    }

    @BeforeMethod
    public void setUp()
    {
        driverInitialization();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfGooglePageIsOpened() throws InterruptedException
    {
        googleSearchPage.checkIfPageIsOpened();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfCorrectResultPageIsOpened() throws InterruptedException
    {

        googleSearchPage.checkIfPageIsOpened();

        googleSearchPage.confirm();

        googleSearchPage.enterTextIntoInputAndSearchByKey("szukaj");

        googleSearchPage.checkSearchResult("szukaj");

    }


    @Test
    @TestRail(testCaseId = {})
    public void checkIfTypedWordIsSearched() throws InterruptedException
    {
        googleSearchPage.checkIfPageIsOpened();
        Thread thread = new Thread();
        // (1000);
        googleSearchPage.confirm();
       // (1000);
        googleSearchPage.enterTextIntoInputAndSearch("asd");

    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIsSearchingByKeyboardIsWorking() throws InterruptedException
    {
        googleSearchPage.checkIfPageIsOpened();
        Thread thread = new Thread();
        // (1000);
        googleSearchPage.confirm();
        // (1000);
        googleSearchPage.enterTextIntoInputAndSearchByKey("asd");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkAboutUsButton() throws InterruptedException
    {
       // (1000);
        googleSearchPage.confirm();
       // (1000);
        googleSearchPage.findAboutUsButtonAndCheckResult();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkPromoteButton() throws InterruptedException
    {
       // (1000);
        googleSearchPage.confirm();
       // (1000);
        googleSearchPage.findPromoteButtonAndCheckResult();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkForCompaniesButton() throws InterruptedException
    {
       // (1000);
        googleSearchPage.confirm();
       // (1000);
        googleSearchPage.findForCompaniesButtonAndCheckResult();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkHowBrowserWorksButton() throws InterruptedException
    {
      //  (1000);
        googleSearchPage.confirm();
       // (1000);
        googleSearchPage.findHowBrowserWorksButtonAndCheckResult();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkifSentenceIsSearched() throws InterruptedException
    {
        googleSearchPage.checkIfPageIsOpened();
       // Thread thread = new Thread();
       // (1000);
        googleSearchPage.confirm();
       // (1000);
        googleSearchPage.enterTextIntoInputAndSearch("asd asd asd asd");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkLuckyMeButton() throws InterruptedException
    {
       // (1000);
        googleSearchPage.confirm();
       // (1000);
        googleSearchPage.findLuckyMeButtonAndCheckResult();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkOnScreenKeyboard() throws InterruptedException
    {
       // (1000);
        googleSearchPage.confirm();
       // (1000);
        googleSearchPage.findOnScreenKeyboardButtonAndCheckResult();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkGmailButton() throws InterruptedException
    {
       // (1000);
        googleSearchPage.confirm();
      //  (1000);
        googleSearchPage.findGmailButtonAndCheckResult();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkImagesButton() throws InterruptedException
    {
      //  (1000);
        googleSearchPage.confirm();
      //  (1000);
        googleSearchPage.findImagesButtonAndCheckResult();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkPrivateButton() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.findPrivateButtonAndCheck();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkTermsButton() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.findTermsButtonAndCheck();
    }


    @Test
    @TestRail(testCaseId = {})
    public void checkAppsButton() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.checkAppsButton();
    }


    @Test
    @TestRail(testCaseId = {})
    public void selectYoutubeIconInApps() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfPictureOfHolidaysIsShown() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.checkHoliday();
    }



    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
