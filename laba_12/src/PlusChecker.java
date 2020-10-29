import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlusChecker {
    private Pattern pattern;
    private Matcher matcher;

    public PlusChecker(String line) {
        pattern = Pattern.compile("[0-9]+ \\+");
        matcher = pattern.matcher(line);
    }

    public boolean hasPlus(){
        return matcher.find();
    }
}