class Assign{
    public static void main(String[] args){
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=4; j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=4; j++){
        //         System.out.print(" 1 ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=4; j++){
        //         System.out.print(" "+j);
        //     }
        //     System.out.println();
        // }

        //    for(int i=0; i<=4; i++){
        //     for(int j=1; j<=4; j++){
        //         System.out.print(j*i+" ");
        //     }
        //     System.out.println();
        //    }

        // for (int i=1; i<=4; i++){
        //     for(int j=1; j<=4; j++){
        //         if(j%2==0){
        //             System.out.print(2+" ");
        //         }else{
        //             System.out.print(1+" ");
        //         }
        //     }
        //     System.out.println();
            
        // }
          
          int num =1;
          int rowCount=0;
        for(int i=1; i<=3; i++){
             
            for(int j=1; j<=4; j++){
               
                System.out.print((num+num)+" ");
                   rowCount=rowCount+(num+num);
                    num++;
                   
            }
              System.out.print("");
              System.out.println(rowCount);
               
        }
         
    }
}