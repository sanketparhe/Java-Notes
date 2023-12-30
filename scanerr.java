import java.util.Scannerr;

class Scannerr{
    public static void main(String[] args){
     
     byte  a, b, c;

     Scannerr Sc = new Scanner(System.in);

     System.out.println("Enter your physics marks");
      a = sc.nexByte();
      System.out.println("Enter your chemistry marks");
      b = sc.nextByte();
      System.out.println("Enter your Mathematics marks");
      c = sc.nextByte();

      float avg = (a+b+c)/3.0f;

      if(avg>=40 a>=35 && b>=35 && c>=35){
        System.out.println("your pass");
      }else
        System.out.println("Your Fail");
      }



    }
}