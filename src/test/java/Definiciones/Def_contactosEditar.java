package Definiciones;

import Page.Contactos;
import Page.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Def_contactosEditar {

    Login login;
    Contactos contactos;


    @Given("Presiono boton editar {string}")
    public void presiono_boton_editar(String string) throws InterruptedException {
        contactos.editarContacto();
    }
    @When("Selecciono en el campo Cargo el valor {string}")
    public void selecciono_en_el_campo_cargo_el_valor(String string) throws InterruptedException {
        contactos.completareditarContacto();
    }
    @Then("Se despliega mensaje de exito")
    public void se_despliega_mensaje_de_exito() {
        contactos.validaTextoEditar();
    }
}
