import java.util.Scanner;
public class ch18_ifelse {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter our age");
        Scanner sc= new Scanner(System.in);
        age = sc.nextInt();

        /*first ladder of if and else-if,when only
        * else wriiteen than one ladder stop  */

        if(age>56){
            System.out.println(" you are experienced");
        }
        else if(age>46){
            System.out.println("you are semi-experienced");
        }
        else if (age>36){
            System.out.println("you are78semi-semi-experienced");
        }
        else {
            System.out.println("you are not experinced");
        }
        //2nd ladder
        if (age>2){
            System.out.println("you are not baby");
        }


        //swith case,if we put age=18,21,60 than switch case work otherwise default print
        switch (age)
        {
            case 18:
                System.out.println("you are adult");
                break; //if we remove break than it print all next switch case
            case 21:
                System.out.println("you are young");
                break;
            case 60:
                System.out.println("you are retired");
            default :
                System.out.println("enjoy your life");
        }

    }
}
