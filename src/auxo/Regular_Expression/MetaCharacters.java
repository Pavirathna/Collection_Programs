package auxo.Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner ( System.in );
        String string = sc.next ();
        System.out.println ( "metacharacters d...." );//d means digit

        System.out.println ( Pattern.matches ( "\\d", "abc" ) );//false (non-digit)
        System.out.println ( Pattern.matches ( "\\d", "1" ) );//true (digit and comes once)
        System.out.println ( Pattern.matches ( "\\d", "4443" ) );//false (digit but comes more than once)
        System.out.println ( Pattern.matches ( "\\d", "323abc" ) );//false (digit and char)

        System.out.println ( "metacharacters D...." );//D means non-digit

        System.out.println ( Pattern.matches ( "\\D", "abc" ) );//false (non-digit but comes more than once)
        System.out.println ( Pattern.matches ( "\\D", "1" ) );//false (digit)
        System.out.println ( Pattern.matches ( "\\D", "4443" ) );//false (digit)
        System.out.println ( Pattern.matches ( "\\D", "323abc" ) );//false (digit and char)
        System.out.println ( Pattern.matches ( "\\D", "m" ) );//true (non-digit and comes once)

        System.out.println ( "metacharacters D with quantifier...." );
        System.out.println ( Pattern.matches ( "\\D*", "mak" ) );//true (non-digit and may come 0 or more times)
        System.out.println ( "Pattern.matches ( \"\\\\s\"" + string + "->" + Pattern.matches ( "\\s", string ) );
        System.out.println ( "Pattern.matches ( \"\\\\S\"" + string + "->" + Pattern.matches ( "\\S", string ) );
        System.out.println ( "Pattern.matches ( \"\\\\w\"" + string + "->" + Pattern.matches ( "\\w", string ) );
        System.out.println ( "Pattern.matches ( \"\\\\W\"" + string + "->" + Pattern.matches ( "\\W", string ) );
        System.out.println ( "Pattern.matches(\"[a-zA-Z0-9]{6}\", \"arun32->" + Pattern.matches ( "[a-zA-Z0-9]{6}", "arun32" ) );//true
        System.out.println ( "Pattern.matches(\"[a-zA-Z0-9]{6}\", \"kkvarun32-->" + Pattern.matches ( "[a-zA-Z0-9]{6}", "kkvarun32" ) );//false (more than 6 char)
        System.out.println ( "Pattern.matches(\"[a-zA-Z0-9]{6}\", \"JA2Uk2-->" + Pattern.matches ( "[a-zA-Z0-9]{6}", "JA2Uk2" ) );//true
        System.out.println ( "Pattern.matches(\"[a-zA-Z0-9]{6}\", \"arun$2-->" + Pattern.matches ( "[a-zA-Z0-9]{6}", "arun$2" ) );//false ($ is not matched)
        System.out.println ( "Enter your mobile number to check wheater the mobile number is valid or not " );
        String mobnum = sc.next ();
        System.out.println ( "by character classes and quantifiers ..." );

        System.out.println ( "Pattern.matches(\"[789]{1}[0-9]{9}-->" + Pattern.matches ( "[789]{1}[0-9]{9}", mobnum ) );//true
        System.out.println ( "Pattern.matches(\"[789][0-9]{9}-->" + Pattern.matches ( "[789][0-9]{9}", mobnum ) );//true
        System.out.println ( Pattern.matches ( "[789][0-9]{9}", "99530389490" ) );//false (11 characters)
        System.out.println ( Pattern.matches ( "[789][0-9]{9}", "6953038949" ) );//false (starts from 6)
        System.out.println ( Pattern.matches ( "[789][0-9]{9}", "8853038949" ) );//true

        Pattern pattern = Pattern.compile ( "\\W" );
        String[] words = pattern.split ( "one@two#three:four$five" );
        for (String s : words) {
            System.out.println ( "Split using Pattern.split(): " + s );
        }
        pattern = Pattern.compile("1*2");
        Matcher matcher = pattern.matcher ( "11234512678" );
        System.out.println("Using replaceAll: " + matcher.replaceAll("_"));
        System.out.println ("using replacefirst :"+matcher.replaceFirst ( "*" ));
        System.out.println ("using replacefirst :"+matcher.replaceAll ( "*" ));
    }
}

