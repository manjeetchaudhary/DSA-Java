
import java.util.Scanner;
public class fibonacci {
    public static void main(String [] ards){

        System.out.println("enter the n th number");
        Scanner input=new Scanner(System.in);

        int n=input.nextInt();

        int a=0;
        int b=1;
        int c=0;
        for(int i=0; i<=n-3;i++){
            c=a+b;
            
            a=b;
            b=c;
            
        }
        System.out.println(c); 
    }
    
}
