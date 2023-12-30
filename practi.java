import java.io.*;
public class practi {
    public static void main(String[] args)throws Exception {
       BufferedReader br=new BufferedReader(new InputStreamReader( System.in)); 
       System.out.println("Enter First :");
       String a =  (br.readLine());

       System.out.println("Enter Second Value:");
       String b = (br.readLine());
       String c=a+b;
       System.out.println("Addition="+c);
    
    }

    
}
