package Definiciones;

import Page.Contactos;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import Page.Login;
import Page.Contactos;

public class Def_contactos {
    WebDriver driver;

    Login login;
    Contactos contactos;


    @Given("Ingreso al sitio Portal privado")
    public void ingresoAlSitioPortalPrivado() throws InterruptedException {
        login.iniciarSesion();
    }
    @Given("Ingreso en el campo Rut persona el valor {string}")
    public void ingreso_en_el_campo_rut_persona_el_valor()  {login.IngresarRut(); }

    @Given("Ingreso en el campo contraseña el valor {string}")
    public void ingreso_en_el_campo_contraseña_el_valor() {login.IngresarPass();}

    @Given("Presiono boton ingresar {string}")
    public void presiono_boton_ingresar() { login.BotonIngresar();}

    @When("Selecciono en el dropdown Organizacion el valor {string}")
    public void selecciono_en_el_dropdown_organizacion_el_valor() {login.Organizacion(); }

    @When("Presiono boton {string}")
    public void presiono_boton() { login.BotonSesion();}

    @When("Visualizo pantalla inicial con  menu lateral")
    public void visualizo_pantalla_inicial_con_menu_lateral() {
        contactos.validarmenu();
    }
    @When("Presiono en el menu desplegado a la izquierda opcion {string}")
    public void presiono_en_el_menu_desplegado_a_la_izquierda_opcion() { contactos.ingresoATC();}

    @When("Se despliega pantalla inicial de Administra tu comercio")
    public void se_despliega_pantalla_inicial_de_administra_tu_comercio() {contactos.validaTextoATC();}
    @When("Presiono opcion {string}")
    public void presiono_opcion(String string) throws InterruptedException {contactos.AgregarNuevoContacto();}
    @Then("se despliega pantalla con listado de contactos correspondiente a la organizacion seleccionada")
    public void se_despliega_pantalla_con_listado_de_contactos_correspondiente_a_la_organizacion_seleccionada() {
        contactos.validartextoContactos();
    }

    @And("Presiono boton iniciar {string}")
    public void presionoBotonIniciar(String arg0) {
        login.BotonSesion();
    }
}
