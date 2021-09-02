
import java.util.Scanner;
public class area {

    public static void main(String[] args){

    
    // area of circle
    Scanner input=new Scanner(System.in);
   

    System.out.println("enter the value radius:");
    int radus;
    int radius=input.nextInt();

    float pi=3.14f;
float area;
    
    area=pi*radius*radius;

    System.out.println(area);

    

    

    }
}
