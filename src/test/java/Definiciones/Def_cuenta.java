package Definiciones;
import Page.Cuenta;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Def_cuenta {

    Cuenta cuenta;

    @When("Presiono opcion cuentas {string}")
    public void presiono_opcion_cuentas(String string) throws InterruptedException {
        cuenta.editarCuenta();
    }

    @Then("se despliega pantalla con listado de cuentas de abonos correspondiente a la organizacion seleccionada")
    public void se_despliega_pantalla_con_listado_de_cuentas_de_abonos_correspondiente_a_la_organizacion_seleccionada() {
        cuenta.validarPantallaCuenta();
    }

    @Then("Valido que cuentas desplegadas corresponden a la organizacion seleccionada")
    public void valido_que_cuentas_desplegadas_corresponden_a_la_organizacion_seleccionada() {
        cuenta.validarRutCuenta();
    }


}
