import java.util.*;

public class triangle {

    public static void main(String [] args){
        System.out.println("enter the three side of triangle");
        double area;
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if((a+b)>c || (b+c)>a || (c+a)>b){

        float s;
        s=(float)(a+b+c)/2;

        

        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println(area);
        }
    
}}
