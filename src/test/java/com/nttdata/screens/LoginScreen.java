package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LoginScreen extends PageObject {

    @AndroidFindBy(id ="test-Username")
    private WebElement userInput;

    @AndroidFindBy(id = "test-Password")
    private WebElement passInput;

    @AndroidFindBy(id = "test-LOGIN")
    private WebElement btnLogin;


    public void userInput(String username){
        userInput.click();
        userInput.sendKeys((username));
    }

    public void passInput(String password){
        passInput.click();
        passInput.sendKeys(password);
    }
    public void clicLogin(){
        btnLogin.click();
    }

}
