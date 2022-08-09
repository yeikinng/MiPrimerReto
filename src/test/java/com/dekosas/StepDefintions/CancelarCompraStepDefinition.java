package com.dekosas.StepDefintions;

import com.dekosas.Steps.CancelarCompraStep;
import com.dekosas.Steps.ComprasStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class CancelarCompraStepDefinition {



    @Steps
    CancelarCompraStep cancelarCompraStep;



    @Dado("^el usuario se encuentra en el menu toda la tienda$")
    public void el_usuario_se_encuentra_en_el_menu_toda_la_tienda() {
        cancelarCompraStep.oprimirMenuTienda();
    }


    @Cuando("^el usuario añade los productos al carrito$")
    public void el_usuario_añade_los_productos_al_carrito() {
        cancelarCompraStep.presionarCategoriaCocina();
        cancelarCompraStep.presionarSubCategoria();
        cancelarCompraStep.seleccionarProductoUno();
        cancelarCompraStep.agregarProducto();
        cancelarCompraStep.RetrocederPagina();
        cancelarCompraStep.seleccionarProductoDos();
        cancelarCompraStep.agregarProductoDos();
        cancelarCompraStep.RetrocederPagina();
        cancelarCompraStep.seleccionarProductoTres();
        cancelarCompraStep.agregarProductoTres();
    }

    @Cuando("^el cancela la compra de los productos$")
    public void el_cancela_la_compra_de_los_productos() throws IOException {
        cancelarCompraStep.PresionarBotonCaja();
        cancelarCompraStep.ingresarNombre();
        cancelarCompraStep.ingresarApellido();
        cancelarCompraStep.ingresarDireccion();
        cancelarCompraStep.seleccionarPais();
        cancelarCompraStep.seleccionarEstado();
        cancelarCompraStep.seleccionarCiudad();
        cancelarCompraStep.ingresarTelefono();
        cancelarCompraStep.seleccionarTipoId();
        cancelarCompraStep.ingresarNumid();
        cancelarCompraStep.presionarSiguiente();
        cancelarCompraStep.presionarCarrito();
        cancelarCompraStep.verCarrito();
        cancelarCompraStep.eliminarProductos();

    }

    @Entonces("^el visualizara carrito de compras vacio$")
    public void el_visualizara_carrito_de_compras_vacio() {

    }



}
