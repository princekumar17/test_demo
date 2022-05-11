import java.util.Scanner;
class Greater
{
    public static void main(String args[])
    {
    Scanner obj= new Scanner(System.in);
    int a,b;
    System.out.println("Enter two numbers");
    a=obj.nextInt();
    b=obj.nextInt();
    if (a>b)
    {
        System.out.println("A is greater");

    }
    else
    {
        System.out.println("B is greater");
        

    }
        

    }
    
}
