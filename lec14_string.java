public class lec14_string
{
    public static void main(String[] args)
    {
        String name = "Harry";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "     Harry     ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));

        System.out.println(name.replace('r', 'p'));
        System.out.println(name.replace("r", "ier"));

        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("dd"));

        System.out.println(name.charAt(4));

        String modifiedName = "Harryrryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry", 4));
        System.out.println(modifiedName.lastIndexOf("rry", 7));

        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("HarRY"));

        System.out.println("I am escape sequence\tdouble quote");


        //code practice with String name1=Heera
        String name1  = "Heera";
        System.out.println(name1);
        int value1 = name1.length();
        System.out.println(value1);

        String lstring1 = name1.toLowerCase();
        System.out.println(lstring1);

        String ustring1 = name1.toUpperCase();
        System.out.println(ustring1);

        String nonTrimmedString1 = "     Heera     ";
        System.out.println(nonTrimmedString1);

        String trimmedString1 = nonTrimmedString1.trim();
        System.out.println(trimmedString1);

        System.out.println(name1.substring(1));
        System.out.println(name1.substring(1,5));

        System.out.println(name1.replace('r', 'm'));
        System.out.println(name1.replace("r", "ier"));

        System.out.println(name1.startsWith("Hee"));
        System.out.println(name1.endsWith("dd"));

        System.out.println(name1.charAt(4));

        String modifiedName1 = "Heeraeereer";
        System.out.println(modifiedName1.indexOf("eer"));
        System.out.println(modifiedName1.indexOf("eer", 4));
        System.out.println(modifiedName1.lastIndexOf("eer", 7));

        System.out.println(name.equals("Heera"));
        System.out.println(name.equalsIgnoreCase("HeeRA"));

        System.out.println("I am escape sequence\tdouble quote");
    }
}

