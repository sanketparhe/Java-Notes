public class Practice {
    public static void main(String[] args){
        int arr[]={10, 20, 30, 40, 50, 60};

      System.out.println(arr[0]);


      System.out.println("*********************************");
        //array length
        for(int i=0; i<arr.length; i++){
            System.out.println(i);
        }

 System.out.println("*********************************");
        //reverce array
        for(int i=arr.length -1; i>=0; i--){
            System.out.println(i);
        }
 System.out.println("*********************************");
        for(int element:arr){
            System.out.println(element);
        }
    }
}
