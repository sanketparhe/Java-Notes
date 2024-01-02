import java.util.*;  
  
//Creating PrimeNumber class  
public class PrimeNumber{      
    //Creating check() method to ensure whether the given number is prime number or not  
    static Boolean check(int number){    
        int i,m=0,flag=0;        
        m=number/2;   
          
        //Returning false when the number is either 0 or 1 because 0 and 1 cannot be prime numbers   
        if(number==0||number==1){    
            return false;        
        }else{  
            //When the number is not 0 and 1  
            for(i=2;i<=m;i++){        
                if(number%i==0){        
                    return false;        
                }           
            }        
            return true;   
        }//end of else    
    }    
    public static void main(String args[]){      
        for(int i=0; i<=50; i++){  
            if(check(i)){  
                System.out.println(i+" is a Prime number");  
            }  
        }  
    }  
}  