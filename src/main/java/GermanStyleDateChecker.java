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
        Pattern p = Pattern.compile("^([0-9]|[0-2][0-9]|3[0-1])(\\.|-| )([0-9]|0[0-9]|1[0-2])(\\.|-| )([0-9][0-9]|19[0-9][0-9]|20[0-9][0-9])?$"); //statt " " auch \\s möglich

        //(www\\.)?     optional www. zu beginn
        //(\\w)+        >=1 beliebige Zeichen
        //(-(\\w)+)*    0 oder mehrere Teile mit Bindestrichen
        //(\\.[a-z]+)+  Zum Schluss mindestens eine Domain mit .kleinzeichen
        //[A-Za-z0-9] => \\w
        //* => 0 oder mehrmals
        //+ => 1 oder mehrmals
        //? => 0 oder 1 mal
        Matcher m = p.matcher(dateString);
        return m;
    }
}
