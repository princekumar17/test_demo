import java.util.Scanner;
class Switch
{
    public static void main(String args[])
    {
    Scanner obj= new Scanner(System.in);
    int button;
    System.out.println("Enter a button");
    button= obj.nextInt();
    switch(button)
    {
        case 1: System.out.println("Hello");
                break;
               
        case 2: System.out.println("Namaste");
                break;

        case 3: System.out.println("Bonjour");        
                break;

        default:System.out.println("Wrong Input");        
    }
    }
}
