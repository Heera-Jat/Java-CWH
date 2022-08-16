import java.util.Scanner;
public class lec13_string
{
    public static void main(String[] args)
    {
        String str1 = "CodeWithHarry";
        String str2 = "CodeWithHarry";
        System.out.println(str1 == str2);
        /* Returns true because st1 and st2 are referencing the same object
        present in the string constant pool. Now, let's see the case of the String object :*/

        String st1 = new String("Keep coding");
        String st2 = new String("Keep coding");
        System.out.println(st1 == st2);
        /*Although the value of both the string object is the same, still false is displayed as
        output because str1 and str2 are two different string objects created in the heap.
         That's why it is not considered a good practice two compare two strings using the == operator.
          use the equals() method to compare two strings in Java.*/

        //Different ways to print in Java :
        //We can use the following ways to print in Java:
        System.out.print(""); // No newline at the end
        System.out.println(""); // Prints a new line at the end
        System.out.printf("");
        System.out.format("");
        System.out.printf("") ; //%d for int, %f for float, %c for char, %s for string

        String name1 = new String("Harry");
        String name2 = "Harry";
        System.out.print("The name is: ");
        System.out.println(name2);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        System.out.format("The value of a is %d and value of b is %f", a, b);
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        System.out.println(string1);
        String string2 = sc.nextLine();
        System.out.println(string2);

    }
}

