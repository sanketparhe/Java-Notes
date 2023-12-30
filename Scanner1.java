import java.util.Scanner;
class Scann{
    public static void main(String[] args){
        System.out.println("Taking input from the user");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No 1");
        //int a = sc.nextInt();
        float a = sc.nextFloat();
         System.out.println("Enter No 2");
        //int b = sc.nextInt();
        float b = sc.nextFloat();
        float sum = a+b;
        System.out.println("This sum of this number is");
        System.out.println(sum);

    }
}