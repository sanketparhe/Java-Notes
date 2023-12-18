import java.io.*;
 

public class One_D_Array {
    public static void main(String[] args)throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length of array:");
        int num=Integer.parseInt(br.readLine());
        int []arr1=new int[num];
        for (int i=0; i<arr1.length; i++){
            arr1[i]=Integer.parseInt(br.readLine());
        }
        System.out.print("[");
        for(int j=0; j<num; j++){
            System.out.println(arr1[j]+" ]");
        }
    
    }
    
}
