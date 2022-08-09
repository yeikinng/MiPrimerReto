package com.dekosas.Steps;

import com.dekosas.PageObject.CancelarCompraPageObject;
import com.dekosas.PageObject.ComprasPageObject;
import com.dekosas.Utils.DatosReto;
import com.dekosas.Utils.EsperaExplicita;
import com.dekosas.Utils.ListaDesplegable;
import com.dekosas.Utils.Scroll;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class CancelarCompraStep {

    CancelarCompraPageObject cancelarCompraPageObject = new CancelarCompraPageObject();
    DatosReto datosReto = new DatosReto();
    Scroll scroll = new Scroll();
    EsperaExplicita esperaExplicita = new EsperaExplicita();
    ListaDesplegable listaDesplegable = new ListaDesplegable();

    @Step
    public void oprimirMenuTienda(){

        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getTxtMenuTienda());
        cancelarCompraPageObject.getDriver().findElement(cancelarCompraPageObject.getTxtMenuTienda()).click();

    }
    @Step
    public void presionarCategoriaCocina(){
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getTxtCategoriaCocina());
        cancelarCompraPageObject.getDriver().findElement(cancelarCompraPageObject.getTxtCategoriaCocina()).click();
    }
    @Step
    public void presionarSubCategoria(){
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getTxtSubCategoria());
        cancelarCompraPageObject.getDriver().findElement(cancelarCompraPageObject.getTxtSubCategoria()).click();
    }
    @Step
    public void seleccionarProductoUno(){
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getTxtProductoUno());
        //scroll.scrollElemento(cancelarCompraPageObject.getDriver(),cancelarCompraPageObject.getTxtProductoUno());
        cancelarCompraPageObject.getDriver().findElement(cancelarCompraPageObject.getTxtProductoUno()).click();
    }
    @Step
    public void agregarProducto(){
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getBtnAgregarProducto());
        cancelarCompraPageObject.getDriver().findElement(cancelarCompraPageObject.getBtnAgregarProducto()).click();
    }
    @Step
    public void RetrocederPagina (){
        cancelarCompraPageObject.getDriver().navigate().back();
        cancelarCompraPageObject.getDriver().navigate().back();
    }
    @Step
    public void seleccionarProductoDos(){
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getTxtProductoDos());
        scroll.scrollElemento(cancelarCompraPageObject.getDriver(),cancelarCompraPageObject.getTxtProductoDos());
        cancelarCompraPageObject.getDriver().findElement(cancelarCompraPageObject.getTxtProductoDos()).click();
    }
    @Step
    public void agregarProductoDos(){
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getBtnAgregarProducto());
        cancelarCompraPageObject.getDriver().findElement(cancelarCompraPageObject.getBtnAgregarProductoDos()).click();
    }

    @Step
    public void seleccionarProductoTres(){
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getTxtProductoTres());
        scroll.scrollElemento(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getTxtProductoTres());
        cancelarCompraPageObject.getDriver().findElement(cancelarCompraPageObject.getTxtProductoTres()).click();
    }
    @Step
    public void agregarProductoTres(){
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getBtnAgregarProducto());
        cancelarCompraPageObject.getDriver().findElement(cancelarCompraPageObject.getBtnAgregarProductoTres()).click();
    }

    @Step
    public void PresionarBotonCaja() {
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getBtnCaja());
        cancelarCompraPageObject.getDriver().findElement(cancelarCompraPageObject.getBtnCaja()).click();
    }

    @Step
    public  void  ingresarNombre() throws IOException {
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getTxtNombre());
        cancelarCompraPageObject.getDriver().findElement( cancelarCompraPageObject.getTxtNombre())
                .sendKeys(datosReto.leerDatosExcel("DatosReto.xlsx","Caja",1,0));
    }
    @Step
    public  void  ingresarApellido() throws IOException {
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getTxtApellido());
        cancelarCompraPageObject.getDriver().findElement( cancelarCompraPageObject.getTxtApellido())
                .sendKeys(datosReto.leerDatosExcel("DatosReto.xlsx","Caja",1,1));

    }
    @Step
    public  void  ingresarDireccion() throws IOException {
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getTxtDireccion());
        cancelarCompraPageObject.getDriver().findElement( cancelarCompraPageObject.getTxtDireccion())
                .sendKeys(datosReto.leerDatosExcel("DatosReto.xlsx","Caja",1,2));

    }
    @Step
    public  void  seleccionarPais() throws IOException {
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getLtsPais());
        String valor = datosReto.leerDatosExcel("DatosReto.xlsx","Caja",1,3);
        listaDesplegable.seleccionarTextoVisible(cancelarCompraPageObject.getDriver(),cancelarCompraPageObject.getLtsPais(),valor);

    }
    @Step
    public  void  seleccionarEstado() throws IOException {
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getLtsEstado());
        String valor = datosReto.leerDatosExcel("DatosReto.xlsx","Caja",1,4);
        listaDesplegable.seleccionarTextoVisible(cancelarCompraPageObject.getDriver(),cancelarCompraPageObject.getLtsEstado(),valor);

    }
    @Step
    public  void  seleccionarCiudad() throws IOException {
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getLtsCiudad());
        String valor = datosReto.leerDatosExcel("DatosReto.xlsx","Caja",1,5);
        listaDesplegable.seleccionarTextoVisible(cancelarCompraPageObject.getDriver(),cancelarCompraPageObject.getLtsCiudad(),valor);


    }
    @Step
    public  void  ingresarTelefono() throws IOException {
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getTxtTelefono());
        cancelarCompraPageObject.getDriver().findElement( cancelarCompraPageObject.getTxtTelefono())
                .sendKeys(datosReto.leerDatosExcel("DatosReto.xlsx","Caja",1,6));
    }
    @Step
    public  void  seleccionarTipoId() throws IOException {
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getLtsTipoId());
        String valor = datosReto.leerDatosExcel("DatosReto.xlsx","Caja",1,7);
        listaDesplegable.seleccionarTextoVisible(cancelarCompraPageObject.getDriver(),cancelarCompraPageObject.getLtsTipoId(),valor);


    }
    @Step
    public  void  ingresarNumid() throws IOException {
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getTxtNumId());
        cancelarCompraPageObject.getDriver().findElement( cancelarCompraPageObject.getTxtNumId())
                .sendKeys(datosReto.leerDatosExcel("DatosReto.xlsx","Caja",1,8));
    }
    @Step
    public  void  presionarSiguiente(){
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getBtnSiguiente());
        cancelarCompraPageObject.getDriver().findElement(cancelarCompraPageObject.getBtnSiguiente()).click();
    }
    @Step
    public  void  presionarCarrito(){
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getTxtCarrito());
        cancelarCompraPageObject.getDriver().findElement(cancelarCompraPageObject.getTxtCarrito()).click();
    }
    @Step
    public  void  verCarrito(){
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getTxtVerCarrito());
        cancelarCompraPageObject.getDriver().findElement(cancelarCompraPageObject.getTxtVerCarrito()).click();
    }
    @Step
    public  void  eliminarProductos(){
        esperaExplicita.esperarExplilicitaTexto(cancelarCompraPageObject.getDriver(), cancelarCompraPageObject.getTxtEliminarProd());
        cancelarCompraPageObject.getDriver().findElement(cancelarCompraPageObject.getTxtEliminarProd()).click();
    }
















}
