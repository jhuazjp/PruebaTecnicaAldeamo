package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import userinterfaces.LoginClientUserInterfaces;

public class ValidateLoginClient implements Question<String> {

    @Override
    public String answeredBy (Actor actor){
        return BrowseTheWeb.as(actor).find(LoginClientUserInterfaces.LABEL_VALIDATE_LOGIN).getText();
    }

}
