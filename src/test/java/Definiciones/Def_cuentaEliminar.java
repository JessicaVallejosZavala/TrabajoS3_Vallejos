package Definiciones;

import Page.Cuenta;
import io.cucumber.java.en.When;

public class Def_cuentaEliminar {

    Cuenta cuenta;


    @When("Selecciono opcion eliminar {string}")
    public void selecciono_opcion_eliminar(String string) throws InterruptedException {
        cuenta.opcionEliminar();
    }
}
