package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginClientUserInterfaces {


    public static final Target INPUT_USER_NAME = Target.the("user_name").
            located(By.id("user-name"));
    public static final Target INPUT_USER_PASSWORD = Target.the("user_password").
            located(By.xpath("//input[@id='password']"));
    public static final Target BTN_LOGIN = Target.the("user_btn_login").
            located(By.xpath("//input[@id='login-button']"));
    public static final Target LABEL_VALIDATE_UnlOGIN = Target.the("Label_unlogin").
            located(By.xpath("//h3[@data-test='error']"));
    public static final Target LABEL_VALIDATE_LOGIN = Target.the("Label_login").
            located(By.xpath("//span[@class='title']"));

}
