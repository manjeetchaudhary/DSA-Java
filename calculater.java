import java.util.Scanner;
public class calculater {

    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        System.out.println("enter the numbers\n");
        int a=input.nextInt();
        int b=input.nextInt();

        int ans;
        char op;
        System.out.println("enter the operator5\n");

        op=input.next().charAt(0);

        if(op=='+'){
            ans=a+b;
            System.out.println(ans);
        }
        else if(op=='-'){
            ans=a-b;
            System.out.println(ans);
        }

        else if(op=='*'){
        ans=a*b;
        System.out.println(ans);}

        else if(op=='/' && b!=0){
            ans=a/b;
            System.out.println(ans);
        }
        else if(op=='%'){
            ans=a%b;
            System.out.println(ans);
        }
        else {
            System.out.println("Please enter a valid operator.");
        }

    }
    
}
