package taks;

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
import static userinterfaces.LoginClientUserInterfaces.BTN_LOGIN;

public class LoginIncorrectPass implements Task {

    public static Performable LoginIncorrectPass(){
        return instrumented(LoginIncorrectPass.class);
    }

    @Override
    @Step("{0} ingresa los datos")
    public <T extends Actor> void performAs(T actor) {

        String username = Utils.nameGenerate();
        String password = Utils.passwordGenerateError();

        actor.attemptsTo(
                WaitUntil.the(BTN_LOGIN, WebElementStateMatchers.isClickable()),
                Enter.theValue(username).into(INPUT_USER_NAME),
                Enter.theValue(password).into(INPUT_USER_PASSWORD),
                Click.on(BTN_LOGIN)
        );

    }

}
