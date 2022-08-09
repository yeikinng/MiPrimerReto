package com.dekosas.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EsperaExplicita {
    public static void esperaExplilicitaClick (By elemento, WebDriver driver) {
        WebDriverWait myWaitVar = new WebDriverWait(driver, 40);
        myWaitVar.until(ExpectedConditions.elementToBeClickable(elemento));
    }
    public void esperarExplilicitaTexto (WebDriver driver, By elemento){
        WebDriverWait myWaitVar = new WebDriverWait(driver, 40);
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }
    public void esperarCargaPagina (WebDriver driver){
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
}
