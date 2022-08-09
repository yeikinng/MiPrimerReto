package com.dekosas.Steps;

import com.dekosas.PageObject.ComprasPageObject;
import com.dekosas.Utils.DatosReto;
import com.dekosas.Utils.EsperaExplicita;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class ComprasStep {

    ComprasPageObject comprasPageObject = new ComprasPageObject();
    DatosReto datosReto = new DatosReto();
    EsperaExplicita esperaExplicita = new EsperaExplicita();



    @Step
    public void seleccionarTienda(){
        esperaExplicita.esperarExplilicitaTexto(comprasPageObject.getDriver(), comprasPageObject.getTxtTienda());
        comprasPageObject.getDriver().findElement(comprasPageObject.getTxtTienda()).click();
    }
    @Step
    public void seleccionarCocina(){
        esperaExplicita.esperarExplilicitaTexto(comprasPageObject.getDriver(), comprasPageObject.getTxtCocina());
        comprasPageObject.getDriver().findElement(comprasPageObject.getTxtCocina()).click();
    }
    @Step
    public void seleccionarCategoria(){
        esperaExplicita.esperarExplilicitaTexto(comprasPageObject.getDriver(), comprasPageObject.getTxtCategoria());
        comprasPageObject.getDriver().findElement(comprasPageObject.getTxtCategoria()).click();
    }

    @Step
    public void seleccionarProducto(){
        esperaExplicita.esperarExplilicitaTexto(comprasPageObject.getDriver(), comprasPageObject.getTxtProducto());
        comprasPageObject.getDriver().findElement(comprasPageObject.getTxtProducto()).click();
    }
    @Step
    public void seleccionarCantidad(){

        esperaExplicita.esperarExplilicitaTexto(comprasPageObject.getDriver(), comprasPageObject.getTxtCantidad());
        comprasPageObject.getDriver().findElement(comprasPageObject.getTxtCantidad()).click();
        comprasPageObject.getDriver().findElement(comprasPageObject.getTxtCantidad()).click();
    }
    @Step
    public void clicAgregar(){
        esperaExplicita.esperarExplilicitaTexto(comprasPageObject.getDriver(), comprasPageObject.getBtnAgregar());
        comprasPageObject.getDriver().findElement(comprasPageObject.getBtnAgregar()).click();
    }
    @Step
    public void regresarHome(){
        esperaExplicita.esperarExplilicitaTexto(comprasPageObject.getDriver(), comprasPageObject.getTxtHome());
        comprasPageObject.getDriver().findElement(comprasPageObject.getTxtHome()).click();
    }
    @Step
    public void buscarProducto() throws IOException {
        comprasPageObject.getDriver().findElement(comprasPageObject.getTxtBuscar())
                .sendKeys(datosReto.leerDatosExcel("DatosReto.xlsx","BuscarProd",1,0));
    }
    @Step
    public void clicBuscar (){
        esperaExplicita.esperarExplilicitaTexto(comprasPageObject.getDriver(), comprasPageObject.getBtnBuscar());
        comprasPageObject.getDriver().findElement(comprasPageObject.getBtnBuscar()).click();
    }
    @Step
    public void SelecionarSegundoProducto(){
        esperaExplicita.esperarExplilicitaTexto(comprasPageObject.getDriver(), comprasPageObject.getTxtProductoDos());
        comprasPageObject.getDriver().findElement(comprasPageObject.getTxtProductoDos()).click();
    }
    @Step
    public void clicAgregarProducto (){
        esperaExplicita.esperarExplilicitaTexto(comprasPageObject.getDriver(), comprasPageObject.getBtnAgregarProd());
        comprasPageObject.getDriver().findElement(comprasPageObject.getBtnAgregarProd()).click();
    }

}
