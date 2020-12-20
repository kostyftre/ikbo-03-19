import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailChecker {
    private Pattern pattern;
    private Matcher matcher;

    public EmailChecker(String email) {
        pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        matcher = pattern.matcher(email);
    }

    public boolean isEmail(){
        return matcher.matches();
    }
}