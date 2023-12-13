public class Assignment4 {
    public static void main(String[] args) {

        System.out.println("**Q1.********************** Pythagorean Theorem ******************");
        int side1 = 3;
        int side2=4;
        int Hypotenuse = 5;

        if(side1*side1 + side2*side2 == Hypotenuse*Hypotenuse){
            System.out.println("Triangle Satisfies the Pythagorean Theorem.");
        }else{
            System.out.println("Triangle Not Satisfies the Pythagorean Theorem.");
        }

        System.out.println("**Q4.**********************---******************");
         
        int a=1;
        for(int i=1; i<=4; i++){
           for(int j=1; j<=4; j++){
            System.out.print(" "+i*j );
            i++;
           }
           System.out.println();
        }
    }
}
