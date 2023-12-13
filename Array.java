public class Array{
    public static void main(String[] args){
        int arr[]={10, 20, 30, 40, 50, 60};

        int sum=0;
        int product = 1;

        for (int i : arr){
            sum += i;
            product *= i;

        }
        System.out.println("The sum is:" +sum);
        System.out.println("The product is:" +product);
        }
    }
