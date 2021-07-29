import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String Numberphone_REGEX= "^([0-9]{2,})-([0-9]{10,})$";
    public Validate(){}
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(Numberphone_REGEX);
        Matcher  matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
