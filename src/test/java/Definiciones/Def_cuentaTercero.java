package Definiciones;

import Page.Cuenta;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Def_cuentaTercero {
//agrego cuarto commit
    Cuenta cuenta;

    @When("Ingreso en el campo Rut el valor distinto al rut de la organizacion {string}")
    public void ingreso_en_el_campo_rut_el_valor_distinto_al_rut_de_la_organizacion(String string) throws InterruptedException {
        cuenta.ingresarRutCuentaTercero();
    }

    @When("Ingreso en el campo nombre el valor {string}")
    public void ingreso_en_el_campo_nombre_el_valor(String string) throws InterruptedException {
        cuenta.NombreCuenta();
    }

    @When("Ingreso en el campo Apellido el valor {string}")
    public void ingreso_en_el_campo_apellido_el_valor(String string) throws InterruptedException {
        cuenta.ApellidoCuenta();
    }

    @And("En modal desplegado presiono link {string} y selecciono documento")
    public void enModalDesplegadoPresionoLinkYSeleccionoDocumento(String arg0) throws InterruptedException {
        cuenta.AdjuntarDcto();
    }



}
