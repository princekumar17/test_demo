// hollow rectangle pattern.
import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
    Scanner obj= new Scanner(System.in);
    int n=4;
    int m=5;
    int i,j;
    for(i=1 ; i<=n ; i++)
    {
        for (j=1; j<=m ; j++)
        {
            if(i==1 || j==1 || i==n || j==m){
                System.out.print("*");
            }
            else{
                 System.out.print(" ");   
            }
        }
        System.out.println("");
    }

    }
}    