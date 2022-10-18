package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import configuration.Initialization;

public class GoogleSearchPage extends Initialization {
    
    public String searchInput = "//*[@name='q']";
    public String searchButton = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]";

    public GoogleSearchPage() {
        super();
    }


    public void confirm() {
        boolean checkIfVisible = driver.findElement(By.xpath("//*[@id='CXQnmb']/div")).isDisplayed();
        if(checkIfVisible){
            driver.findElement(By.xpath("//*[@id='L2AGLb']")).click();
        }
        else{
            driver.quit();
        }
   
    }

    public void checkSearchResult(String expectedTitle) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> ((JavascriptExecutor) d).executeScript("return document.readyState !== 'loading'"));
        if(driver.getTitle() != null && driver.getTitle().contains(expectedTitle)){
            System.out.println(driver.getTitle());
            System.out.println("Web page is opened");
        }
        else{
            System.out.println(driver.getTitle());
            System.out.println("Web page could not open.");
        }

    }



    public void checkIfPageIsOpened() {
        System.out.println("Page title is : " + driver.getTitle());
        assertEquals("Google", driver.getTitle());
    }

    public void enterTextIntoInputAndSearch(String type) {
        driver.findElement(By.xpath(searchInput)).sendKeys(type);
        driver.findElement(By.xpath(searchButton)).click();
    }

    public void enterTextIntoInputAndSearchByKey(String type) {
        driver.findElement(By.xpath(searchInput)).sendKeys(type);
        driver.findElement(By.xpath(searchInput)).sendKeys(Keys.RETURN);
    }

    public void selectGoogleApp(String appName){
        WebElement apps = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("gbwa")));
        apps.click();

        WebElement specifiedApp = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/ul[1]/li[8]/a/div[5]/span")));
        specifiedApp.click();
    }

    public void checkAppsButton(){
        WebElement apps = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("gbwa")));
        apps.click();

    }

    public boolean checkHoliday(){
        boolean check = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a/picture")).isDisplayed();
        if(check){
            return true;
        }else{
            return false;
        }
    }


    public void findAboutUsButtonAndCheckResult(){
        boolean check = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[1]")).isDisplayed();
        if(check){
            driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[1]")).click();
            String url = driver.getCurrentUrl();
            
            assertEquals("https://about.google/?utm_source=google-PL&utm_medium=referral&utm_campaign=hp-footer&fg=1", url);
        }else{
            driver.quit();
        }
    }

    public void findPromoteButtonAndCheckResult(){
        boolean check = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[2]")).isDisplayed();
        if(check){
            driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[2]")).click();
            String url = driver.getCurrentUrl();
            
            assertEquals("https://ads.google.com/intl/pl_pl/home/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1", url);
        }else{
            driver.quit();
        }
    }

    public void findForCompaniesButtonAndCheckResult(){
        boolean check = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[3]")).isDisplayed();
        if(check){
            driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[3]")).click();
            String url = driver.getCurrentUrl();
            
            assertEquals("https://www.google.com/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpbfooter&fg=1#?modal_active=none", url);
        }else{
            driver.quit();
        }
    }

    public void findHowBrowserWorksButtonAndCheckResult(){
        boolean check = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[4]")).isDisplayed();
        if(check){
            driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[4]")).click();
            String url = driver.getCurrentUrl();
            
            assertEquals("https://www.google.com/search/howsearchworks/?fg=1", url);
        }else{
            driver.quit();
        }
    }

    public void findGmailButtonAndCheckResult(){
        boolean check = driver.findElement(By.xpath("//*[@id='gb']/div/div[1]/div/div[1]/a")).isDisplayed();
        if(check){
            driver.findElement(By.xpath("//*[@id='gb']/div/div[1]/div/div[1]/a")).click();
            String url = driver.getCurrentUrl();
            
            assertEquals("https://www.google.com/intl/pl/gmail/about/", url);
        }else{
            driver.quit();
        }
    }

    public void findLuckyMeButtonAndCheckResult(){
        boolean check = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]")).isDisplayed();
        if(check){
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]")).click();
            String url = driver.getCurrentUrl();
            
            assertEquals("https://www.google.com/doodles", url);
        }else{
            driver.quit();
        }
    }

    public void findOnScreenKeyboardButtonAndCheckResult(){
        boolean check = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[3]/div[2]/span")).isDisplayed();
        if(check){
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[3]/div[2]/span")).click();
            
            boolean keyboard = driver.findElement(By.xpath("//*[@id='kbd']")).isDisplayed();
            if(keyboard){
                assertTrue("K found", keyboard);
            }
            else{
                assertFalse("Not found", keyboard);
            }
            
            
        }else{
            driver.quit();
        }
    }

    public void findImagesButtonAndCheckResult(){
        boolean check = driver.findElement(By.xpath("//*[@id='gb']/div/div[1]/div/div[2]/a")).isDisplayed();
        if(check){
            driver.findElement(By.xpath("//*[@id='gb']/div/div[1]/div/div[2]/a")).click();
            String url = driver.getCurrentUrl();
            
            assertEquals("https://www.google.pl/imghp?hl=pl&ogbl", url);
        }else{
            driver.quit();
        }
    }

    public void findPrivateButtonAndCheck(){
        boolean check = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/a[1]")).isDisplayed();
        if(check){
            driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/a[1]")).click();
            String url = driver.getCurrentUrl();
            
            assertEquals("https://sustainability.google/intl/pl/carbon-free/?utm_source=googlehpfooter&utm_medium=housepromos&utm_campaign=bottom-footer&utm_content=#year-1998", url);
        }else{
            driver.quit();
        }
    }

    public void findTermsButtonAndCheck(){
        boolean check = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/div[2]/a[2]")).isDisplayed();
        if(check){
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/div[2]/a[2]")).click();
            String url = driver.getCurrentUrl();
            
            assertEquals("https://policies.google.com/terms?hl=pl&fg=1", url);
        }else{
            driver.quit();
        }
    }

    public void findSettingsButtonAndCheck(){
        boolean check = driver.findElement(By.xpath("//*[@id='ow17']/div")).isDisplayed();
        if(check){
            driver.findElement(By.xpath("//*[@id='ow17']/div")).click();

            boolean popup = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/span/span/g-popup/div/div")).isDisplayed();
            if(popup){
                assertTrue("K found", popup);
            }
            else{
                assertFalse("Not found", popup);
            }
            
        }else{
            driver.quit();
        }
    }



}
