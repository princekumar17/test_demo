// Wap to input the values of A & B and print the cube of their sum and cube of their product.
import java.util.Scanner;
class cube
{
    static Scanner obj = new Scanner(System.in);
    public static void main(String args[])
    {
    int a,b,sum,prod;
    double cuberoot1,cuberoot2;
    System.out.println("Enter two number");
        a = obj.nextInt();
        b = obj.nextInt();
        sum=a+b;
        prod=a*b;
        cuberoot1=Math.pow(sum, 1.0/3);
        cuberoot2=Math.pow(prod, 1.0/3);
        System.out.println("Cuberoot of Sum is" +cuberoot1);
        System.out.println("Cuberoot of product is" +cuberoot2);


    }   


}
