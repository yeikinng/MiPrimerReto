package com.dekosas.StepDefintions;


import com.dekosas.Steps.LoginStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinition {

    @Steps
    LoginStep loginStep;


    @Dado("^el usuario se encuentre en la pagina web$")
    public void elUsuarioSeEncuentreEnLaPaginaWeb() throws IOException {
     loginStep.abrirPagina();
    }



    @Cuando("^el ingrese el correo y la clave$")
    public void el_ingrese_el_correo_y_la_clave() throws IOException {
    loginStep.clicCuenta();
    loginStep.ingresarCorreo();
    loginStep.ingresarClave();
    loginStep.clicEntrar();
    }


    @Entonces("^el usuario visualizara un mensaje de inicio de sesion exitoso$")
    public void elUsuarioVisualizaraUnMensajeDeInicioDeSesionExitoso() {

    }


}
