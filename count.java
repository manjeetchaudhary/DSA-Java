public class count {
    public static void main(String [] args){

        int a=455557;
         int count=0;
         

         while(a>0){
             int rem=a%10;
             a=a/10;
             if(rem==5)
             count++;
         }
System.out.println(count);
    }
    
}
