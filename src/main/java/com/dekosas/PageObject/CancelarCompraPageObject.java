package com.dekosas.PageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class CancelarCompraPageObject extends PageObject {

    By txtMenuTienda = By.xpath("//div[@class='menu-title closed']");
    By txtCategoriaCocina = By.xpath("//a[@href='https://dekosas.com/co/mesa-y-cocina']");
    By txtSubCategoria = By.xpath("//a[@href='https://dekosas.com/co/mesa-y-cocina?cat=349']");
    By txtProductoUno = By.xpath("//a[@class='product-item-link'][@href='https://dekosas.com/co/cuchillo-tasty-colors-trinchante-grande-menta-brabantia']");
    By btnAgregarProducto = By.xpath("//button[@type='submit'][@id='product-addtocart-button']");
    By txtProductoDos = By.xpath("//a[@class='product-item-link'][@href='https://dekosas.com/co/set-x-2-pitillo-reutilizable-metalico-blanco-blanco-landik']");
    By btnAgregarProductoDos = By.xpath("//button[@title='Agregar al Carrito'][@id='product-addtocart-button']");
    By txtProductoTres = By.xpath("//a[@class='product-item-link'][@href='https://dekosas.com/co/servilletero-cq-natural-blanco-8x12x5-5-usm-maderas']");
    By btnAgregarProductoTres = By.xpath("//button[@class='action primary tocart'][@id='product-addtocart-button']");
    By btnCaja = By.xpath("//button[@type='button'][@title='Pasar por caja']");

    By txtNombre = By.xpath("//input[@class='input-text'][@id='GHGXX2F']");
    By txtApellido = By.xpath("//input[@class='input-text'][@id='B1XGB59']");
    By txtDireccion = By.xpath("//input[@class='input-text'][@id='TBW9593']");
    By ltsPais = By.xpath("//select[@class='select'][@id='XH2LPJO']");
    By ltsEstado = By.xpath("//select[@class='select'][@id='CDKRKC1']");
    By ltsCiudad = By.xpath("//select[@class='select'][@id='PA4HCYO-select']");
    By txtTelefono = By.xpath("//input[@class='input-text'][@id='GNB067D']");
    By ltsTipoId = By.xpath("//select[@class='select'][@id='F63QO63']");
    By txtNumId = By.xpath("//input[@class='input-text'][@id='DX27DDI']");
    By btnSiguiente = By.xpath("//button[@type='submit'][@class='button action continue primary']");
    By txtCarrito = By.xpath("//a[@class='action showcart'][@href='https://dekosas.com/co/checkout/cart/']");
    By txtVerCarrito = By.xpath("//a[@class='action viewcart'][@href='https://dekosas.com/co/checkout/cart/']");
    By txtEliminarProd = By.xpath("//a[@title='Eliminar artículo'][@class='action action-delete']");

    public By getTxtMenuTienda() {
        return txtMenuTienda;
    }

    public By getTxtCategoriaCocina() {
        return txtCategoriaCocina;
    }

    public By getTxtSubCategoria() {
        return txtSubCategoria;
    }

    public By getTxtProductoUno() {
        return txtProductoUno;
    }

    public By getTxtProductoDos() {
        return txtProductoDos;
    }

    public By getTxtProductoTres() {
        return txtProductoTres;
    }

    public By getBtnAgregarProducto() {
        return btnAgregarProducto;
    }

    public By getBtnAgregarProductoDos() {
        return btnAgregarProductoDos;
    }

    public By getBtnAgregarProductoTres() {
        return btnAgregarProductoTres;
    }

    public By getBtnCaja() {
        return btnCaja;
    }

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getTxtDireccion() {
        return txtDireccion;
    }

    public By getLtsPais() {
        return ltsPais;
    }

    public By getLtsEstado() {
        return ltsEstado;
    }

    public By getLtsCiudad() {
        return ltsCiudad;
    }

    public By getTxtTelefono() {
        return txtTelefono;
    }

    public By getLtsTipoId() {
        return ltsTipoId;
    }

    public By getTxtNumId() {
        return txtNumId;
    }

    public By getBtnSiguiente() {
        return btnSiguiente;
    }

    public By getTxtCarrito() {
        return txtCarrito;
    }

    public By getTxtVerCarrito() {
        return txtVerCarrito;
    }

    public By getTxtEliminarProd() {
        return txtEliminarProd;
    }
}
