/* Write a regular expression that matches German written dates.
    They are in the form dd.mm.yyyy, where the separator "." can
    also be "-" or a blank. The leading digit d or m can be omitted.
    Valid years are between 1900 and 2099. But the leading two yy
    can also be omitted.

    Take care that the unit tests have to pass in the order as given
    in this file here. Tests passing after one failed test will not
    count.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {

    public static Matcher getMatcher(String dateString) {
        Pattern p = Pattern.compile("^(\\d|[0-2]\\d|3[0-1])(\\.|-| )(\\d|0\\d|1[0-2])(\\.|-| )((19|20)?\\d\\d)?$");
        Matcher m = p.matcher(dateString);
        return m;
    }
}
