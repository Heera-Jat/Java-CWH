public class Main 
{
    public static void main(String[] args) 
    {
        // 1. Arithmetic Operators
        int a = 14;
        int b = a+3;
        System.out.println(b);
        
        int c = 19;
        int d = c%3;    //modulo Operator
        System.out.println(d);
        
        double f=3.4;
        double g=f%1.1;          //Returns Decimal Remainder
        System.out.println(g);
        
        // 2. Assignment Operators
        int e = 9;
            e*= 3;
        System.out.println(e);

        // 3. Comparison Operators
         System.out.println(64<60);

        // 4. Logical Operators
        System.out.println(64>5 && 64>98);
        System.out.println(64>5 || 64>98);

        // 5. Bitwise Operators
        System.out.println(2&3);
        System.out.println(1&1);
        System.out.println(0&1);
        System.out.println(1&3);
        
    }
}
