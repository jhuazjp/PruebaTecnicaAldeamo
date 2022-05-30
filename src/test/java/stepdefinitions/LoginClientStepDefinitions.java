package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.java.Log;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.Question;
import questions.ValidateLoginClient;
import taks.*;
import userinterfaces.LoginClientUserInterfaces;
import utilitis.EnviaromentProperties;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginClientStepDefinitions {

    private String URL;
    @Before
    public void getConfiguration(){

        OnStage.setTheStage(new OnlineCast());
        URL = EnviaromentProperties.getProperty("url_prueba");

    }

    @Given("El usuario ingresa a la pagina web")
    public void Elusuarioingresaalapaginaweb(){

        OnStage.theActorCalled("Juan Pablo").attemptsTo(Open.url(URL));

    }

    @When("El usuario registra sus datos correctamente")
    public void elUsuarioRegistraSusDatos() {

        OnStage.theActorCalled("Juan Pablo").attemptsTo(LoginClientInput.LoginClient());

    }

    @Then("El usuario valida el ingreso exitoso")
    public void elUsuarioValidaElRegistroExitoso() {

        theActorInTheSpotlight().should(
                seeThat(TextContent.of(LoginClientUserInterfaces.LABEL_VALIDATE_LOGIN),
                        equalTo("Products")));
    }


    @When("Ingresar Usuario bloqeuado e Ingresar Contraseña")
    public void ingresarUsuarioBloqeuadoEIngresarContraseña() {
        OnStage.theActorCalled("Juan Pablo").attemptsTo(LoginBlockInput.LoginBlockInput());
    }

    @Then("Validar no inicio de sesion exitoso por bloqueo")
    public void validarNoInicioDeSesionExitosoPorBloqueo() {
        theActorInTheSpotlight().should(
                seeThat(TextContent.of(LoginClientUserInterfaces.LABEL_VALIDATE_UnlOGIN),
                        equalTo("Epic sadface: Sorry, this user has been locked out.")));
    }

    @When("Ingresar Usuario incorrecto e Ingresar Contraseña")
    public void ingresarUsuarioIncorrectoEIngresarContraseña() {
        OnStage.theActorCalled("Juan Pablo").attemptsTo(LoginIncorrectUser.LoginIncorrectUser());
    }

    @Then("Validar no inicio de sesion exitoso por usuario")
    public void validarNoInicioDeSesionExitosoPorUsuario() {
        theActorInTheSpotlight().should(
                seeThat(TextContent.of(LoginClientUserInterfaces.LABEL_VALIDATE_UnlOGIN),
                        equalTo("Epic sadface: Username and password do not match any user in this service")));
    }

    @When("Ingresar Usuario  e Ingresar Contraseña incorrecto")
    public void ingresarUsuarioEIngresarContraseñaIncorrecto() {
        OnStage.theActorCalled("Juan Pablo").attemptsTo(LoginIncorrectPass.LoginIncorrectPass());
    }

    @Then("Validar no inicio de sesion exitoso por contraseña")
    public void validarNoInicioDeSesionExitosoPorContraseña() {
        theActorInTheSpotlight().should(
                seeThat(TextContent.of(LoginClientUserInterfaces.LABEL_VALIDATE_UnlOGIN),
                        equalTo("  Epic sadface: Username and password do not match any user in this service")));
    }

    @When("Ingresar Usuario  e Ingresar Contraseña performace")
    public void ingresarUsuarioEIngresarContraseñaPerformace() {
        OnStage.theActorCalled("Juan Pablo").attemptsTo(LoginClientPerformance.LoginClientPerformance());

    }
}
