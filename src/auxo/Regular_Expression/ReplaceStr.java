package auxo.Regular_Expression;

public class ReplaceStr {
    public static void main(String[] args) {
        String string="I am a string 77.yes I am pavithra I";
        System.out.println (string);
        String yourString=string.replaceAll("I","you");
        System.out.println (yourString);
        String alphanumeric="abcdefghijklmnhh";
        System.out.println("(alphanumeric.replaceAll ( \".\",\"y\" )):========="+ alphanumeric.replaceAll ( ".","y" ));
        System.out.println ("alphanumeric.replaceAll ( \"^abcDeee\",\"YYY\"====="+alphanumeric.replaceAll ( "^abcDeee","YYY" ));
        String secondString="abcDeeferrtvkjkjkjkjkjkjkjkjkjkjkjkjkjkjkj";
        System.out.println ("seCOND sTRING "+secondString.replaceAll ( "^abcDee","YYY" ));
       // System.out.println (alphanumeric.matches ( "^hello" ));
        System.out.println (alphanumeric.matches ( "^abcdfg" ));
        System.out.println (alphanumeric.matches ( "abcdefghijklmniiii" ));

    }
}
