// write a program to input a no. and priint its square root & cube root.
import java.util.Scanner;
class square
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);

        int a;
        double sqroot,cuberoot;
        System.out.println("Enter a number");
        a=obj.nextInt();

        sqroot=Math.sqrt(a);
        cuberoot=Math.pow(a, 1.0/3);
        System.out.println("Square Root is"+sqroot);
        System.out.println("Cue Root is "+cuberoot);


        

    }
}
