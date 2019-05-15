/*A program that checks prime number
  Author: Shina
  Date: 5/15/2019
  */
import java.util.Scanner;

public class CheckPrimeNumber{
    public static void main (String[]args){

        //importing object scanner
        Scanner input = new Scanner(System.in);

        int i;
        int m;
        int flag = 0;

        //A prompt to tell the user to enter a number
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        m = n/2;

        //A condition statement that ensures 1 and 0 is not a prime number (Since 1 and 0 aren't prime number)
        if(n==0 || n==1){
            System.out.println(n + " is not a prime number");
        }else
        {//For statement that checks for prime number and start from 2, (since prime number start from 2)
        //It does so by setting termination of the for loop t0 half of the number entered by the user using
        //variable m and loop through to check if the number is a prime number
            for (i = 2; i <= m; i++){
                //If statement actually performs the prime number test using the modulus
                if (n % i == 0){
                    System.out.println(n + "  is not prime number");
                    flag = 1;// flag variable is equal to 1 whenever the condition is true (i.e when the number is not a prime number)
                    break;
                }
            }
            if (flag == 0){//flag variable is equal to zero when the number is a prime number
                System.out.println(n + " is a prime number");
            }
        }
    }    
}  