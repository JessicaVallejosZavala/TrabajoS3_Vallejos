package Definiciones;

import Page.Contactos;
import Page.Login;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Def_contactosAgregar {

    Contactos contactos;

    @When("Se despliega pantalla con listado de contactos correspondiente a la organizacion seleccionada")
    public void se_despliega_pantalla_con_listado_de_contactos_correspondiente_a_la_organizacion_seleccionada() {
        contactos.validartextoContactos();
    }

    @When("Selecciono link {string}")
    public void selecciono_link(String string) throws InterruptedException {
        contactos.linkAgregarcontacto();
    }

    @When("Completo formulario de ingreso de nuevo contacto")
    public void completo_formulario_de_ingreso_de_nuevo_contacto() throws InterruptedException {
        contactos.completarFormularioContacto();

    }

    @Then("Se despliega en pantalla mensaje satisfactorio")
    public void se_despliega_en_pantalla_mensaje_satisfactorio() {
        contactos.ValidaTextoAgregar();
    }

}
