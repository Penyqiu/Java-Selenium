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
    public void checkIfTypedWordIsSearched() throws InterruptedException
    {
        googleSearchPage.checkIfPageIsOpened();
        Thread thread = new Thread();
        thread.sleep(1000);
        googleSearchPage.confirm();
        thread.sleep(1000);
        googleSearchPage.enterTextIntoInputAndSearch("asd");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkAboutUsButton() throws InterruptedException
    {
        thread.sleep(1000);
        googleSearchPage.confirm();
        thread.sleep(1000);
        googleSearchPage.findAboutUsButtonAndCheckResult();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkPromoteButton() throws InterruptedException
    {
        thread.sleep(1000);
        googleSearchPage.confirm();
        thread.sleep(1000);
        googleSearchPage.findPromoteButtonAndCheckResult();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkForCompaniesButton() throws InterruptedException
    {
        thread.sleep(1000);
        googleSearchPage.confirm();
        thread.sleep(1000);
        googleSearchPage.findForCompaniesButtonAndCheckResult();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkHowBrowserWorksButton() throws InterruptedException
    {
        thread.sleep(1000);
        googleSearchPage.confirm();
        thread.sleep(1000);
        googleSearchPage.findHowBrowserWorksButtonAndCheckResult();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkifSentenceIsSearched() throws InterruptedException
    {
        googleSearchPage.checkIfPageIsOpened();
        Thread thread = new Thread();
        thread.sleep(1000);
        googleSearchPage.confirm();
        thread.sleep(1000);
        googleSearchPage.enterTextIntoInputAndSearch("asd asd asd asd");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkLuckyMeButton() throws InterruptedException
    {
        thread.sleep(1000);
        googleSearchPage.confirm();
        thread.sleep(1000);
        googleSearchPage.findLuckyMeButtonAndCheckResult();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkOnScreenKeyboard() throws InterruptedException
    {
        thread.sleep(1000);
        googleSearchPage.confirm();
        thread.sleep(1000);
        googleSearchPage.findOnScreenKeyboardButtonAndCheckResult();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkGmailButton() throws InterruptedException
    {
        thread.sleep(1000);
        googleSearchPage.confirm();
        thread.sleep(1000);
        googleSearchPage.findGmailButtonAndCheckResult();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkImagesButton() throws InterruptedException
    {
        thread.sleep(1000);
        googleSearchPage.confirm();
        thread.sleep(1000);
        googleSearchPage.findImagesButtonAndCheckResult();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkPrivateButton() throws InterruptedException
    {
        thread.sleep(1000);
        googleSearchPage.confirm();
        thread.sleep(1000);
        googleSearchPage.findPrivateButtonAndCheck();
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkTermsButton() throws InterruptedException
    {
        thread.sleep(1000);
        googleSearchPage.confirm();
        thread.sleep(1000);
        googleSearchPage.findTermsButtonAndCheck();
    }


    @Test
    @TestRail(testCaseId = {})
    public void checkAppsButton() throws InterruptedException
    {
        thread.sleep(1000);
        googleSearchPage.confirm();
        thread.sleep(1000);
        googleSearchPage.checkAppsButton();
    }


    @Test
    @TestRail(testCaseId = {})
    public void selectYoutubeIconInApps() throws InterruptedException
    {
        Thread thread = new Thread();
        thread.sleep(1000);
        googleSearchPage.confirm();
        thread.sleep(1000);
        googleSearchPage.selectGoogleApp("");
        thread.sleep(1000);
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfPictureOfHolidaysIsShown() throws InterruptedException
    {
        Thread thread = new Thread();
        thread.sleep(1000);
        googleSearchPage.confirm();
        thread.sleep(1000);
        googleSearchPage.checkHoliday();
        thread.sleep(1000);
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfShareButtonIsVisible() throws InterruptedException
    {
        Thread thread = new Thread();
        thread.sleep(1000);
        googleSearchPage.confirm();
        thread.sleep(1000);
        googleSearchPage.isShareButtonIsVisible();
        thread.sleep(1000);
    }


    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
