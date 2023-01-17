package test;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//Describimos a travez de la anotación @RunWith el lanzador a nivel de clase, es decir esta clase se lanzara utilizando
//la clase de cucumber
@RunWith(Cucumber.class)


@CucumberOptions(
        features = "src/test/java/features",
        glue = {"seleniumgluecode"}
)

public class RunATC {
}