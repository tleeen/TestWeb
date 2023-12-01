package org.example.ui;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ProfilePageObject{

    protected WebDriver driver;

    public ProfilePageObject(WebDriver driver){
        this.driver = driver;
    }

    private void clickOnElement(String string){
        driver.findElement(
                By.xpath(string)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    private void insertData(String string, String name){
        driver.findElement
                (By.xpath(name)).clear();

        driver.findElement
                (By.xpath(name)).sendKeys(string);
    }

    public void waitLogo(String string){
        clickOnElement(string);
    }

    public void checkName(String string){
        String text = driver.findElement(By.xpath(string)).getText();
        Assert.assertEquals(text, "Петр Иванов");
    }

    public void waitOut(String string){
        clickOnElement(string);
    }

    public void checkDoCreateMail(String string){
        driver.findElement(By.xpath(string)).isDisplayed();
    }

}
