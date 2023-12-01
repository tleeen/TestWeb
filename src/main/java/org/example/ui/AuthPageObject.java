package org.example.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class AuthPageObject{

    protected WebDriver driver;

    String password = "1xY%dfulR1RS",
            login = "peterivan555";

    public AuthPageObject(WebDriver driver){
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

    public void waitExit(String string){
        clickOnElement(string);
    }

    public void switchFrame(String string){
        WebElement frame = driver.findElement(
                By.xpath(string));

        driver.switchTo().frame(frame);
    }

    public void insertLogin(String string){
        insertData(login, string);
    }

    public void waitEnterPassword(String string){
        clickOnElement(string);
    }

    public void insertPassword(String string){
        insertData(password, string);
    }

    public void logIn(String string){
        clickOnElement(string);
    }
}
