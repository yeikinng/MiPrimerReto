package com.dekosas.PageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ComprasPageObject extends PageObject {

    By txtTienda = By.xpath("//div[@class='menu-title closed']");
    By txtCocina = By.xpath("//a[@href='https://dekosas.com/co/mesa-y-cocina']");
    By txtCategoria = By.xpath("//a[@href='https://dekosas.com/co/mesa-y-cocina?cat=349']");
    By txtProducto = By.xpath("//a[@class='product-item-link'][@href='https://dekosas.com/co/cuchillo-tasty-colors-para-pelar-peque-o-amarillo-brabantia']");
    By txtCantidad = By.xpath("//div/a[@href='javascript:void(0)'][@class='qty-inc']");
    By btnAgregar = By.xpath("//button[@type='submit'][@id='product-addtocart-button']");
    By txtHome = By.xpath("//a[@class='logo'][@title='DEKOSAS']");
    By txtBuscar = By.xpath("//input[@id='search']");
    By btnBuscar = By.xpath("//button[@type='submit'][@title='Buscar']");
    By txtProductoDos = By.xpath("//a[@class='product-item-link'][@href='https://dekosas.com/co/tarro-pi-a-lunita-570-ml-19-6-oz-lunita']");
    By btnAgregarProd = By.xpath("//button[@title='Agregar al Carrito'][@id='product-addtocart-button']");


    public By getTxtTienda() {
        return txtTienda;
    }

    public By getTxtCocina() {
        return txtCocina;
    }

    public By getTxtCategoria() {
        return txtCategoria;
    }

    public By getTxtProducto() {
        return txtProducto;
    }

    public By getTxtCantidad() {
        return txtCantidad;
    }

    public By getBtnAgregar() {
        return btnAgregar;
    }

    public By getTxtHome() {
        return txtHome;
    }

    public By getTxtBuscar() {
        return txtBuscar;
    }

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getTxtProductoDos() {
        return txtProductoDos;
    }

    public By getBtnAgregarProd() {
        return btnAgregarProd;
    }
}
