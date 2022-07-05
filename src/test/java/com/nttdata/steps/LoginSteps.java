package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    LoginScreen loginScreen;


    @Step("Ingresa usuario")
    public void typeUser(String user){
        loginScreen.userInput(user);
    }

    @Step("Ingresa password")
    public void typePass(String pass){
        loginScreen.passInput(pass);

    }

    @Step("clicl en boton login")
    public void login(){
        loginScreen.clicLogin();
    }




}
