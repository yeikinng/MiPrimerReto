package com.dekosas.StepDefintions;

import com.dekosas.Steps.ComprasStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;


public class ComprasStepDefinition {

    @Steps
    ComprasStep comprasStep;

    @Dado("^el usuario se encuentre en la opcion toda la tienda$")
    public void el_usuario_se_encuentre_en_la_opcion_toda_la_tienda() {
        comprasStep.seleccionarTienda();
    }


    @Cuando("^el usuario encuentre los productos que desea$")
    public void el_usuario_encuentre_los_productos_que_desea() throws IOException {
        comprasStep.seleccionarCocina();
        comprasStep.seleccionarCategoria();
        comprasStep.seleccionarProducto();
        comprasStep.seleccionarCantidad();
        comprasStep.clicAgregar();
        comprasStep.regresarHome();
        comprasStep.buscarProducto();
        comprasStep.clicBuscar();
        comprasStep.SelecionarSegundoProducto();


    }

    @Cuando("^el de clic en agregar al carrito$")
    public void el_de_clic_en_agregar_al_carrito() {
        comprasStep.clicAgregarProducto();
    }

    @Entonces("^el visualizara los productos en el carrito de compras$")
    public void el_visualizara_los_productos_en_el_carrito_de_compras() {

    }


}
