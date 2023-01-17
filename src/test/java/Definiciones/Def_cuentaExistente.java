package Definiciones;

import Page.Cuenta;
import io.cucumber.java.en.When;

public class Def_cuentaExistente {

    Cuenta cuenta;


    @When("Selecciono opcion {string}")
    public void selecciono_opcion(String string) throws InterruptedException {
        cuenta.opcionCtaExistente();
    }

    @When("Selecciono en combobox cuenta de abono el valor {string}")
    public void selecciono_en_combobox_cuenta_de_abono_el_valor(String string) throws InterruptedException {
       cuenta.SeleccionCuentaExistente();
    }

}
