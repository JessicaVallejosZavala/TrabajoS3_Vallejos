package Definiciones;

import Page.RepresentanteLegal;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Def_RepLegal {

RepresentanteLegal representanteLegal;

    @When("Presiono opcion editar RRLL {string}")
    public void presiono_opcion_editar_rrll(String string) {
        representanteLegal.ingresoRRLL();
    }

    @Then("se despliega pantalla con listado de representantes legales correspondientes a la organizacion seleccionada")
    public void se_despliega_pantalla_con_listado_de_representantes_legales_correspondientes_a_la_organizacion_seleccionada() {
        representanteLegal.validartextoRRLL();
    }

    @Then("Valido que los representantes legales correspondan a la organizacion seleccionada")
    public void valido_que_los_representantes_legales_correspondan_a_la_organizacion_seleccionada() {
        representanteLegal.validaRutRRLL();
    }




}
