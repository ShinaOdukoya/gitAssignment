/*A program that checks prime number
  Author: Shina
  Date: 5/15/2019
  */
import java.util.Scanner;

public class CheckPrimeNumber{
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        int i;
        int m;
        int flag = 0;

        System.out.println("Enter a number: ");
        int n = input.nextInt();
        m = n/2;

        if(n==0 || n==1){
            System.out.println(n + " is not a prime number");
        }else
        {
            for (i = 2; i <= m; i++){
                if (n % i == 0){
                    System.out.println(n + "  is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println(n + " is a prime number");
            }
        }
    }    
}  