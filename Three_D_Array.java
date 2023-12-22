import java.io.*;
 

public class Three_D_Array {
    public static void main(String[] args)throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter plane of array");
        int plane=Integer.parseInt(br.readLine());
        System.out.println("Enter row array");
        int row=Integer.parseInt(br.readLine());
        System.out.println("Enter column array");
        int column=Integer.parseInt(br.readLine());
        int [][][] arr= new int [plane][row][column];
       System.out.println("Element of array");
        
        for (int i=0;i<plane;i++){
            for(int j=0;j<row;j++){
                for(int k=0;k<column;k++){
                  arr[i][j][k] =Integer.parseInt(br.readLine()); 
                }
                
        }
       
    }
    System.out.println("______");
for (int i=0;i<plane;i++){
            for(int j=0;j<row;j++){
                for(int k=0;k<column;k++){
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }

    }
}
