package utilitis;

import com.github.javafaker.Faker;

public class Utils {

    public static String nameGenerate(){
        return "standard_user";
    }

    public static String passwordGenerate(){return "secret_sauce";}

    public static String nameGenerateError(){
        return "standard_user_error";
    }

    public static String passwordGenerateError(){return "secret_sauce_error";}

    public static String nameGenerateBlock(){return "locked_out_user";}

    public static String nameGeneratePerformance(){return "performance_glitch_user";}
}
