// Write a program to input two numbers and print product of their sum and difference.
import java.util.Scanner;
class product
{
    public static void main (String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a,b,s,p,diff;
        System.out.println("Enter two Numbers");
        a=obj.nextInt();
        b=obj.nextInt();
        s=a+b;
        diff= a-b;
        p= s*diff;
        System.out.println("Product is " +p);

    }

}


