package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import userinterfaces.LoginClientUserInterfaces;

public class ValidateErrorClient implements Question<String> {

    @Override
    public String answeredBy (Actor actor){
        return BrowseTheWeb.as(actor).find(LoginClientUserInterfaces.LABEL_VALIDATE_UnlOGIN).getText();
    }

}
