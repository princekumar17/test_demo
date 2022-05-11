// write a program to input two numbers and print their sum ,product and difference.

import java.util.Scanner;
class Sample
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a,b,sum,product,difference;
        System.out.println("Enter a number");
        a=obj.nextInt();
        System.out.println("Enter next number");
        b=obj.nextInt();
        sum=a+b;
        product= a*b;
        difference=a-b;
        System.out.println("sum is " +sum);
        System.out.println("Product is " +product);
        System.out.println("Difference is " +difference);
    }

}