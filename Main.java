import java.util.Scanner;
public class Main
{
public static void main( String [] args){
System.out.println("enter the numbers");
     Scanner inp = new Scanner(System.in);
     int num1= inp.nextInt();
     int num2=inp.nextInt();
   int sum=num1+num2;
     System.out.println("sum=" +sum);
     inp.close();


}
}