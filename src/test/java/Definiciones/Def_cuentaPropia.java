package Definiciones;

import Page.Cuenta;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Def_cuentaPropia {

    Cuenta cuenta;

    @When("Selecciono cuenta de abono a modificar")
    public void selecciono_cuenta_de_abono_a_modificar() {
        cuenta.validarRutCuenta();
    }

    @When("Presiono link {string}")
    public void presiono_link(String string) throws InterruptedException {
        cuenta.linkCuentaEditar();
    }

    @When("Ingreso en el campo Rut el valor {string}")
    public void ingreso_en_el_campo_rut_el_valor(String string) throws InterruptedException {
       cuenta.ingresarRutCuenta();
    }

    @When("Presiono boton siguiente {string}")
    public void presiono_boton_siguiente(String string) throws InterruptedException {
        cuenta.botonsgtecuenta();
    }

    @When("Selecciono en el campo banco el valor {string}")
    public void selecciono_en_el_campo_banco_el_valor(String string) throws InterruptedException {
        cuenta.seleccionarBanco();
    }

    @When("Selecciono en el campo Tipo de cuenta el valor {string}")
    public void selecciono_en_el_campo_tipo_de_cuenta_el_valor(String string) throws InterruptedException {
        cuenta.seleccionarCta();
    }

    @When("Ingreso en el campo Numero de cuenta el valor {string}")
    public void ingreso_en_el_campo_numero_de_cuenta_el_valor(String string) throws InterruptedException {
        cuenta.ingresoCuenta();
    }

    @When("Ingreso en el campo Confirmar Numero de cuenta el valor {string}")
    public void ingreso_en_el_campo_confirmar_numero_de_cuenta_el_valor(String string) throws InterruptedException {
        cuenta.ReingresoCuenta();
    }

    @When("Presiono boton para continuar  {string}")
    public void presiono_boton_para_continuar(String string) {
        cuenta.botonsgtecuentaingreso();
    }

    @When("En modal desplegado presiono boton {string}")
    public void en_modal_desplegado_presiono_boton(String string) {
        cuenta.botonconfirmarcontinuar();
    }

    @Then("Se despliega en pantalla mensaje indicando que cambio de cuenta de abono se encuentra en proceso")
    public void se_despliega_en_pantalla_mensaje_indicando_que_cambio_de_cuenta_de_abono_se_encuentra_en_proceso() {
        cuenta.validarmensajeExito();
    }



}
