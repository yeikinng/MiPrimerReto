package com.dekosas.PageObject;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

//@DefaultUrl("https://dekosas.com/")


public class LoginPageObject extends PageObject {

    By txtCuenta = By.xpath("//p[@style='font-weight: 700; font-size: 16px; line-height: 16px; color: #282d3b;']");
    By txtCorreoElectronico = By.xpath("//input[@id='social_login_email']");
    By txtClave = By.xpath("//input[@id='social_login_pass']");
    By btnEntrar = By.xpath("//button[@id='bnt-social-login-authentication']");


    public By getTxtCuenta() {
        return txtCuenta;
    }

    public By getTxtCorreoElectronico() {
        return txtCorreoElectronico;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnEntrar() {
        return btnEntrar;
    }
}




