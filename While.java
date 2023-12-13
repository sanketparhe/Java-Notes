class WhileLoop {
    public static void main(String[] args) {

System.out.println("**Q1.****************** Reverce Number *************");

        int num = 32157;
        int rem=0;
        int ans =0;
        while(num!=0){
        rem=num%10;
        ans=ans*10+rem;
        num=num/10;
        }
        System.out.println(ans);


System.out.println("**Q2.****************** Automorphic Number *************");

        int num1 = 42;
        int num2 = num1 * num1;
        System.out.println("Given number is:"+num1);
        System.out.println("Square of given number is:"+num2);
        int cnt = 1;
        int ans1 = 0;
        int prevNum = 0;
        int lastNum = 0;
            
        while (num2 != 0){ 
              
        if (cnt % 2 != 0) {
            lastNum = num2 % 10;
            cnt++;

        } else {
            prevNum = num2 % 10;
            cnt++;
        }
        ans1 = prevNum * 10 + lastNum;
       
        if (ans1 == num1) {
            System.out.print("It is automorphic");
            break;
        } 
        num2 = num1 / 10;
    }
     if(ans1==num1){
         
     }

    }
}