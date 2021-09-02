import java.util.Scanner;
public class question {
    public static void main(String [] args){

        Scanner input =new Scanner (System.in);


        //   question is print the largest number between three number



    System.out.println("enter the three numbers");

         int a=input.nextInt();
       int b=input.nextInt();
        

         int c=input.nextInt();


                  if(c>b && c>a)
                  {
         System.out.println(c);
         } 
            else if(b>a  && b<c ){
        System.out.println(b);

         }
         else{
             System.out.println(a);
         }
         input.close();




        
    }
    
}

// int max =Math.max(1,2);
// System.out.println(max);
// input.close();
//     }
// }