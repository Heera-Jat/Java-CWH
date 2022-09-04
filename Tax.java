import java.util.Scanner;
public class Tax
{
	public static void main(String[] args) 
	{
	    //new tax System
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in Lakhs per annum");
        
        float tax = 0;
        float income = sc.nextFloat();
        
        if(income<=2.5){
          tax = tax + 0;
        }
        else if(income>2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income <= 7.5f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.1f * (income - 5f);
        }
        else if(income>7.5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.1f * (7.5f - 5f);
            tax = tax + 0.15f*(income -7.5f);
        }
        else if(income>10.0f && income <= 12.5f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.1f * (7.5f - 5f);
            tax = tax + 0.15f*(10f - 7.5f);
            tax = tax + 0.2f*(income - 10f);
        }
        else if(income>12.5f && income <= 15f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.1f * (7.5f - 5f);
            tax = tax + 0.15f*(10f -7.5f);
            tax = tax + 0.2f*(12.5f - 10f);
            tax = tax + 0.25f*(income - 12.5f);
        }
        else if(income>15f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.1f * (7.5f - 5f);
            tax = tax + 0.15f*(10f -7.5f);
            tax = tax + 0.2f*(12.5f - 10f);
            tax = tax + 0.25f*(15f - 12.5f);
            tax = tax + 0.3f*(income - 15f);
        }
        
        System.out.println("The total tax paid by the employee is: " + tax);
	}
}
