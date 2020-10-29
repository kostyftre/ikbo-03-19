import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondEx {
    private final String REG = "^abcdefghijklmnopqrstuv18340$";
    private Pattern pattern;
    private Matcher matcher;

    public SecondEx(String input) {
        pattern = Pattern.compile(REG);
        matcher = pattern.matcher(input);
    }

    public boolean isLine(){
        return matcher.matches();
    }
}
