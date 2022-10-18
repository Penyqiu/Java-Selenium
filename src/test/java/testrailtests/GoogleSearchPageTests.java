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
    public void checkIfYoutubeAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("YouTube");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfAccountAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Konto");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfSearchAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Szukaj");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfMapAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Mapy");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfPlayAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Play");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfNewsAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Wiadomości");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfGmailAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Gmail");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfMeetAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Meet");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfChatAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Czat");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfContactsAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Kontakty");
    }
    @Test
    @TestRail(testCaseId = {})
    public void checkIfDriveAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Dysk");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfCalendarAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Kalendarz");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfTranslatorAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Tłumacz");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfPhotoAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Zdjęcie");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfDuoAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Duo");
    }


    @Test
    @TestRail(testCaseId = {})
    public void checkIfShopAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Zakupy");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfFinancesAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Finanse");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfDocumentsAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Dokumenty");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfSheetsAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Arkusze");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfPresentationsAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Prezentacje");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfBooksAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Książki");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfBloggerAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Blogger");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfHangoutsAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Hangouts");
    }
    @Test
    @TestRail(testCaseId = {})
    public void checkIfKeepAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Keep");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfJamboardAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Jamboard");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfClassroomAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Classroom");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfEarthAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Earth");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfCollectionAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Kolekcje");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfArtAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Sztuka i kultura");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfGoogleAdsAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Google Ads");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfPodcastsAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Podcasty");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfStadiaAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Stadia");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfGoogleOneAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Google One");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfTravelAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Podróże");
    }

    @Test
    @TestRail(testCaseId = {})
    public void checkIfFormsAppIsAvaiable() throws InterruptedException
    {
        googleSearchPage.confirm();
        googleSearchPage.selectGoogleApp("Formularze");
    }




    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
