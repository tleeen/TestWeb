package org.example;

import org.example.ui.AuthPageObject;
import org.example.ui.ProfilePageObject;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MainTest {

    @Test
    public void Test(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.ru/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        AuthPageObject authPageObject = new AuthPageObject(driver);

        authPageObject.waitExit("//*[@class='resplash-btn resplash-btn_primary resplash-btn_mailbox-big iimegem-de8k2m']");

        authPageObject.switchFrame("//*[@class='ag-popup__frame__layout__iframe']");

        authPageObject.insertLogin("//*[@name='username']");

        authPageObject.waitEnterPassword("//*[@class='base-0-2-79 primary-0-2-93']");

        authPageObject.insertPassword("//*[@name='password']");

        authPageObject.logIn("//*[@class='base-0-2-79 primary-0-2-93']");


        ProfilePageObject profilePageObject = new ProfilePageObject(driver);

        profilePageObject.waitLogo("//*[@class='ph-avatar-img svelte-dfhuqc']");

        profilePageObject.checkName("//*[@class='ph-name svelte-1popff4']");

        profilePageObject.waitOut("//*[@class='ph-item ph-item__social svelte-1popff4' and @tabindex='0']");

        profilePageObject.checkDoCreateMail("//*[@class='resplash-btn resplash-btn_outlined-themed resplash-btn_mailbox-big iimegem-de8k2m']");

    }
}
