class Demo2{
    public static void main(String args []){

          System.out.println("**Q1.*******************************");

        for(int i=1; i<=5; i++){
            char C='E';
            for(int j=1; j<=5; j++){
                System.out.print(" "+C );
                C--;
            }
            System.out.println();
        }
        System.out.println();



        System.out.println("**Q2.*******************************");

        

        char b=69;
        System.out.println(b);


         System.out.println("**Q3.*******************************");
           
           int num1=1;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
             System.out.print(num1++); 
            }
            num1--;
            System.out.println();
        }

         System.out.println("**Q4.*******************************");

          int num2=6;
        for(int i=1; i<=60; i++){
             if(i%num2==0){
                 System.out.println(i);
              
                
            }
        }

         System.out.println("**Q5.*******************************");

         int num3=6;
        for(int i=1; i<=10; i++){
              
                 System.out.println(i*num3);
              }

               System.out.println("**Q6.*******************************");

           int num4=2;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                 if(j%num4==0){ 
                    System.out.print( " "+j+" ");
                 }else{
                    System.out.print(i*j);
                 }
            }
            System.out.println();
        }

         System.out.println("**Q7.*******************************");

        
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i *j + " ");
            }
            System.out.println();
        }

         System.out.println("**Q8.************************************");

         int count=0;
         for(int i=2; i<=100; i++){
            for(int j=2; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==1){
                System.out.println(i);
            }else{
                count=0;
            }
         }

         
         
        
    }
}