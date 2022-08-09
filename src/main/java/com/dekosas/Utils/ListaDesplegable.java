package com.dekosas.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ListaDesplegable {

    public void seleccionarTextoVisible(WebDriver driver, By elemento, String texto ) {
        Select select = new Select(driver.findElement(elemento));
        select.selectByVisibleText(texto);

    }
}
