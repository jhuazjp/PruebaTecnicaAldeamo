package taks;

import io.cucumber.java.sk.Tak;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import utilitis.Utils;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.LoginClientUserInterfaces.*;

public class LoginClientPerformance implements Task {


    public static Performable LoginClientPerformance(){
        return instrumented(LoginClientPerformance.class);
    }

    @Override
    @Step("{0} ingresa los datos")
    public <T extends Actor> void performAs(T actor) {

        String username = Utils.nameGeneratePerformance();
        String password = Utils.passwordGenerate();

        actor.attemptsTo(
                WaitUntil.the(BTN_LOGIN, WebElementStateMatchers.isClickable()),
                Enter.theValue(username).into(INPUT_USER_NAME),
                Enter.theValue(password).into(INPUT_USER_PASSWORD),
                Click.on(BTN_LOGIN),
                WaitUntil.the(LABEL_VALIDATE_LOGIN, WebElementStateMatchers.isVisible())

        );

    }


}
