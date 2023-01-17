package Definiciones;

import Page.Contactos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Def_contactosEliminar {

    Contactos contactos;

    @When("Se despliega pantalla con contactos correspondiente a la organizacion seleccionad")
    public void se_despliega_pantalla_con_contactos_correspondiente_a_la_organizacion_seleccionad() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Presiono boton {string} de un contacto")
    public void presiono_boton_de_un_contacto(String string) throws InterruptedException {
        contactos.eliminarContacto();

    }
    @Then("Se despliega mensaje de exito de eliminacion")
    public void se_despliega_mensaje_de_exito_de_eliminacion() {
        contactos.validaTextoEliminar();
    }

}
