import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Practice {

    public class PrimeExample{  
        public static void main(String args[]){  
         int i,m=0,flag=0;    
         int n = Integer.parseInt(br.readLine()); 
         m=n/2;    
         if(n==0||n==1){
          System.out.println(n+" is not prime number");    
         }else{
          for(i=2;i<=m;i++){    
           if(n%i==0){    
            System.out.println(n+" is not prime number");    
            flag=1;    
            break;    
           }    
          }    
          if(flag==0)  { System.out.println(n+" is prime number"); }
         }//end of else
       }  
       } 
       

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char c ='y';
        do{
            System.out.println("Enter the number for checking even number :");
            int num1 = Integer.parseInt(br.readLine());
            //call to the method
            boolean ans = Demo3.checkIsEvenOrOdd(num1);
            if(ans){
                System.out.println("The number is even");
            }else{
                System.out.println("The number is odd");
            }


            System.out.println("Enter the number for print till that number");
            int num2 = Integer.parseInt(br.readLine());

            //create Object for calling method
            Demo3 obj1 = new Demo3();
            obj1.printTheNumber(num2);

            System.out.println();
            System.out.println("Do you want to continue ?");
            int ans1 = br.read();
            c = (char)ans1;
            br.skip(1);
        }while(c == 'y' || c == 'Y');


    }

}
