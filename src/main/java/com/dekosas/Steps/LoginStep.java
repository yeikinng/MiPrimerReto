package com.dekosas.Steps;


import com.dekosas.PageObject.LoginPageObject;
import com.dekosas.Utils.DatosReto;
import net.thucydides.core.annotations.Step;

import java.io.IOException;


public class LoginStep {

    LoginPageObject loginPageObject = new LoginPageObject();
    DatosReto datosReto = new DatosReto();


    @Step
    public void abrirPagina() throws IOException {
        loginPageObject.openUrl(datosReto.leerDatosExcel("DatosReto.xlsx","Url",0,0));

    }

    @Step
    public void clicCuenta (){

        loginPageObject.getDriver().findElement(loginPageObject.getTxtCuenta()).click();
    }

    @Step
    public void ingresarCorreo() throws IOException {
        loginPageObject.getDriver().findElement(loginPageObject.getTxtCorreoElectronico())
                .sendKeys(datosReto.leerDatosExcel("DatosReto.xlsx","Login",1,0));

    }

    @Step
    public void ingresarClave() throws IOException {

        loginPageObject.getDriver().findElement(loginPageObject.getTxtClave())
                .sendKeys(datosReto.leerDatosExcel("DatosReto.xlsx","Login",1,1));
    }

    @Step
    public void clicEntrar(){
        loginPageObject.getDriver().findElement(loginPageObject.getBtnEntrar()).click();
    }

}
